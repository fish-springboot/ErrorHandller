package com.github.fish.springboot.errorhandler.web;

import com.github.fish.springboot.errorhandler.exception.GlobalExceptionHandler;
import com.github.fish.springboot.errorhandler.exception.AaException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里抛出异常后，将由{@link GlobalExceptionHandler @GlobalExceptionHandler} 来处理
 */
@RestController
public class ExceptionController {
    @RequestMapping("/a")
    public void a(){
        throw new AaException("a异常");
    }

    @RequestMapping("/b")
    public void b(){
        throw new AaException("b异常");
    }
}
