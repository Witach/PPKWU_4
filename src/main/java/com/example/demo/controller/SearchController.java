package com.example.demo.controller;

import com.example.demo.dto.SearchDTO;
import com.example.demo.dto.ServiceDTO;
import com.example.demo.service.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@Slf4j
public class SearchController {

    @Autowired
    SearchService searchService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/search")
    List<ServiceDTO> searchForServices(@RequestBody SearchDTO searchDTO) throws IOException {
        log.info("Searched for " + searchDTO);
        return searchService.searchForServices(searchDTO);
    }
}
