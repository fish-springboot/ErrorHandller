package com.github.fish.springboot.errorhandler.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 抛出异常后，会按照异常的类型来调用对应的方法
 * 每个方法都是传入两个参数:
 *    - http请求对象
 *    - 异常对象
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 如果异常类型为 AaException， 则调用这个方法
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = AaException.class)
    @ResponseBody
    public Map<String, String> a(HttpServletRequest req, AaException e) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("exception", e.getClass().getName());
        map.put("message", e.getMessage());
        return map;
    }

    @ExceptionHandler(value = BbException.class)
    @ResponseBody
    public Map<String, String> b(HttpServletRequest req, BbException e) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("exception", e.getClass().getName());
        map.put("message", e.getMessage());
        return map;
    }

    /**
     * 通用处理异常的，匹配一切的
     * @param req
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Map<String, String> genera(HttpServletRequest req, Exception e) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("exception", e.getClass().getName());
        map.put("message", e.getMessage());
        return map;
    }
}
