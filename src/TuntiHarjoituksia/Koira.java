package TuntiHarjoituksia;

public class Koira {
String nimi;
Kissa jahdattava;

	


	@Override
	public String toString() {
		return "Koira [nimi=" + nimi + "]";
	}

	public void jahtaa(Kissa kissa) {
		// TODO Auto-generated method stub
		jahdattava = kissa;
		
	}

}
