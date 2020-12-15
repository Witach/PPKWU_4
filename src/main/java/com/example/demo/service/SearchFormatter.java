package com.example.demo.service;

import com.example.demo.dto.SearchDTO;
import org.springframework.stereotype.Component;

@Component
public class SearchFormatter {

    String template = "k=%s&l=%s";

    String topQueryParams(SearchDTO searchDTO) {
        return String.format(template, searchDTO.getServiceType().replace(" ", "+"), searchDTO.getLocation().replace(" ", "+").replace(",", "%2C"));
    }
}
