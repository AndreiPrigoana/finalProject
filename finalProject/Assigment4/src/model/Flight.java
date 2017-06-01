package model;

public class Flight extends Entity{
	
	private int id;
	private int pilotId;
	private int planeId;
	private String departure;
	private String destination;
	private String date;
	private String hour;
	private int km;
	private float price;
	
	public Flight(){}

	public Flight(int id, int pilotId, int planeId, String departure, String destination, String date, String hour, int km, float price) {
		this.id = id;
		this.pilotId = pilotId;
		this.planeId = planeId;
		this.departure = departure;
		this.destination = destination;
		this.date = date;
		this.hour = hour;
		this.km = km;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPilotId() {
		return pilotId;
	}

	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
	}

	public int getPlaneId() {
		return planeId;
	}

	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}