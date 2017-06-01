package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.Flight;

public class FlightGateway extends Gateway<Flight>{
	
	List<Flight> flightList = new LinkedList();
	
	private static final String add = "INSERT INTO Flight (id, pilotId, planeId, departure, destination, date, hour, km, price) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	private static final String update = "UPDATE Flight SET pilotId=?, planeId=?, departure=?, destination=?, date=?, hour=?, km=?, price=? WHERE id=?";
	private static final String view = "SELECT * FROM Flight";
	private static final String delete = "DELETE FROM Flight WHERE id=?";
	
	private DatabaseConnection connect;
	
	private Flight flight;
	
	@Override
	public void add(Flight entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(add);
	    	statement.setInt(1, entity.getId());
	    	statement.setInt(2, entity.getPilotId());
	    	statement.setInt(3, entity.getPlaneId());
	    	statement.setString(4, entity.getDeparture());
	    	statement.setString(5, entity.getDestination());
	    	statement.setString(6, entity.getDate());
	    	statement.setString(7, entity.getHour());
	    	statement.setInt(8, entity.getKm());
	    	statement.setFloat(9, entity.getPrice());
	    	statement.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
	}
	
	@Override
	public void update(Flight entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(update);
	    	statement.setInt(1, entity.getPilotId());
	    	statement.setInt(2, entity.getPlaneId());
	    	statement.setString(3, entity.getDeparture());
	    	statement.setString(4, entity.getDestination());
	    	statement.setString(5, entity.getDate());
	    	statement.setString(6, entity.getHour());
	    	statement.setInt(7, entity.getKm());
	    	statement.setFloat(8, entity.getPrice());
	    	statement.setInt(9, entity.getId());
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
				 int pilotId = connect.getRs().getInt("pilotId");
				 int planeId = connect.getRs().getInt("planeId");
				 String departure = connect.getRs().getString("departure");
				 String destination = connect.getRs().getString("destination");
				 String date = connect.getRs().getString("date");
				 String hour = connect.getRs().getString("hour");
				 int km = connect.getRs().getInt("km");
				 float price = connect.getRs().getFloat("price");
				
				flight = new Flight(id, pilotId, planeId, departure, destination, date, hour, km, price);
				
				flightList.add(flight);
			}
		}catch(Exception ex){
			System.err.println(ex);
		}
		
		return flightList;
	}
}
