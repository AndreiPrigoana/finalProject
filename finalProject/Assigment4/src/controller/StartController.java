package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.StartView;

public class StartController implements ActionListener{
	
	private StartView view;
	
	private AdministratorController ac;
	private EmployeeController ec;
	private ClientController cc;
	private PilotController pc;
	
	public StartController(){
		view = new StartView();
		view.getFrame().setVisible(true);
		
		this.view.addItemListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == view.getB1()) {			// admin
			view.getFrame().setVisible(false);
			ac = new AdministratorController();
			
		} else if (e.getSource() == view.getB2()){	// employee
			view.getFrame().setVisible(false);
			ec =  new EmployeeController();
			
		} else if (e.getSource() == view.getB3()){ 	// client
			view.getFrame().setVisible(false);
			cc = new ClientController();
			
		} else if (e.getSource() == view.getB4()){	// pilot
			view.getFrame().setVisible(false);
			pc = new PilotController();
			
		}
		
	}

}
