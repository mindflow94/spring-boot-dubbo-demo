package com.troila.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2022/3/9.
 *
 * @author MariaCarrie
 */

@RestController
@SpringBootApplication(scanBasePackages = "com.troila.provider")
public class Application {

    @Autowired
    LoginService loginService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/get")
    public String get() {
        return loginService.test();
    }
}
