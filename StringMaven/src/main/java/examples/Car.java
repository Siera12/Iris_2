package examples;

import java.util.Set;

public class Car {

	private int carNumber;
	private Engine engine;
	private String color;
	private Set<Engine> engine1;
	
	public Car() {}

	public Car(int carNumber, Engine engine, String color, Set<Engine> engine1) {
		super();
		this.carNumber = carNumber;
		this.engine = engine;
		this.color = color;
		this.engine1 = engine1;
	}




	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Set<Engine> getEngine1() {
		return engine1;
	}

	public void setEngine1(Set<Engine> engine1) {
		this.engine1 = engine1;
	}

	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", engine=" + engine + ", color=" + color + ", engine1=" + engine1 + "]";
	}
	
	

	
}
