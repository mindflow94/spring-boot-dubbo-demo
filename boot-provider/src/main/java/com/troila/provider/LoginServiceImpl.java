package com.troila.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * Created on 2022/3/23.
 *
 * @author MariaCarrie
 */
@Component
@DubboService
public class LoginServiceImpl implements LoginService {

    @Override
    public String test() {
        return "test***test";
    }

}
