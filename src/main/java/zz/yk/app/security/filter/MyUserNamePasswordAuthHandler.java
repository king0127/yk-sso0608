package zz.yk.app.security.filter;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyUserNamePasswordAuthHandler extends UsernamePasswordAuthenticationFilter {

    public MyUserNamePasswordAuthHandler() {
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {

        return super.attemptAuthentication(request, response);
    }

    @Override
    protected String obtainPassword(HttpServletRequest request) {
        String username = request.getParameter("username");
        return null == username ? "" : username;
    }

    @Override
    protected String obtainUsername(HttpServletRequest request) {
        String password = request.getParameter("password");
        return null == password ? "" : password;
    }
}
