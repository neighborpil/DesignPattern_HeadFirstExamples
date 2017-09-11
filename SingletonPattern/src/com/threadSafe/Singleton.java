package com.threadSafe;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {} 
	
	// ����ȭ �ϸ� 100������ ��������
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
