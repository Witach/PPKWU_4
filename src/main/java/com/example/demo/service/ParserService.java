package com.example.demo.service;

import com.example.demo.dto.ServiceDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Service
public class ParserService {


    public List<ServiceDTO> extractServices(String htmlContent) throws IOException {
        var targetStream = new ByteArrayInputStream(htmlContent.getBytes());
        var listOfServices = new LinkedList<ServiceDTO>();
        var tag = Jsoup.parse(targetStream, "UTF-8", "").body();
        var companyCards = tag.select("a[title=Zobacz informacje szczegółowe o firmie]");
        for (Element el: companyCards) {
            var service = el;
            if(service == null) {
                continue;
            }
            var name = service.attr("title");
            var href = service.attr("href");
            var serviceDTO = ServiceDTO.builder()
                    .href(href)
                    .name(name)
                    .build();
            listOfServices.add(serviceDTO);
        }
        return listOfServices;
    }
}
