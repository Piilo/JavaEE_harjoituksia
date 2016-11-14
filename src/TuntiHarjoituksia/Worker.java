package TuntiHarjoituksia;

public class Worker {
	
	private String name;
	private String syntAika;
	
	public Worker(String nimi, String sAika){
		this.name = nimi;
		this.syntAika = sAika;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSyntAika() {
		return syntAika;
	}

	public void setSyntAika(String syntAika) {
		this.syntAika = syntAika;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", syntAika=" + syntAika + "]";
	}
	
	
}
