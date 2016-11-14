package PerusHarjoituksia;

class RajaPoikkeus extends Exception
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 5555551L;
public RajaPoikkeus() {
    super("virhe! rajat ylitetty");
  }
  public RajaPoikkeus(int ar,int yr) {
    super("virhe!rajat"+ar+","+yr+"ylitetty");
  }
}
