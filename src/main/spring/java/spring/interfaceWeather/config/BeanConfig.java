package main.spring.java.spring.interfaceWeather.config;

import main.spring.java.spring.interfaceWeather.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


import java.sql.Connection;
import java.sql.DriverManager;

@Configuration
public class BeanConfig {

    @Value("${database.user}")
    String user;
    @Value("${database.pass}")
    String pass;
    @Value("${database.url}")
    String url;

    @Bean
    Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (con == null) {
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quanlysach", "root", "0945533162");
            } else return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

//    @Bean
//    UserInterface userInterface(){
//        return new UserService(getConnection());
//    }
//    @Bean
//    UserService2 userService2(){
//        return new UserService2(getConnection());
//    }
//    @Bean
//    RestTemplate restTemplate(){
//        return new RestTemplate();
//    }
}


