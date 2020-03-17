package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	List<Observer> observers = new ArrayList<Observer>();
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
		this.notifyAllObservers();
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
