package zz.yk.app.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import zz.yk.app.service.UserService;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public String loadUserByUsername(String username) {

        return username.equals("admin") ? username : null;
    }
}
