package examples;

public class Engine {
	
	private int cc;
	private String make;
	
	public Engine() {}
	public Engine(int cc, String make) {
		super();
		this.cc = cc;
		this.make = make;
	}


	public int getCc() {
		return cc;
	}


	public void setCc(int cc) {
		this.cc = cc;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", make=" + make + "]";
	}
	

}
