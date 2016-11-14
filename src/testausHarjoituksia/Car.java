package testausHarjoituksia;

public class Car {
	

	
	private String mark;
	private String model;
	private int topSpeed;
	
	private Engine engine;
	private Driver driver;
	
	public Car(String merkki, String malli, int maxNop, Engine moottori, Driver kuski ){
		this.mark = merkki;
		this.model = malli;
		this.topSpeed = maxNop;
		this.driver= kuski;
		this.engine = moottori;
		
	}
	

	
	public double laskeNopeus(){
		double rikki = engine.getBrokenCylinders();
		double ehja = engine.getCylinders();
		double kerroin = (ehja-rikki)/ehja;
		return kerroin * topSpeed;

	}
	
	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	

}
