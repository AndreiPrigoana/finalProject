package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ClientView {
	
	private JFrame frame;
	private JFrame frame1;
	
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	
	private JLabel label1;
	private JLabel label2;
	
	private DefaultTableModel model1;
	
	private JTable t1;
	
	private JScrollPane scroll1;
	
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	
	private JTextField f1;
	private JTextField f2;
	private JTextField f3;
	private JTextField f4;
	private JTextField f5;
	private JTextField f6;
	private JTextField f7;
	
	private JComboBox c1;
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	private JLabel l7;
	
	public ClientView(){
		
		frame = new JFrame("Employee");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame1 = new JFrame("Employee");
		frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		p1 = new JPanel();
		frame.add(p1);
		
		p2 = new JPanel();
		
		p3 = new JPanel();
		frame1.add(p3);
		
		label1 = new JLabel();
		label2 = new JLabel();
		
		p1.setLayout( new BorderLayout() );
		p2.setLayout( new BorderLayout() );
		p3.setLayout( new BorderLayout() );
		

		b1 = new JButton("Add");		// Reservation
		b2 = new JButton("Update");		// Reservation
		b3 = new JButton("View");		// Reservation
		b4 = new JButton("Delete");		// Reservation
		b5 = new JButton("Logout");		
		b6 = new JButton("Login");		
		b7 = new JButton("Back");	
		b8 = new JButton("Create client");	
		
		f1 = new JTextField(); // CNP
		f2 = new JTextField(); // Name
		f3 = new JTextField(); // Address
		f4 = new JTextField(); // User
		f5 = new JTextField(); // Password
		f6 = new JTextField(); // Password
		f7 = new JTextField(); // tickets
		
		c1 = new JComboBox<>();	// Flight id
		
		l1 = new JLabel("CNP:");
		l2 = new JLabel("Name:");
		l3 = new JLabel("Address:");
		l4 = new JLabel("Flight id:");
		l5 = new JLabel("Flights...");
		l6 = new JLabel("Password:");
		l7 = new JLabel("Tickets:");
		
		// ------------------------------------------- TABELS ------------------------------------------- //

		model1 = new DefaultTableModel(); // Flights Table
		model1.addColumn("Id");
		model1.addColumn("Departure");
		model1.addColumn("Destination");
		model1.addColumn("Date");
		model1.addColumn("Hour");
		model1.addColumn("Km");
		model1.addColumn("Price");
		t1 = new JTable(model1);
		p2.setBounds(82, 70, 1200, 100);
		scroll1 = new JScrollPane(t1);
		p2.add(scroll1);
		p1.add(p2);
		
		// ---------------------------------------------------------------------------------------------- //
		
		
		b1.setBounds(457, 550, 100, 25);	// Flight
		p1.add(b1);
		b2.setBounds(577, 550, 100, 25);
		p1.add(b2);
		b3.setBounds(697, 550, 100, 25);
		p1.add(b3);
		b4.setBounds(817, 550, 100, 25);
		p1.add(b4);
		
		b8.setBounds(600, 630, 130, 25);
		p1.add(b8);
		
		b5.setBounds(600, 10, 150, 25);
		b5.setForeground(Color.RED);
		p1.add(b5);
		
		b6.setBounds(600, 400, 150, 25);
		p3.add(b6);
		b7.setBounds(600, 440, 150, 25);
		p3.add(b7);
		
		
		f1.setBounds(600, 250, 150, 20);
		p1.add(f1);
		f2.setBounds(600, 310, 150, 20);
		p1.add(f2);
		f3.setBounds(600, 370, 150, 20);
		p1.add(f3);
		f6.setBounds(50, 370, 150, 20);
		//p1.add(f6);
		c1.setBounds(600, 430, 150, 20);
		p1.add(c1);
		f7.setBounds(600, 490, 150, 20);
		p1.add(f7);
		
		f4.setBounds(600, 350, 150, 20);
		p3.add(f4);
		f5.setBounds(600, 370, 150, 20);
		p3.add(f5);

		
		l1.setBounds(600, 225, 120, 20);
		p1.add(l1);
		l2.setBounds(600, 285, 120, 20);
		p1.add(l2);
		l3.setBounds(600, 345, 120, 20);
		p1.add(l3);
		l4.setBounds(600, 405, 120, 20);
		p1.add(l4);
		l5.setBounds(90, 20, 200, 50);
		Font f = new Font("serif", Font.PLAIN, 40);
		l5.setFont(f);
		p1.add(l5);
		l7.setBounds(600, 465, 120, 20);
		p1.add(l7);
		
		
		p1.add(label1);
		p3.add(label2);
		
		frame.setVisible(false);
		frame1.setVisible(false);

	}
	
	public void addItemListener(ActionListener a) {
		b1.addActionListener(a);
		b2.addActionListener(a);
		b3.addActionListener(a);
		b4.addActionListener(a);
		b5.addActionListener(a);
		b6.addActionListener(a);
		b7.addActionListener(a);
		b8.addActionListener(a);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JFrame getFrame1() {
		return frame1;
	}

	public void setFrame1(JFrame frame1) {
		this.frame1 = frame1;
	}

	public DefaultTableModel getModel1() {
		return model1;
	}

	public void setModel1(DefaultTableModel model1) {
		this.model1 = model1;
	}

	public JTable getT1() {
		return t1;
	}

	public void setT1(JTable t1) {
		this.t1 = t1;
	}

	public JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}

	public JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	public JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		this.b3 = b3;
	}

	public JButton getB4() {
		return b4;
	}

	public void setB4(JButton b4) {
		this.b4 = b4;
	}

	public JButton getB5() {
		return b5;
	}

	public void setB5(JButton b5) {
		this.b5 = b5;
	}

	public JButton getB6() {
		return b6;
	}

	public void setB6(JButton b6) {
		this.b6 = b6;
	}

	public JButton getB7() {
		return b7;
	}

	public void setB7(JButton b7) {
		this.b7 = b7;
	}

	public JTextField getF1() {
		return f1;
	}

	public void setF1(JTextField f1) {
		this.f1 = f1;
	}

	public JTextField getF2() {
		return f2;
	}

	public void setF2(JTextField f2) {
		this.f2 = f2;
	}

	public JTextField getF3() {
		return f3;
	}

	public void setF3(JTextField f3) {
		this.f3 = f3;
	}

	public JTextField getF4() {
		return f4;
	}

	public void setF4(JTextField f4) {
		this.f4 = f4;
	}

	public JTextField getF5() {
		return f5;
	}

	public void setF5(JTextField f5) {
		this.f5 = f5;
	}

	public JTextField getF6() {
		return f6;
	}

	public void setF6(JTextField f6) {
		this.f6 = f6;
	}

	public JComboBox getC1() {
		return c1;
	}

	public void setC1(JComboBox c1) {
		this.c1 = c1;
	}

	public JButton getB8() {
		return b8;
	}

	public void setB8(JButton b8) {
		this.b8 = b8;
	}

	public JTextField getF7() {
		return f7;
	}

	public void setF7(JTextField f7) {
		this.f7 = f7;
	}
	
}
