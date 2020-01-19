package com.my.restfulcrud.exception;

public class UserNotExistException extends RuntimeException{

    public UserNotExistException() {
        super("不存在当前用户");
    }
}
