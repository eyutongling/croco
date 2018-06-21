package com.luan.Interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/2/8 0008.
 */
public class Interceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        // 在controller方法调用前打印信息
        System.out.println("This is interceptor.");
        // 返回true，将强求继续传递（传递到下一个拦截器，没有其它拦截器了，则传递给Controller）
        return true;
    }
}
