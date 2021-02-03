package com.afm8.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterImpl implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器");
        if(request.getRequestURI().indexOf("/user/index") > -1){
            return true;
        }
        response.sendRedirect("/user/index");
        return false;
    }
}
