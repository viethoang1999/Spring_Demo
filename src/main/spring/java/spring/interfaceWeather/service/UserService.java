package main.spring.java.spring.interfaceWeather.service;

import main.spring.java.spring.interfaceWeather.controller.request.LoginRequest;
import main.spring.java.spring.interfaceWeather.controller.request.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class UserService  {
    @Autowired
    Connection connection;

    public String longin(LoginRequest request) {
        return "Susses";
    }
    public String register(RegisterRequest register){
        //check phone
        if(register.getPhone()==null||register.getPhone()==""||register.getPhone().length()!=10){
          return "So dien thoai khong chinh xac";
        }
        //check email
        if(StringUtils.isEmpty(register.getEmail())||!register.getEmail().contains("@gmail.com")){
            return "Email khong chinh xac";
        }
        //check pass
        if(StringUtils.isEmpty(register.getPass())||register.getPass().length()<8){
            return "Pass chua dap ung";
        }
        //kiem tra sdt hoac email da ton tai hay chua
        String sql="SELECT * FROM User WHERE Phone='"+register.getPhone()+"'"+"OR Email='"+register.getEmail()+"';";
        try {
            Statement statement= connection.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            while (rs.next()){
                return "so dien thoại goặc email đã tồn tại";
            }
            //Insert new user
            sql="insert into user(`User_name`,`Pass`,`Email`)VALUES('"+register.getPhone()+"','"+register.getPass()+"','"+register.getEmail()+"');";
            statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "register afil";
        }
        return "Susses";
    }
    }





