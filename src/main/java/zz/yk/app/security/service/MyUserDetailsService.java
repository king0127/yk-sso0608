package zz.yk.app.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import zz.yk.app.service.UserService;

import javax.annotation.Resource;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Resource
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 通过username 查询数据库获取用户信息
        if(userService.loadUserByUsername(username) == null) {
            System.out.println("用户不存在");
        }
        return null;
    }
}
