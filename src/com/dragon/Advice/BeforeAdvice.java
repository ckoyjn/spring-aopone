package com.dragon.Advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {

	public BeforeAdvice() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void before(Method arg0, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println(" 这是BeforeAdvice类的before方法. ");
	}

}
