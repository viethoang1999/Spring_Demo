package main.spring.java.spring.interfaceWeather.service;

import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Service
public class FileSevervice {
    private final Path root= Paths.get("uploads");

    public void save(MultipartFile file){
        try {
            Files.copy(file.getInputStream(),this.root.resolve(file.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Save file : "+file.getOriginalFilename());
    }
    public Resource download(String fileName){
        return null;
    }
}
