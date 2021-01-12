package com.example.demo.service;

import com.example.demo.dto.ServiceDTO;
import org.springframework.stereotype.Service;

@Service
public class ServiceToVCardConverter {

    public String convertIntoVCard(ServiceDTO serviceDTO) {
        return "BEGIN:VCARD\r\n" +
                "VERSION:4.0\r\n" +
                "ORG:" + serviceDTO.getName() + "\r\n" +
                "TEL:" + serviceDTO.getPhone() + "\r\n" +
                "ADR:" + serviceDTO.getAddress() + "\r\n" +
                "EMAIL:" + serviceDTO.getEmail() + "\r\n" +
                "URL:" + serviceDTO.getHref() + "\r\n" +
                "END:VCARD";
    }
}
