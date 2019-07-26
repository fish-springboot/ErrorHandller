package com.github.fish.springboot.errorhandler.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
    @ResponseBody
    @GetMapping("/error")
    public String error(HttpServletRequest request){
        return "error";
    }

    /**
     * 这个有什么用吗？？
     * @return
     */
    @Override
    public String getErrorPath() {
        return "errors";
    }
}
