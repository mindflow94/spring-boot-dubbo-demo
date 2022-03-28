package com.troila.provider.test;

import org.springframework.stereotype.Service;

/**
 * Created on 2022/3/23.
 *
 * @author MariaCarrie
 */
@Service
public class LoginServiceTestImpl implements LoginServiceTest {
    @Override
    public String test() {
        return "Override>>test***test";
    }
}
