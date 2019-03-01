package com.btm.api.controller;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author wenzhenyu
 * @description 公共请求接口
 * @date 2018/11/30
 */
@Controller
public class BaseController {


    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpEntity<String> httpEntity;

    @ModelAttribute
    public void init(HttpServletRequest request, HttpServletResponse response, HttpEntity<String> httpEntity,  Object handler, Exception ex){
        this.request = request;
        this.response = response;
        this.httpEntity=httpEntity;
    }

    public HttpSession getSession() {
        HttpSession session = request.getSession();
        return session;
    }


}
