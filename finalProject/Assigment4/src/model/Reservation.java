package model;

public class Reservation extends Entity{
	
	private int id;
	private int flightId;
	private int clientId;
	private int tickets;
	private float price;
	
	public Reservation(){}

	public Reservation(int id, int flightId, int clientId, int tickets, float price) {
		this.id = id;
		this.flightId = flightId;
		this.clientId = clientId;
		this.tickets = tickets;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
