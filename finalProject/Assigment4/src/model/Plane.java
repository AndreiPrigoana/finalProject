package model;

public class Plane extends Entity{
	
	private int id;
	private int capacity;
	private String model;
	
	public Plane(int id, int capacity, String model) {
		this.id = id;
		this.capacity = capacity;
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
