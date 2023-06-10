package com.example.backend.ecxeption;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class APITestClient {

    public static void main(String[] args) {
        // API endpoint
        String apiUrl = "http://localhost:8080/api/endpoint";

        // Kimlik doğrulama bilgileri
        String username = "Berkay";
        String password = "123456B";

        // RestTemplate oluşturma
        RestTemplate restTemplate = new RestTemplate();

        // Kimlik doğrulama bilgilerini ayarlayan HttpHeader
        HttpHeaders headers = new HttpHeaders();
        headers.setBasicAuth(username, password);

        // Kimlik doğrulama bilgilerini içeren HttpEntity oluşturma
        HttpEntity<String> requestEntity = new HttpEntity<>(headers);

        // API isteğini gönderme
        ResponseEntity<String> response = restTemplate.exchange(
                apiUrl,
                HttpMethod.GET,
                requestEntity,
                String.class
        );

        // Yanıtı alın
        if (response.getStatusCode().is2xxSuccessful()) {
            String responseBody = response.getBody();
            System.out.println("API Yanıtı: " + responseBody);
        } else {
            System.out.println("API İsteği başarısız oldu. Hata kodu: " + response.getStatusCodeValue());
        }
    }
}
