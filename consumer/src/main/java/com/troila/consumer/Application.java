package com.troila.consumer;

import org.apache.dolphinscheduler.api.dubbo.LoginService;
import org.apache.dolphinscheduler.api.dubbo.MyServiceImpl;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created on 2022/3/9.
 *
 * @author MariaCarrie
 */

@RestController
@SpringBootApplication(scanBasePackages = {"org.apache.dolphinscheduler","com.troila.consumer"})
@EnableDubbo(scanBasePackages = {"com.troila.consumer","org.apache.dolphinscheduler"})
public class Application {

//    @Autowired
//    LoginServiceNew loginServiceNew;
    @DubboReference
LoginService loginService;
    @DubboReference
    MyServiceImpl myService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @GetMapping("/get")
//    public String get() {
//        return loginServiceNew.test();
//    }

    @GetMapping("/test")
    public String test() {
        return loginService.test();
    }

//    @GetMapping("/testov")
//    public String testov() {
//        return loginService.testov();
//    }

    @GetMapping("/api")
    public Map<String, Object> api() {
        int processId=23;
        return myService.selectProcessTimeScheduleById();
    }
}
