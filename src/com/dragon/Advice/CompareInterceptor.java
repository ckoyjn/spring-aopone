package com.dragon.Advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CompareInterceptor implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object result = null;
		String stu_name = invocation.getArguments()[0].toString();
		if ( stu_name.equals("dragon")){
			result= invocation.proceed();
		} else{
			System.out.println("��ѧ����"+stu_name+"������dragon,����׼�����.");
		}
		  return result;
	}

}
