package com.example.demo.service;

import com.example.demo.dto.SearchDTO;
import com.example.demo.dto.ServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class SearchService {
    @Autowired
    FetchService fetchService;
    @Autowired
    ParserService parserService;

    public List<ServiceDTO> searchForServices(SearchDTO searchDTO) throws IOException {
        var htmlContent = fetchService.searchForServices(searchDTO);
        return parserService.extractServices(htmlContent);
    }
}
