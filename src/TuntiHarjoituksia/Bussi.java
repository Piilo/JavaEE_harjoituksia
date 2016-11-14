package TuntiHarjoituksia;

import java.util.ArrayList;

public class Bussi {
	
	private int max = 30;
	private ArrayList matkustajat;
	private int matkustajienLkm;
	
	public Bussi(){
		matkustajat = new ArrayList<Object>(max);
		matkustajienLkm = 0;
	}
	
	public Bussi(int lkm){
		this.max = lkm;
		matkustajat = new ArrayList<Object>(max);
		matkustajienLkm = 0;
	}
	
	public void lisaaMatkustaja(Matkustaja matk){
		if (matkustajienLkm >= max){
			System.out.println("Bussi on täynnä, ei voida lisätä matkustajaa!");
		}else {
			matkustajat.add(matk);
			matkustajienLkm++;
		}
	}
	
	public void poistaViimeinen(){
		matkustajat.remove(matkustajienLkm-1);
		matkustajienLkm--;
	}

	@Override
	public String toString() {
		return "Bussi [max=" + max + ", matkustajat=" + matkustajat
				+ ", matkustajienLkm=" + matkustajienLkm + "]";
	}
	
	public void tulostaTiedot(){
		for(int i = 0; i < matkustajat.size(); i++){
			System.out.println(matkustajat.get(i));
		}
	}
	
	public int vielaVapaata(){
		
		return max-matkustajienLkm;
		
	}
	
	public double yhteishinta(){
		double summa = 0;
		for(int i = 0; i< matkustajienLkm; i++){
			summa += ((Matkustaja) matkustajat.get(i)).getPaikanHinta();
		}
		return summa;
	}

}
