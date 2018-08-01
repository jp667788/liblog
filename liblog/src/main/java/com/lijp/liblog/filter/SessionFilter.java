package com.lijp.liblog.filter;


import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * Created by Li on 2018/7/29.
 */
public class SessionFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // API请求和静态资源请求放行
        if (isApi(request) || isStatic(request)) {
            filterChain.doFilter(request,response);
        } else {
            // 其他请求条跳转首页
            request.getRequestDispatcher("/").forward(request,response);
        }
    }


    /**
     * 匹配API请求
     * @param request
     * @return
     */
    private boolean isApi(HttpServletRequest request) {
        return request.getRequestURI().indexOf(".action") >= 0;
    }

    /**
     * 匹配静态资源请求
     * @param request
     * @return
     */
    private boolean isStatic(HttpServletRequest request) {
        return Pattern.matches(".+\\.((html)|(css)|(js)|(woff)|(ttf)|(map)|(woff2)|(eot)|(svg)|(otf)|(png)|(jpg)|(ico)|(txt))$",request.getRequestURI());
    }
}
