package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import dataAccess.ClientGateway;
import dataAccess.EmployeeGateway;
import dataAccess.FlightGateway;
import dataAccess.ReservationGateway;
import model.Client;
import model.Employee;
import model.Flight;
import model.Reservation;
import view.ClientView;

public class ClientController implements ActionListener{
	
	List<Reservation> reservationList = new LinkedList();
	List<Flight> flightList = new LinkedList();
	List<Client> clientList = new LinkedList();
	
	private ClientView view;
	private StartController sc;
	
	private ClientGateway clientGateway;
	private ReservationGateway reservasionGateway;
	private FlightGateway fg;
	
	private Reservation reservation;
	
	public ClientController(){
		view = new ClientView();
		view.getFrame().setVisible(true);
		
		populateFlightTable();
		populateFlightCombo();
		
		this.view.addItemListener(this);
		
	}
	
	public void populateFlightTable(){
		fg = new FlightGateway();
		flightList.removeAll(flightList);
		flightList.addAll(fg.view());
		
		for(Flight e: flightList){
			view.getModel1().addRow(new Object[] {e.getId(), e.getDeparture(), e.getDestination(), e.getDate(), e.getHour(), e.getKm(), e.getPrice()});
		}
	}
	
	public void clearFlightTable(){
		for(int i = view.getModel1().getRowCount()-1 ; i>=0; i--){
			view.getModel1().removeRow(i);
		}
	}
	
	public void populateFlightCombo(){
		view.getC1().addItem(0);
		for(Flight e : flightList){
			view.getC1().addItem(e.getId());
		}
	}
	
	public void removeFlightCombo(){
		view.getC1().removeAllItems();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == view.getB1()) {			// Add Reservation
			
			int id = (int) view.getC1().getSelectedItem();
			float price = 0;
			
			FlightGateway fg = new FlightGateway();
			flightList = fg.view();
			for(Flight f : flightList){
				if(id == f.getId()){
					price = f.getPrice();
				}
			}
			
			reservation = new Reservation(0, id, 10, Integer.parseInt(view.getF7().getText()), price*Integer.parseInt(view.getF7().getText()));
			
			ReservationGateway rg = new ReservationGateway();
			rg.add(reservation);
			
			clearFlightTable();
			populateFlightTable();
			removeFlightCombo();
			populateFlightCombo();
			
		} else if(e.getSource() == view.getB2()) {	// Update Reservation
			
		} else if(e.getSource() == view.getB3()) {	// View Reservation
			
		} else if(e.getSource() == view.getB4()) {	// Delete Reservation
			
		} else if(e.getSource() == view.getB5()) {	// Logout
			view.getFrame().setVisible(false);
			sc = new StartController();
			
		} else if(e.getSource() == view.getB6()) {	// Login
			
		} else if(e.getSource() == view.getB7()) {	// Back
			
		} else if(e.getSource() == view.getB8()) {	// Create client
			
			Client client = new Client(0, Long.parseLong(view.getF1().getText()), view.getF2().getText(), view.getF3().getText());
			
			clientGateway = new ClientGateway();
			clientGateway.add(client);
			JOptionPane.showMessageDialog(null, "Clients was created!");
		}
		
	}

}
