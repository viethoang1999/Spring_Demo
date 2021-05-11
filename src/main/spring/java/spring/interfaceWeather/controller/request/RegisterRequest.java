package main.spring.java.spring.interfaceWeather.controller.request;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class RegisterRequest {
    private String phone;
    private String email;
    private String pass;
}
