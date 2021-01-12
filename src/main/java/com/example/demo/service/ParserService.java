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
        var companyItems = tag.select("li.company-item");

        for (Element el: companyItems) {

            var companyCard = el.select("a[title=Zobacz informacje szczegółowe o firmie]");
            if(companyCard == null) {
                continue;
            }

            var name = companyCard.text();
            var href = companyCard.attr("href");
            var phone = el.select("a.icon-telephone").attr("title");
            var email = el.select("a.icon-envelope").attr("data-company-email");
            var address = el.select("div.address").text();

            var serviceDTO = ServiceDTO.builder()
                    .href(href)
                    .name(name)
                    .phone(phone)
                    .email(email)
                    .address(address)
                    .build();

            listOfServices.add(serviceDTO);
        }
        return listOfServices;
    }
}
