/**
 * 
 */
package TuntiHarjoituksia;

/**
 * @author oppi
 *
 */
public class Computer {
	
	private String name; //like hp lenovo
	private String model; //thinkpad
	private int numberOfProcessors;
	private String[] netWorkConnections;//wlan, eth0..

	public Computer(String name, String model, int numberOfProcessors, String netDevice1,
			String netDevice2){
		this.name = name;
		this.model = model;
		this.numberOfProcessors = numberOfProcessors;
		this.netWorkConnections = new String[2];
		this.netWorkConnections[1] = netDevice1;
		this.netWorkConnections[1] = netDevice2;
	
	}
	
	
	

	@Override
	public String toString() {
		return "Computer [name= " + name + ", model= " + model
				+ ", numberOfProcessors= " + numberOfProcessors + "]";
	}




	public Computer() {
		// TODO Auto-generated constructor stub
		netWorkConnections = new String[2];
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNumberOfProcessors() {
		return numberOfProcessors;
	}

	public void setNumberOfProcessors(int numberOfProcessors) {
		this.numberOfProcessors = numberOfProcessors;
	}

	public String[] getNetWorkConnections() {
		return netWorkConnections;
	}

	public void setNetWorkConnections(String[] netWorkConnections) {
		this.netWorkConnections = netWorkConnections;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer hp = new Computer();
		hp.setModel("Elitebook");
		hp.setName("HP");
		hp.setNumberOfProcessors(4);
		
		Computer apple = new Computer("Apple", "Mac", 16, "wlan", "eth0");
		System.out.println(apple);
		
		System.out.println(hp);
				

	}

}
