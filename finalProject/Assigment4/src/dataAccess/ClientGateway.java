package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.Client;

public class ClientGateway extends Gateway<Client>{
	
	List<Client> clientList = new LinkedList();
	
	private static final String add = "INSERT INTO Client (id, cnp, name, address) VALUES (?, ?, ?, ?)";
	private static final String update = "UPDATE Client SET cnp=?, name=?, address=? WHERE id=?";
	private static final String view = "SELECT * FROM Client";
	private static final String delete = "DELETE FROM Client WHERE id=?";
	
	private DatabaseConnection connect;
	
	private Client client;

	@Override
	public void add(Client entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(add);
	    	statement.setInt(1, entity.getId());
	    	statement.setLong(2, entity.getCnp());
	    	statement.setString(3, entity.getName());
	    	statement.setString(4, entity.getAddress());
	    	statement.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void update(Client entity) {
		connect = new DatabaseConnection();
		
		try {
			Connection con = connect.getCon();
	    	
	    	PreparedStatement statement = con.prepareStatement(update);
	    	statement.setLong(1, entity.getCnp());
	    	statement.setString(2, entity.getName());
	    	statement.setString(3, entity.getAddress());
	    	statement.setInt(4, entity.getId());
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
				 long cnp = connect.getRs().getLong("cnp");
				 String name = connect.getRs().getString("name");
				 String address = connect.getRs().getString("address");
				
				client = new Client(id, cnp, name, address);
				
				clientList.add(client);
			}
		}catch(Exception ex){
			System.err.println(ex);
		}
		
		return clientList;
	}
}