package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import dataAccess.ClientGateway;
import dataAccess.EmployeeGateway;
import dataAccess.FlightGateway;
import dataAccess.PilotGateway;
import dataAccess.PlaneGateway;
import dataAccess.ReservationGateway;
import model.Client;
import model.Employee;
import model.Flight;
import model.Pilot;
import model.Plane;
import model.Reservation;
import view.EmployeeView;

public class EmployeeController implements ActionListener{
	
	List<Plane> planeList = new LinkedList();
	List<Pilot> pilotList = new LinkedList();
	List<Flight> flightList = new LinkedList();
	List<Reservation> reservationtList = new LinkedList();
	List<Client> clientList = new LinkedList();
	
	private EmployeeView view;
	private StartController sc;
	
	private PlaneGateway pg;
	private PilotGateway plg;
	private FlightGateway fg;
	private ReservationGateway rg;
	private ClientGateway cg;
	
	public EmployeeController(){
		view = new EmployeeView();
		view.getFrame().setVisible(true);
		
		populatePlaneTable();
		populatePlaneCombo();
		populatePilotTable();
		populatePilotCombo();
		populateFlightTable();
		populateFlightCombo();
		populateReservationTable();
		populateReservationCombo();
		populateClientCombo();
		
		this.view.addItemListener(this);
	}
	
	public void populateClientCombo(){
		cg = new ClientGateway();
		clientList.removeAll(pilotList);
		clientList.addAll(cg.view());
		
		view.getC5().addItem(0);
		for(Client e : clientList){
			view.getC5().addItem(e.getId());
		}
	}
	
	public void removeClientCombo(){
		view.getC5().removeAllItems();
	}
	
	
	public void populatePilotTable(){
		plg = new PilotGateway();
		pilotList.removeAll(pilotList);
		pilotList.addAll(plg.view());
		
		for(Pilot e: pilotList){
			view.getModel2().addRow(new Object[] {e.getId(), e.getUser()});
		}
	}
	
	public void clearPilotTable(){
		for(int i = view.getModel2().getRowCount()-1 ; i>=0; i--){
			view.getModel2().removeRow(i);
		}
	}
	
	public void populatePilotCombo(){
		view.getC2().addItem(0);
		for(Pilot e : pilotList){
			view.getC2().addItem(e.getId());
		}
	}
	
	public void removePilotCombo(){
		view.getC2().removeAllItems();
	}
	
	
	public void populatePlaneTable(){
		pg = new PlaneGateway();
		planeList.removeAll(planeList);
		planeList.addAll(pg.view());
		
		for(Plane e: planeList){
			view.getModel3().addRow(new Object[] {e.getId(), e.getCapacity(), e.getModel()});
		}
	}
	
	public void clearPlaneTable(){
		for(int i = view.getModel3().getRowCount()-1 ; i>=0; i--){
			view.getModel3().removeRow(i);
		}
	}
	
	public void populatePlaneCombo(){
		view.getC3().addItem(0);
		for(Plane e : planeList){
			view.getC3().addItem(e.getId());
		}
	}
	
	public void removePlaneCombo(){
		view.getC3().removeAllItems();
	}
		
	public void populateFlightTable(){
		fg = new FlightGateway();
		flightList.removeAll(flightList);
		flightList.addAll(fg.view());
		
		for(Flight e: flightList){
			view.getModel1().addRow(new Object[] {e.getId(), e.getPilotId(), e.getPlaneId(), e.getDeparture(), e.getDestination(), e.getDate(), e.getHour(), e.getKm(), e.getPrice()});
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

	public void populateReservationTable(){
		rg = new ReservationGateway();
		reservationtList.removeAll(reservationtList);
		reservationtList.addAll(rg.view());
		
		for(Reservation e: reservationtList){
			view.getModel4().addRow(new Object[] {e.getId(), e.getFlightId(), e.getClientId(), e.getTickets(), e.getPrice()});
		}
	}
	
	public void clearReservationTable(){
		for(int i = view.getModel4().getRowCount()-1 ; i>=0; i--){
			view.getModel4().removeRow(i);
		}
	}
	
	public void populateReservationCombo(){
		view.getC4().addItem(0);
		for(Reservation e : reservationtList){
			view.getC4().addItem(e.getId());
		}
	}
	
	public void removeReservationCombo(){
		view.getC4().removeAllItems();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == view.getB1()) {			// Add Flight
			
			int pilotId = (int) view.getC2().getSelectedItem();
			int planeId = (int) view.getC3().getSelectedItem();
			String departure = view.getF1().getText();
			String destination = view.getF2().getText();
			String date = view.getF3().getText();
			String hour = view.getF4().getText();
			int km = Integer.parseInt(view.getF5().getText());
			float price = Float.parseFloat(view.getF6().getText());
			
			Flight flight = new Flight(0, pilotId, planeId, departure, destination, date, hour, km, price);
			
			FlightGateway fg = new FlightGateway();
			fg.add(flight);
			
			clearFlightTable();
			populateFlightTable();
			removeFlightCombo();
			populateFlightCombo();
			
		} else if(e.getSource() == view.getB2()) {	// Update Flight
			
			int pilotId = (int) view.getC2().getSelectedItem();
			int planeId = (int) view.getC3().getSelectedItem();
			String departure = view.getF1().getText();
			String destination = view.getF2().getText();
			String date = view.getF3().getText();
			String hour = view.getF4().getText();
			int km = Integer.parseInt(view.getF5().getText());
			float price = Float.parseFloat(view.getF6().getText());
			
			Flight flight = new Flight((int) view.getC1().getSelectedItem(), pilotId, planeId, departure, destination, date, hour, km, price);
			
			FlightGateway fg = new FlightGateway();
			fg.update(flight);
			
			clearFlightTable();
			populateFlightTable();
			removeFlightCombo();
			populateFlightCombo();
			
		} else if(e.getSource() == view.getB3()) {	// View Flight
			
			fg = new FlightGateway();
			
			int id = (int) view.getC1().getSelectedItem();
			
			if(view.getC1().getSelectedIndex() == 0){
				clearFlightTable();
				populateFlightTable();
			} else {
				clearFlightTable();
				for(Flight em: flightList){
					if(em.getId() == id){
						view.getModel1().addRow(new Object[] {em.getId(), em.getPilotId(), em.getPlaneId(), em.getDeparture(), em.getDestination(), em.getDate(), em.getHour(), em.getKm(), em.getPilotId()});
					}
				}
			}
			
		} else if(e.getSource() == view.getB4()) {	// Delete Flight
			
			FlightGateway fg = new FlightGateway();
			fg.delete((int) view.getC1().getSelectedItem());
			
			clearFlightTable();
			populateFlightTable();
			removeFlightCombo();
			populateFlightCombo();
			
		} else if(e.getSource() == view.getB5()) {	// Add Pilot
			
			Pilot pilot = new Pilot(0, view.getF7().getText(), view.getF8().getText());
			
			PilotGateway plg = new PilotGateway();
			plg.add(pilot);
			
			clearPilotTable();
			populatePilotTable();
			removePilotCombo();
			populatePilotCombo();
			
		} else if(e.getSource() == view.getB6()) {	// Update Pilot
			
			Pilot pilot = new Pilot((int) view.getC2().getSelectedItem(), view.getF7().getText(), view.getF8().getText());
			
			PilotGateway plg = new PilotGateway();
			plg.update(pilot);
			
			clearPilotTable();
			populatePilotTable();
			removePilotCombo();
			populatePilotCombo();
			
			
		} else if(e.getSource() == view.getB7()) {	// View Pilot
			
			plg = new PilotGateway();
			
			int id = (int) view.getC2().getSelectedItem();
			
			if(view.getC2().getSelectedIndex() == 0){
				clearPilotTable();
				populatePilotTable();
			} else {
				clearPilotTable();
				for(Pilot em: pilotList){
					if(em.getId() == id){
						view.getModel2().addRow(new Object[] {em.getId(), em.getUser()});
					}
				}
			}
			
		} else if(e.getSource() == view.getB8()) {	// Delete Pilot
			
			PilotGateway plg = new PilotGateway();
			plg.delete((int) view.getC2().getSelectedItem());
			
			clearPilotTable();
			populatePilotTable();
			removePilotCombo();
			populatePilotCombo();
			
		} else if(e.getSource() == view.getB9()) {	// Add Reservation
			
			int flightId = (int) view.getC1().getSelectedItem();
			int clientId = (int) view.getC5().getSelectedItem();
			int tickets = Integer.parseInt(view.getF11().getText());
			float price = 0;
			for(Flight f : flightList){
				if(flightId == f.getId()){
					price = f.getPrice();
				}
			}
			float totalPrice = Integer.parseInt(view.getF11().getText()) * price;
			
			Reservation reservation = new Reservation(0, flightId, clientId, tickets, totalPrice);
			
			ReservationGateway rg = new ReservationGateway();
			rg.add(reservation);
			
			clearReservationTable();
			populateReservationTable();
			removeReservationCombo();
			populateReservationCombo();
			
		} else if(e.getSource() == view.getB10()) {	// Update Reservation
			
			int flightId = (int) view.getC1().getSelectedItem();
			int clientId = (int) view.getC5().getSelectedItem();
			int tickets = Integer.parseInt(view.getF11().getText());
			float price = 0;
			for(Flight f : flightList){
				if(flightId == f.getId()){
					price = f.getPrice();
				}
			}
			float totalPrice = Integer.parseInt(view.getF11().getText()) * price;
			
			Reservation reservation = new Reservation((int) view.getC4().getSelectedItem(), flightId, clientId, tickets, totalPrice);
			
			ReservationGateway rg = new ReservationGateway();
			rg.update(reservation);
			
			clearReservationTable();
			populateReservationTable();
			removeReservationCombo();
			populateReservationCombo();
			 
		} else if(e.getSource() == view.getB11()) {	// View Reservation
			
			rg = new ReservationGateway();
			
			int id = (int) view.getC4().getSelectedItem();
			
			if(view.getC4().getSelectedIndex() == 0){
				clearReservationTable();
				populateReservationTable();
			} else {
				clearReservationTable();
				for(Reservation em: reservationtList){
					if(em.getId() == id){
						view.getModel4().addRow(new Object[] {em.getId(), em.getFlightId(), em.getClientId(), em.getTickets(), em.getPrice()});
					}
				}
			}
			
		} else if(e.getSource() == view.getB12()) {	// Delete Reservation
			
			ReservationGateway rg = new ReservationGateway();
			rg.delete((int) view.getC4().getSelectedItem());
			
			clearReservationTable();
			populateReservationTable();
			removeReservationCombo();
			populateReservationCombo();
			
		} else if(e.getSource() == view.getB13()) {	// Add Plane
			
			Plane plane = new Plane(0, Integer.parseInt(view.getF9().getText()), view.getF10().getText());
			
			PlaneGateway pg = new PlaneGateway();
			pg.add(plane);
			
			clearPlaneTable();
			populatePlaneTable();
			removePlaneCombo();
			populatePlaneCombo();
			
		} else if(e.getSource() == view.getB14()) {	// Update Plane
			
			Plane plane = new Plane((int) view.getC3().getSelectedItem(), Integer.parseInt(view.getF9().getText()), view.getF10().getText());
			
			PlaneGateway pg = new PlaneGateway();
			pg.update(plane);
			
			clearPlaneTable();
			populatePlaneTable();
			removePlaneCombo();
			populatePlaneCombo();
			
		} else if(e.getSource() == view.getB15()) {	// View Plane
			
			pg = new PlaneGateway();
			
			int id = (int) view.getC3().getSelectedItem();
			
			if(view.getC3().getSelectedIndex() == 0){
				clearPlaneTable();
				populatePlaneTable();
			} else {
				clearPlaneTable();
				for(Plane em: planeList){
					if(em.getId() == id){
						view.getModel3().addRow(new Object[] {em.getId(), em.getCapacity(), em.getModel()});
					}
				}
			}
			
		} else if(e.getSource() == view.getB16()) {	// Delete Plane
			
			PlaneGateway pg = new PlaneGateway();
			pg.delete((int) view.getC3().getSelectedItem());
			
			clearPlaneTable();
			populatePlaneTable();
			removePlaneCombo();
			populatePlaneCombo();
			
		} else if(e.getSource() == view.getB17()) {	// Logout
			view.getFrame().setVisible(false);
			sc = new StartController();
			
		} else if(e.getSource() == view.getB18()) {	// Login
			
		} else if(e.getSource() == view.getB19()) {	// Back
			
		}
	}
}