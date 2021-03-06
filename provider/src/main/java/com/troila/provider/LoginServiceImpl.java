package com.troila.provider;

import com.troila.provider.test.LoginServiceTest;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created on 2022/3/23.
 *
 * @author MariaCarrie
 */
@Component
@DubboService
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginServiceTest loginServiceTest;

    @Override
    public String test() {
        return "test***test";
    }

    @Override
    public String testov() {
        return loginServiceTest.test();
    }
}
