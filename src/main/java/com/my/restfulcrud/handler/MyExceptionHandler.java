package com.my.restfulcrud.handler;

import com.my.restfulcrud.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

/*    @ResponseBody
    @ExceptionHandler({UserNotExistException.class})
    public Map<String, Object>  handleException(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "user is not exist");
        map.put("msg", e.getMessage());
        return map;
    }*/

    @ExceptionHandler({UserNotExistException.class})
    public String  handleException(Exception e, HttpServletRequest request){
        request.setAttribute("javax.servlet.error.status_code", 520);
        Map<String, Object> map = new HashMap<>();
        map.put("code", "user is not exist");
        map.put("msg", e.getMessage());
        request.setAttribute("myInfo", map);
        return "forward:/error";
    }
}
