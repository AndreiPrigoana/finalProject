package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import dataAccess.FlightGateway;
import model.Flight;
import view.PilotView;

public class PilotController implements ActionListener{
	
	List<Flight> flightList = new LinkedList();
	
	private PilotView view;
	private StartController cs;
	
	private FlightGateway fg;
	
	public PilotController(){
		view = new PilotView();
		view.getFrame().setVisible(true);
		
		clearFlightTable();
		populateFlightTable();
		
		this.view.addItemListener(this);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == view.getB1()){
			view.getFrame().setVisible(false);
			cs = new StartController();
		}	
	}
}