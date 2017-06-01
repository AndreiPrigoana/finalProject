package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.Plane;

public class PlaneGateway extends Gateway<Plane> {
	
	List<Plane> planeList = new LinkedList();

	private static final String add = "INSERT INTO Plane (id, capacity, model) VALUES (?, ?, ?)";
	private static final String update = "UPDATE Plane SET capacity=?, model=? WHERE id=?";
	private static final String view = "SELECT * FROM Plane";
	private static final String delete = "DELETE FROM Plane WHERE id=?";
	
	private DatabaseConnection connect;
	
	private Plane plane;
	
	@Override
	public void add(Plane entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(add);
	    	statement.setInt(1, entity.getId());
	    	statement.setInt(2, entity.getCapacity());
	    	statement.setString(3, entity.getModel());
	    	statement.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}	
	}
	
	@Override
	public void update(Plane entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(update);
	    	statement.setInt(1, entity.getCapacity());
	    	statement.setString(2, entity.getModel());
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
				 int capacity = connect.getRs().getInt("capacity");
				 String model = connect.getRs().getString("model");
				
				plane = new Plane(id, capacity, model);
				
				planeList.add(plane);
			}
		}catch(Exception ex){
			System.err.println(ex);
		}
		
		return planeList;
	}
}