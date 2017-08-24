package com.display;

import com.observe.Observer;
import com.subject.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData; //생성자에 weatherData라는 Subject객체를 전달하고
		weatherData.registerObserver(this); //그 객체를 사용하여 Display를 Observer로 등록
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity; //update가 호출되면 기온과 습도를 저장하고 display를 호출
		display();
	}

	//출력
	public void display() {
		System.out.println("Current conditions : " + temperature + "F degrees and "
				+ humidity + "% humidity");
	}

}
