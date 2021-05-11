package main.spring.java.spring.interfaceWeather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class RestSevervice {
    @Service
    public class RestSeverice {
        @Autowired
        RestTemplate restTemplate;

        public void getAPIUsingRestTemplate() {
            HttpEntity request = new HttpEntity(null);
            String url =
                    "http://www.emprender15.com/RadioP/admin_RSwedEn/api/api.php?method=getRadios&api_key=eHJhZGlvcGVyZmVjdGF wcA & offset = 0 & limit = 1000 & is_feature = 1 ";
            ResponseEntity<Object> response = restTemplate.exchange(url,
                    HttpMethod.GET,
                    request,
                    new ParameterizedTypeReference<Object>() {
                    });
            Object data = response.getBody();
            System.out.println(data);

        }
    }
}
