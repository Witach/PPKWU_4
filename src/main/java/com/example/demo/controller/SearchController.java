package com.example.demo.controller;

import com.example.demo.dto.SearchDTO;
import com.example.demo.dto.ServiceDTO;
import com.example.demo.service.SearchService;
import com.example.demo.service.ServiceToVCardConverter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Provider;
import java.util.List;

@RestController
@Slf4j
public class SearchController {

    @Autowired
    SearchService searchService;

    @Autowired
    ServiceToVCardConverter serviceToVCardConverter;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/search")
    List<ServiceDTO> searchForServices(@RequestBody SearchDTO searchDTO) throws IOException {
        log.info("Searched for " + searchDTO);
        return searchService.searchForServices(searchDTO);
    }

    @GetMapping("/vcard")
    String convertToVCard(@RequestBody ServiceDTO serviceDTO, HttpServletResponse httpServletResponse) {
        httpServletResponse.setContentType("text/vcard");
        httpServletResponse.setHeader("Content-Disposition", "attachment; filename=service.vcf");
        return serviceToVCardConverter.convertIntoVCard(serviceDTO);
    }
}
