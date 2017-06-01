package model;

public class Client extends Entity{
	
	private int id;
	private long cnp;
	private String name;
	private String address;
	
	public Client(){}
	
	public Client(int id, long cnp, String name, String address){
		this.id = id;
		this.cnp = cnp;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCnp() {
		return cnp;
	}

	public void setCnp(long cnp) {
		this.cnp = cnp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}