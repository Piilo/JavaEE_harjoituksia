package testausHarjoituksia;

//import testausHarjoituksia.Driver.Ajotapa;

public class Engine {

	private int power;
	private int cylinders;
	private int brokenCylinders;

	public Engine(int teho, int sylinteri, int sylintereitaRikki) {
		this.power = teho;
		if (sylintereitaRikki > sylinteri) {
			this.brokenCylinders = sylinteri;
		} else {
			this.brokenCylinders = sylintereitaRikki;
		}
		this.cylinders = sylinteri;

	}

	public int meneRikki() { // arpoo kuinka monta sylinteriä menee rikki,
								// palauttaa rikkinäisten lkm, voi olla 0

		this.brokenCylinders += (int) (Math.random() * (cylinders - brokenCylinders));
		return brokenCylinders;
	}

	@Override
	public String toString() {
		return "Engine [power=" + power + ", cylinders=" + cylinders
				+ ", brokenCylinders=" + brokenCylinders + "]";
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public int getBrokenCylinders() {
		return brokenCylinders;
	}

	public void setBrokenCylinders(int brokenCylinders) {
		this.brokenCylinders = brokenCylinders;
	}

}
