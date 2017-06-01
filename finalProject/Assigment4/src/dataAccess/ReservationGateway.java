package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.Reservation;

public class ReservationGateway extends Gateway<Reservation> {
	
	List<Reservation> reservationList = new LinkedList();

	private static final String add = "INSERT INTO Reservation (id, flightId, clientId, tickets, price) VALUES (?, ?, ?, ?, ?)";
	private static final String update = "UPDATE Reservation SET flightId=?, clientId=?, tickets=?, price=? WHERE id=?";
	private static final String view = "SELECT * FROM Reservation";
	private static final String delete = "DELETE FROM Reservation WHERE id=?";
	
	private DatabaseConnection connect;
	
	private Reservation reservation;
	
	@Override
	public void add(Reservation entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(add);
	    	statement.setInt(1, entity.getId());
	    	statement.setInt(2, entity.getFlightId());
	    	statement.setInt(3, entity.getClientId());
	    	statement.setInt(4, entity.getTickets());
	    	statement.setFloat(5, entity.getPrice());
	    	statement.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}		
	}
	
	@Override
	public void update(Reservation entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(update);
	    	statement.setInt(1, entity.getFlightId());
	    	statement.setInt(2, entity.getClientId());
	    	statement.setInt(3, entity.getTickets());
	    	statement.setFloat(4, entity.getPrice());
	    	statement.setInt(5, entity.getId());
	    	statement.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}		
	}
	
	@Override
	public void delete(int id) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(delete);
	    	statement.setInt(1, id);
	    	statement.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	@Override
	public List view() {
		connect = new DatabaseConnection();
		
		try{
			connect.setRs(connect.getSt().executeQuery(view));
			while(connect.getRs().next()){
				 int id = connect.getRs().getInt("id");
				 int flightId = connect.getRs().getInt("flightId");
				 int clientId = connect.getRs().getInt("clientId");
				 int tickets = connect.getRs().getInt("tickets");
				 float price = connect.getRs().getFloat("price");
				
				reservation = new Reservation(id, flightId, clientId, tickets, price);
				
				reservationList.add(reservation);
			}
		}catch(Exception ex){
			System.err.println(ex);
		}
		
		return reservationList;
	}
}