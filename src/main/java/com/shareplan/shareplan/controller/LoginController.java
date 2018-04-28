package com.shareplan.shareplan.controller;

import com.shareplan.shareplan.exception.TipException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登录注册类
 * Created by YangKui on 2018/4/28
 */
@Controller
@RequestMapping(value = "/admin")
@Transactional(rollbackFor = TipException.class)
public class LoginController extends BaseController{


    private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

    @GetMapping(value = "/login")
    public String login(HttpServletRequest request) {
        return "admin/login";
    }





}
