package com.javapapers.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler {
	public AnimalInvocationHandler(final Object realSubject) {
		this.realSubject = realSubject;
	}

	public Object invoke(final Object proxy,
final  Method m,
final  Object[] args) {
		Object result = null;
		try {
			result = m.invoke(realSubject, args);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	private Object realSubject = null;
}
