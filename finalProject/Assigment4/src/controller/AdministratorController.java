package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JComboBox;

import dataAccess.EmployeeGateway;
import model.Employee;
import view.AdministratorView;

public class AdministratorController implements ActionListener{
	
	List<Employee> employeeList = new LinkedList();
	
	private EmployeeGateway employeeGateway;
	
	private AdministratorView view;
	private StartController sc;
	
	private Employee employee;
	
	public AdministratorController(){
		
		view = new AdministratorView();
		view.getFrame().setVisible(true);
		
		populateTable();
		populateCombo();
		
		this.view.addItemListener(this);
		
	}

	public void populateTable(){
		employeeGateway = new EmployeeGateway();
		employeeList.removeAll(employeeList);
		employeeList.addAll(employeeGateway.view());
		
		for(Employee e: employeeList){
			view.getModel1().addRow(new Object[] {e.getId(), e.getUser()});
		}
	}
	
	public void clearTable(){
		for(int i = view.getModel1().getRowCount()-1 ; i>=0; i--){
			view.getModel1().removeRow(i);
		}
	}
	
	public void populateCombo(){
		view.getC1().addItem(0);
		for(Employee e : employeeList){
			view.getC1().addItem(e.getId());
		}
	}
	
	public void removeCombo(){
		view.getC1().removeAllItems();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == view.getB1()) {			// Add Employee
			employeeGateway = new EmployeeGateway();
			
			employee = new Employee(0, view.getF1().getText(), view.getF2().getText());
			employeeGateway.add(employee);
			
			clearTable();
			populateTable();
			removeCombo();
			populateCombo();
			
			
		} else if(e.getSource() == view.getB2()) {	// Update Employee
			
			int id = (int) view.getC1().getSelectedItem();
			
			employee = new Employee(id, view.getF1().getText(), view.getF2().getText());
			employeeGateway.update(employee);
			
			clearTable();
			populateTable();
			
		} else if(e.getSource() == view.getB3()) {	// View Employee
			
			employeeGateway = new EmployeeGateway();
			
			int id = (int) view.getC1().getSelectedItem();
			
			if(view.getC1().getSelectedIndex() == 0){
				clearTable();
				populateTable();
			} else {
				clearTable();
				for(Employee em: employeeList){
					if(em.getId() == id){
						view.getModel1().addRow(new Object[] {em.getId(), em.getUser()});
					}
				}
			}
			
		} else if(e.getSource() == view.getB4()) {	// Delete Employee
			
			int id = (int) view.getC1().getSelectedItem();
			
			employeeGateway = new EmployeeGateway();
			employeeGateway.delete(id);
			
			clearTable();
			populateTable();
			removeCombo();
			populateCombo();
			
			
		} else if(e.getSource() == view.getB5()) {	// Logout
			view.getFrame().setVisible(false);
			sc = new StartController();
			
		} else if(e.getSource() == view.getB6()) {	// Login
			
		} else if(e.getSource() == view.getB7()) {	// Back
			
		}
		
	}

}
