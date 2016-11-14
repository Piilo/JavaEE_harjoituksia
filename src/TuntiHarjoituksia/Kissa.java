package TuntiHarjoituksia;

public class Kissa {
	String nimi;
	Koira jahtaaja;

	public void karkuun(Koira koira) {
		jahtaaja = koira;

	}

	@Override
	public String toString() {
		return "Kissa [nimi=" + nimi + "]";
	}

}
