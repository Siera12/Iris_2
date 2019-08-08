package examples;

public class Car {

	private int carNumber;
	private Engine engine;
	private String color;
	
	public Car() {}
	
	public Car(int carNumber, Engine engine, String color) {
		super();
		this.carNumber = carNumber;
		this.engine = engine;
		this.color = color;
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

	@Override
	public String toString() {
		return "Car [carNumber=" + carNumber + ", engine=" + engine + ", color=" + color + "]";
	}


	
}
