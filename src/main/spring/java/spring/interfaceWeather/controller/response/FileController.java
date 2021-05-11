package main.spring.java.spring.interfaceWeather.controller.response;

import main.spring.java.spring.interfaceWeather.service.FileSevervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/file")
public class FileController {
    @Autowired
    FileSevervice fileSevervice;
    @PostMapping(value = "/uploadfile")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        ResponseEntity<String> result;
        try {
            fileSevervice.save(file);
            System.out.println("Uploaded the file successfully: " + file.getOriginalFilename());
            result = ResponseEntity.status(HttpStatus.OK).body("OK");
        } catch (Exception e) {
            System.out.println("Could not upload the file: " + file.getOriginalFilename() + "!");
            result = ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body("Error");
        }
        return result;
    }
    @GetMapping("/download/{filename}")
    @ResponseBody
    public ResponseEntity<Resource> downloadFile(@PathVariable String filename) {
        Resource file = fileSevervice.download(filename);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() +
                        "\"").body(file);
    }


}
