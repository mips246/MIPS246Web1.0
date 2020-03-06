package com.ryan.mips246spring.model.exception;

/**
 * @author Ryan
 * @date 2020/2/13 19:04
 * 自定义的异常类，封装了一下RuntimeException，可以返回信息
 */
public class LoginRegisterException extends RuntimeException {
    public LoginRegisterException(){
        super();
    }
    public LoginRegisterException(String message){
        super(message);
    }
    public LoginRegisterException(String message, Throwable cause){
        super(message,cause);
    }
    public LoginRegisterException(Throwable cause){
        super(cause);
    }
}
