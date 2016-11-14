package testausHarjoituksia;

public class Driver {

	private Car auto;
	private String nimi;
	public Ajotapa ajotapa;

	public enum Ajotapa { // tämä on vähän niin kuin oma luokkansa
		AGGRESSIIVINEN(1), TAVALLINEN(0.7), RAUHALLINEN(0.4);

		private final double value;

		Ajotapa(double value) {
			this.value = value;
		}
	}

	public Driver(Car a, String n, Ajotapa at) {
		this.nimi = n;
		this.auto = a;
		this.ajotapa = at;
	}

	public double aja(double tuntia) {

		return auto.laskeNopeus() * tuntia * ajotapa.value;
	}

	public Car getAuto() {
		return auto;
	}

	public void setAuto(Car auto) {
		this.auto = auto;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public Ajotapa getAjotapa() {
		return ajotapa;
	}

	public void setAjotapa(Ajotapa ajotapa) {
		this.ajotapa = ajotapa;
	}

}
