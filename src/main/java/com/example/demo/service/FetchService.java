package com.example.demo.service;

import com.example.demo.dto.SearchDTO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FetchService {

    RestTemplate restTemplate;
    String rootUrl = "https://panoramafirm.pl/szukaj";
    SearchFormatter searchFormatter;

    public FetchService(SearchFormatter searchFormatter) {
        this.searchFormatter = searchFormatter;
        this.restTemplate = new RestTemplateBuilder()
                .build();
    }

    String searchForServices(SearchDTO searchDTO) {
        return restTemplate.getForEntity("https://panoramafirm.pl/szukaj?" + searchFormatter.topQueryParams(searchDTO), String.class).getBody();
    }
}
