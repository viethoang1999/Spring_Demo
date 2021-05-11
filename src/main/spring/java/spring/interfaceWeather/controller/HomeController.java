package main.spring.java.spring.interfaceWeather.controller;

import main.spring.java.spring.interfaceWeather.controller.request.LoginRequest;
import main.spring.java.spring.interfaceWeather.controller.request.RegisterRequest;
import main.spring.java.spring.interfaceWeather.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Date;

@RestController
@RequestMapping(value = "/Home")

public class HomeController {
@Autowired
    UserService userService;
    @PostMapping(value = "/register")
    public String register(@RequestBody RegisterRequest request){
    String result=userService.register(request);
    return result;
    }
    @PostMapping(value = "/login")
    public String login(@RequestBody LoginRequest request){
        String result=userService.longin(request);
        return result;
    }


//   @Autowired
//    UserService userService;
//
//    @Autowired
//    RestSevervice restSevervice;
//    @GetMapping(value = "/test-rest")
//    public String getDataFromOtherAPI
//
//    {
//        String result = restSevervice.
//    }

//    @GetMapping(value = "/news/{newid}")
//    public String getNewsById(@PathVariable(value = "newid") Integer newid) {
//
//        return "Connet new" + newid;
//    }
//
//    @GetMapping(value = "/new")
//    public String getNewByParam(@RequestParam(value = "id") Integer id,
//                                @RequestParam(value = "language") String language) {
//        return "Content new get by param: " + id + " language: " + language;
//    }
//
//    @GetMapping(value = "/new24h/{newName}")
//    public String getConntent(@PathVariable(value = "newName") String name) {
//        String id = name.substring(name.lastIndexOf("-"));
//        return "Content: " + id;
//    }
//
//    @RequestMapping(value = "/current-time", method = RequestMethod.GET)
//    public String getServerTime() {
//        return String.valueOf(new Date());
//    }
//
//    @GetMapping(value = "current-time-2")
//    public String getSeverTime2() {
//        return "API 2: " + String.valueOf(new Date());
//    }
//
////    @PostMapping(value = "/login")
////    public String login(@RequestBody LoginRequest request) {
////        String result = userInterface.login(request);
////        return result;
////    }
//
//    @PutMapping(value = "/login")
//    public LoginRequest loginPut(@RequestBody LoginRequest request) {
//        String hardUser = "hoang";
//        String hardPass = "abc";
//        if (request.getPassword().equals(hardPass) && request.getUserName().equals(hardUser)) {
//            request.setPassword("yyyyy");
//            return request;
//        } else {
//            return request;
//        }
//    }
//
//    @DeleteMapping(value = "/user")
//    public String deletUser() {
//        return "Delete Sussess";
//    }


}

