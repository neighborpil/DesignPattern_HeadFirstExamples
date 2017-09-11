package com.threadSafe;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {} 
	
	// 동기화 하면 100배정도 느려진다
	public static synchronized Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	public String getDescription() {
		return "I'm thread safe Singleton!";
	}
}
