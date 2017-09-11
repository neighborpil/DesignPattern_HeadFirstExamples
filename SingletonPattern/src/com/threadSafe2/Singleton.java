package com.threadSafe2;

public class Singleton {
	// thread safe : 시작할 때 아예 처음부터 인스턴스를 만든다
	private static Singleton uniqueInstance = new Singleton();
	
	private Singleton() {} 
	
	public static synchronized Singleton getInstance() {
		
		return uniqueInstance;
	}
	
	public String getDescription() {
		return "I'm statically initialized Singleton!";
	}
}
