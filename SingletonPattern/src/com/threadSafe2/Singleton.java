package com.threadSafe2;

public class Singleton {
	// thread safe : ������ �� �ƿ� ó������ �ν��Ͻ��� �����
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {} 
	
	public static synchronized Singleton getInstance() {
		
		return uniqueInstance;
	}
	
	public String getDescription() {
		return "I'm statically initialized Singleton!";
	}
}
