package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.Pilot;

public class PilotGateway extends Gateway<Pilot> {
	
	List<Pilot> pilotList = new LinkedList();
	
	private static final String add = "INSERT INTO Pilot (id, user, password) VALUES (?, ?, ?)";
	private static final String update = "UPDATE Pilot SET user=?, password=? WHERE id=?";
	private static final String view = "SELECT * FROM Pilot";
	private static final String delete = "DELETE FROM Pilot WHERE id=?";
	
	private DatabaseConnection connect;
	
	private Pilot pilot;
	
	@Override
	public void add(Pilot entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(add);
	    	statement.setInt(1, entity.getId());
	    	statement.setString(2, entity.getUser());
	    	statement.setString(3, entity.getPassword());
	    	statement.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
	}
	
	@Override
	public void update(Pilot entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(update);
	    	statement.setString(1, entity.getUser());
	    	statement.setString(2, entity.getPassword());
	    	statement.setInt(3, entity.getId());
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
				 String user = connect.getRs().getString("user");
				 String password = connect.getRs().getString("password");
				
				pilot = new Pilot(id, user, password);
				
				pilotList.add(pilot);
			}
		}catch(Exception ex){
			System.err.println(ex);
		}
		
		return pilotList;
	}
}