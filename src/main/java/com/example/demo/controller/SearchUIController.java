package com.example.demo.controller;

import com.example.demo.dto.SearchDTO;
import com.example.demo.dto.ServiceDTO;
import com.example.demo.service.SearchService;
import com.example.demo.service.ServiceToVCardConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SearchUIController {

    @Autowired
    SearchService service;
    @Autowired
    ServiceToVCardConverter serviceToVCardConverter;

    @RequestMapping("/ui/search")
    String getSearchPage(@RequestParam(required = false) String location, @RequestParam(required = false) String type, Model model) throws IOException {
        if(location != null && type != null) {
            var services = service.searchForServices(SearchDTO.builder()
                    .location(location)
                    .serviceType(type)
                    .build());
            model.addAttribute("services", services);
        }
        return "index";
    }

    @PostMapping("/ui/vcard")
    String convertToVCard(@ModelAttribute ServiceDTO serviceDTO, HttpServletResponse httpServletResponse) {
        httpServletResponse.setContentType("text/vcard");
        httpServletResponse.setHeader("Content-Disposition", "attachment; filename=service.vcf");
        return serviceToVCardConverter.convertIntoVCard(serviceDTO);
    }
}
