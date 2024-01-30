package com.winter.app.errors;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(NullPointerException.class)
	public String handler1() {
		System.out.println("프론트에러발생0");
		return "errors/error";
	}
	
	@ExceptionHandler(Exception.class)
	public String handler2() {
		System.out.println("프론트에러발생1");
		return "errors/error";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public String handler3() {
		System.out.println("프론트에러발생2");
		return "errors/error";
	}
	
	@ExceptionHandler(Throwable.class)
	public String handler4() {
		System.out.println("프론트에러발생3");
		return "errors/error";
	}
	
	
}
