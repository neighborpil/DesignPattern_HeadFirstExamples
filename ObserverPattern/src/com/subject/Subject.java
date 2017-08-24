package com.subject;

import com.observe.Observer;

public interface Subject {
	public void registerObserver(Observer o); //옵저버를 인자로 받음, 옵저버 등록
	public void removeObserver(Observer o); //옵저버를 인자로 받음, 옵저버 제거
	public void notifyObservers(); //주체 객체가 변경되었을 때 모든 옵저버에게 알리기 위해 호출됨
}
