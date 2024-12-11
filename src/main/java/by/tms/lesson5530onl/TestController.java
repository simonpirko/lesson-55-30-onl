package by.tms.lesson5530onl;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author simonpirko
 * @version 1.0
 * @since 11.12.24
 */
@Controller
@RequestMapping("/test")
public class TestController {

//    @Autowired
//    private AWSS3Service awsS3Service;

//    @GetMapping
//    public String test() {
//        File file = null;
//        try {
//            file = ResourceUtils.getFile("classpath:spring-blossom.jpg");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        awsS3Service.uploadImage(file);
//        return "test";
//    }
}
