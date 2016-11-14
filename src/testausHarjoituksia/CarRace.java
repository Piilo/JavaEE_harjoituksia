/**
 * 
 */
package testausHarjoituksia;

import testausHarjoituksia.Driver.Ajotapa;

/**
 * @author oppi, Piia Loukeinen
 *
 */
public class CarRace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Engine moottori1 = new Engine(150,8,0);
		Driver kuski1 = new Driver(null,"Jaska", Ajotapa.TAVALLINEN);
		Car auto1 = new Car("Opel", "Astra", 100,moottori1,kuski1);
		kuski1.setAuto(auto1);
		
		Engine moottori2 = new Engine(100,4,0);
		Driver kuski2 = new Driver(null,"Anneli",Ajotapa.AGGRESSIIVINEN);
		Car auto2 = new Car("Kia", "xxx", 100,moottori2,kuski2);
		kuski2.setAuto(auto2);
		
		Engine moottori3 = new Engine(170,6,1);
		Driver kuski3 = new Driver(null,"Hakkinen", Ajotapa.AGGRESSIIVINEN);
		Car auto3 = new Car("Kia", "xxx", 300,moottori3,kuski3);
		kuski3.setAuto(auto3);
		
		System.out.println("Nopeus auto1: "+auto1.laskeNopeus());
		System.out.println(moottori2.toString());
		System.out.println("Nopeus auto2: "+ auto2.laskeNopeus());
		System.out.println("Nopeus auto3 :"+auto3.laskeNopeus());
		
		System.out.println("kuski2 matka: "+kuski2.aja(1));
		
	}

}
