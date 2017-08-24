package com.subject;

import java.util.ArrayList;

import com.observe.Observer;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers; //observer 객체를 저장하기 위한 ArrayList
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o); //옵저버가 등록을 하면 목록 맨 뒤에 추가하기만 하면 됨
	}

	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o); 
		if(i >= 0)
			observers.remove(i); //옵저버가 탈퇴를 신청하면 목록에서 빼기만 하면 됨
	}

	//중요! 상태 정보를 모든 옵저버들에게 알려주는 부분
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++){ //ArrayList안에 있는 모든 Observer들의
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure); //update()메소드 실행
		}
	}
	
	public void measurementsChanged(){ //갱신된 측정치를 받으면 옵저버들에게 알림
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
	
	//기타 WeatherData 메소드
}
