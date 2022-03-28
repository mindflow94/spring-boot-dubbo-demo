package com.troila.consumer;

import com.troila.provider.LoginService;
import org.apache.dubbo.config.annotation.DubboReference;
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
@SpringBootApplication(scanBasePackages = {"com.troila.consumer"})
public class Application {

    @DubboReference
    LoginService loginService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/test")
    public String test() {
        return loginService.test();
    }

}
