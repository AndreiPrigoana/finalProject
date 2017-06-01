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

public class EmployeeView {

	private JFrame frame;
	private JFrame frame1;
	
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JPanel p4;
	private JPanel p5;
	private JPanel p6;
	
	private JLabel label1;
	private JLabel label2;
	
	private DefaultTableModel model1;
	private DefaultTableModel model2;
	private DefaultTableModel model3;
	private DefaultTableModel model4;
	
	private JTable t1;
	private JTable t2;
	private JTable t3;
	private JTable t4;
	
	private JScrollPane scroll1;
	private JScrollPane scroll2;
	private JScrollPane scroll3;
	private JScrollPane scroll4;
	
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton b10;
	private JButton b11;
	private JButton b12;
	private JButton b13;
	private JButton b14;
	private JButton b15;
	private JButton b16;
	private JButton b17;
	private JButton b18;
	private JButton b19;
	
	private JTextField f1;
	private JTextField f2;
	private JTextField f3;
	private JTextField f4;
	private JTextField f5;
	private JTextField f6;
	private JTextField f7;
	private JTextField f8;
	private JTextField f9;
	private JTextField f10;
	private JTextField f11;
	private JTextField f12;
	private JTextField f13;
	private JTextField f14;
	private JTextField f15;
	
	private JComboBox c1;
	private JComboBox c2;
	private JComboBox c3;
	private JComboBox c4;
	private JComboBox c5;
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	private JLabel l7;
	private JLabel l8;
	private JLabel l9;
	private JLabel l10;
	private JLabel l11;
	private JLabel l12;
	private JLabel l13;
	private JLabel l14;
	private JLabel l15;
	private JLabel l16;
	private JLabel l17;
	private JLabel l18;
	private JLabel l19;
	private JLabel l20;
	private JLabel l21;
	private JLabel l22;
	
	public EmployeeView(){
		
		frame = new JFrame("Employee");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame1 = new JFrame("Employee");
		frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		p1 = new JPanel();
		frame.add(p1);
		
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		
		p6 = new JPanel();
		frame1.add(p6);
		
		label1 = new JLabel();
		label2 = new JLabel();
		
		p1.setLayout( new BorderLayout() );
		p2.setLayout( new BorderLayout() );
		p3.setLayout( new BorderLayout() );
		p4.setLayout( new BorderLayout() );
		p5.setLayout( new BorderLayout() );
		
		b1 = new JButton("Add");		// Flight
		b2 = new JButton("Update");		// Flight
		b3 = new JButton("View");		// Flight
		b4 = new JButton("Delete");		// Flight
		b5 = new JButton("Add");		// Pilot
		b6 = new JButton("Update");		// Pilot
		b7 = new JButton("View");		// Pilot
		b8 = new JButton("Delete");		// Pilot
		b9 = new JButton("Add");		// Reservation
		b10 = new JButton("Update");	// Reservation
		b11 = new JButton("View");		// Reservation
		b12 = new JButton("Delete");	// Reservation
		b13 = new JButton("Add");		// Plane
		b14 = new JButton("Update");	// Plane
		b15 = new JButton("View");		// Plane
		b16 = new JButton("Delete");	// Plane
		b17 = new JButton("Logout");
		b18 = new JButton("Login");
		b19 = new JButton("Back");
		
		f1 = new JTextField(); // Departure
		f2 = new JTextField(); // Destination
		f3 = new JTextField(); // Date
		f4 = new JTextField(); // Hour
		f5 = new JTextField(); // Km
		f6 = new JTextField(); // Price
		f7 = new JTextField(); // Pilot User
		f8 = new JTextField(); // Pilot Password
		f9 = new JTextField(); // Plane Capacity
		f10 = new JTextField(); // Plane Model
		f11 = new JTextField(); // Reservation tickets
		f12 = new JTextField(); // Reservation Price
		f13 = new JTextField(); // Client address
		f14 = new JTextField(); // User
		f15 = new JTextField(); // Password
		
		c1 = new JComboBox<>();	// Flight id
		c2 = new JComboBox<>(); // Pilot id
		c3 = new JComboBox<>();	// Plane id
		c4 = new JComboBox<>();	// Reservation id
		c5 = new JComboBox<>();	// Client id
		
		l1 = new JLabel("Flight id:");
		l2 = new JLabel("Pilot id:");
		l3 = new JLabel("Plane id:");
		l4 = new JLabel("Departure:");
		l5 = new JLabel("Destination");
		l6 = new JLabel("Date:");
		l7 = new JLabel("Hour:");
		l8 = new JLabel("Km:");
		l9 = new JLabel("Price");
		l10 = new JLabel("User");
		l11 = new JLabel("Password");
		l12 = new JLabel("Capacity");
		l13 = new JLabel("Model");
		
		l14 = new JLabel("Reservation id:");
		l15 = new JLabel("Client id:");
		l16 = new JLabel("tickets:");

		l17 = new JLabel("Flights...");
		l18 = new JLabel("Pilots...");
		l19 = new JLabel("Planes...");
		l20 = new JLabel("Reservations...");
		
		l21 = new JLabel("User");
		l22 = new JLabel("Password");
		
		// ------------------------------------------- TABELS ------------------------------------------- //

		model1 = new DefaultTableModel(); // Flights Table
		model1.addColumn("Id");
		model1.addColumn("Pilot id");
		model1.addColumn("Plane id");
		model1.addColumn("Departure");
		model1.addColumn("Destination");
		model1.addColumn("Date");
		model1.addColumn("Hour");
		model1.addColumn("Km");
		model1.addColumn("Price");
		t1 = new JTable(model1);
		p2.setBounds(82, 50, 1200, 100);
		scroll1 = new JScrollPane(t1);
		p2.add(scroll1);
		p1.add(p2);
		
		model2 = new DefaultTableModel(); // Pilots Table
		model2.addColumn("Id");
		model2.addColumn("User");
		t2 = new JTable(model2);
		p3.setBounds(82, 170, 250, 300);
		scroll2 = new JScrollPane(t2);
		p3.add(scroll2);
		p1.add(p3);
		
		model3 = new DefaultTableModel(); // Planes Table
		model3.addColumn("Id");
		model3.addColumn("Capacity");
		model3.addColumn("Model");
		t3 = new JTable(model3);
		p4.setBounds(980, 170, 300, 300);
		scroll3 = new JScrollPane(t3);
		p4.add(scroll3);
		p1.add(p4);
		
		model4 = new DefaultTableModel(); // Reservations Table
		model4.addColumn("Id");
		model4.addColumn("Flight id");
		model4.addColumn("Client id");
		model4.addColumn("Tickets");
		model4.addColumn("Price");
		t4 = new JTable(model4);
		p5.setBounds(82, 500, 1200, 100);
		scroll4 = new JScrollPane(t4);
		p5.add(scroll4);
		p1.add(p5);
		
		// ---------------------------------------------------------------------------------------------- //
		
		b1.setBounds(427, 170, 100, 25);	// Flight
		p1.add(b1);
		b2.setBounds(547, 170, 100, 25);
		p1.add(b2);
		b3.setBounds(667, 170, 100, 25);
		p1.add(b3);
		b4.setBounds(787, 170, 100, 25);
		p1.add(b4);
		
		b5.setBounds(0, 220, 75, 25); 		// Pilot
		p1.add(b5);
		b6.setBounds(0, 270, 75, 25);
		p1.add(b6);
		b7.setBounds(0, 320, 75, 25);
		p1.add(b7);
		b8.setBounds(0, 370, 75, 25);
		p1.add(b8);
		
		b9.setBounds(427, 670, 100, 25); 	// Reservation
		p1.add(b9);
		b10.setBounds(547, 670, 100, 25);
		p1.add(b10);
		b11.setBounds(667, 670, 100, 25);
		p1.add(b11);
		b12.setBounds(787, 670, 100, 25);	
		p1.add(b12);
		
		b13.setBounds(1290, 220, 75, 25);	// Planes
		p1.add(b13);
		b14.setBounds(1290, 270, 75, 25);
		p1.add(b14);
		b15.setBounds(1290, 320, 75, 25);
		p1.add(b15);
		b16.setBounds(1290, 370, 75, 25);
		p1.add(b16);
		
		b17.setBounds(600, 10, 150, 25);
		b17.setForeground(Color.RED);
		p1.add(b17);
		
		b18.setBounds(600, 400, 150, 25);
		p6.add(b18);
		b19.setBounds(600, 440, 150, 25);
		p6.add(b19);
		
		c1.setBounds(377, 230, 150, 20); // UP
		p1.add(c1);
		c2.setBounds(577, 230, 150, 20);
		p1.add(c2);
		c3.setBounds(777, 230, 150, 20);
		p1.add(c3);
		
		c4.setBounds(250, 640, 150, 20); // DOWN, Reservation
		p1.add(c4);
		c5.setBounds(475, 640, 150, 20);
		p1.add(c5);
		f11.setBounds(675, 640, 150, 20);
		p1.add(f11);
		f12.setBounds(900, 640, 150, 20);
		p1.add(f12);
		
		f1.setBounds(377, 275, 150, 20); // Flight
		p1.add(f1);
		f2.setBounds(577, 275, 150, 20);
		p1.add(f2);
		f3.setBounds(377, 320, 150, 20);
		p1.add(f3);
		f4.setBounds(577, 320, 150, 20);
		p1.add(f4);
		f5.setBounds(777, 275, 150, 20);
		p1.add(f5);
		f6.setBounds(777, 320, 150, 20);
		p1.add(f6);
		
		f7.setBounds(377, 400, 150, 20); // Pilot
		p1.add(f7);
		f8.setBounds(377, 450, 150, 20);
		p1.add(f8);
		
		f9.setBounds(777, 400, 150, 20); // Plane
		p1.add(f9);
		f10.setBounds(777, 450, 150, 20);
		p1.add(f10);
		
		
		l1.setBounds(377, 210, 120, 20);
		p1.add(l1);
		l2.setBounds(577, 210, 120, 20);
		p1.add(l2);
		l3.setBounds(777, 210, 120, 20);
		p1.add(l3);
		l4.setBounds(377, 255, 120, 20);
		p1.add(l4);
		l5.setBounds(577, 255, 120, 20);
		p1.add(l5);
		l6.setBounds(377, 300, 120, 20);
		p1.add(l6);
		l7.setBounds(577, 300, 120, 20);
		p1.add(l7);
		l8.setBounds(777, 255, 120, 20);
		p1.add(l8);
		l9.setBounds(777, 300, 120, 20);
		p1.add(l9);
		l10.setBounds(377, 375, 120, 20);
		p1.add(l10);
		l11.setBounds(377, 425, 120, 20);
		p1.add(l11);
		l12.setBounds(777, 375, 120, 20);
		p1.add(l12);
		l13.setBounds(777, 425, 120, 20);
		p1.add(l13);
		
		l14.setBounds(250, 615, 120, 20); // DOWN
		p1.add(l14);
		l15.setBounds(475, 615, 120, 20);
		p1.add(l15);
		l16.setBounds(675, 615, 120, 20);
		p1.add(l16);
		
		
		
		l17.setBounds(85, 0, 300, 65); // Table Names
		Font f = new Font("serif", Font.PLAIN, 40);
		l17.setFont(f);
		p1.add(l17);
		l18.setBounds(85, 150, 120, 20);
		Font ff = new Font("serif", Font.PLAIN, 20);
		l18.setFont(ff);
		p1.add(l18);
		l19.setBounds(980, 150, 120, 20);
		l19.setFont(ff);
		p1.add(l19);
		l20.setBounds(85, 470, 300, 30);
		Font fff = new Font("serif", Font.PLAIN, 30);
		l20.setFont(fff);
		p1.add(l20);
		
		p1.add(label1);
		p6.add(label2);
		
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
		b9.addActionListener(a);
		b10.addActionListener(a);
		b11.addActionListener(a);
		b12.addActionListener(a);
		b13.addActionListener(a);
		b14.addActionListener(a);
		b15.addActionListener(a);
		b16.addActionListener(a);
		b17.addActionListener(a);
		b18.addActionListener(a);
		b19.addActionListener(a);
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

	public DefaultTableModel getModel2() {
		return model2;
	}

	public void setModel2(DefaultTableModel model2) {
		this.model2 = model2;
	}

	public DefaultTableModel getModel3() {
		return model3;
	}

	public void setModel3(DefaultTableModel model3) {
		this.model3 = model3;
	}

	public DefaultTableModel getModel4() {
		return model4;
	}

	public void setModel4(DefaultTableModel model4) {
		this.model4 = model4;
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

	public JButton getB8() {
		return b8;
	}

	public void setB8(JButton b8) {
		this.b8 = b8;
	}

	public JButton getB9() {
		return b9;
	}

	public void setB9(JButton b9) {
		this.b9 = b9;
	}

	public JButton getB10() {
		return b10;
	}

	public void setB10(JButton b10) {
		this.b10 = b10;
	}

	public JButton getB11() {
		return b11;
	}

	public void setB11(JButton b11) {
		this.b11 = b11;
	}

	public JButton getB12() {
		return b12;
	}

	public void setB12(JButton b12) {
		this.b12 = b12;
	}

	public JButton getB13() {
		return b13;
	}

	public void setB13(JButton b13) {
		this.b13 = b13;
	}

	public JButton getB14() {
		return b14;
	}

	public void setB14(JButton b14) {
		this.b14 = b14;
	}

	public JButton getB15() {
		return b15;
	}

	public void setB15(JButton b15) {
		this.b15 = b15;
	}

	public JButton getB16() {
		return b16;
	}

	public void setB16(JButton b16) {
		this.b16 = b16;
	}

	public JButton getB17() {
		return b17;
	}

	public void setB17(JButton b17) {
		this.b17 = b17;
	}

	public JButton getB18() {
		return b18;
	}

	public void setB18(JButton b18) {
		this.b18 = b18;
	}

	public JButton getB19() {
		return b19;
	}

	public void setB19(JButton b19) {
		this.b19 = b19;
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

	public JTextField getF7() {
		return f7;
	}

	public void setF7(JTextField f7) {
		this.f7 = f7;
	}

	public JTextField getF8() {
		return f8;
	}

	public void setF8(JTextField f8) {
		this.f8 = f8;
	}

	public JTextField getF9() {
		return f9;
	}

	public void setF9(JTextField f9) {
		this.f9 = f9;
	}

	public JTextField getF10() {
		return f10;
	}

	public void setF10(JTextField f10) {
		this.f10 = f10;
	}

	public JTextField getF11() {
		return f11;
	}

	public void setF11(JTextField f11) {
		this.f11 = f11;
	}

	public JTextField getF12() {
		return f12;
	}

	public void setF12(JTextField f12) {
		this.f12 = f12;
	}

	public JTextField getF13() {
		return f13;
	}

	public void setF13(JTextField f13) {
		this.f13 = f13;
	}

	public JTextField getF14() {
		return f14;
	}

	public void setF14(JTextField f14) {
		this.f14 = f14;
	}

	public JTextField getF15() {
		return f15;
	}

	public void setF15(JTextField f15) {
		this.f15 = f15;
	}

	public JComboBox getC1() {
		return c1;
	}

	public void setC1(JComboBox c1) {
		this.c1 = c1;
	}

	public JComboBox getC2() {
		return c2;
	}

	public void setC2(JComboBox c2) {
		this.c2 = c2;
	}

	public JComboBox getC3() {
		return c3;
	}

	public void setC3(JComboBox c3) {
		this.c3 = c3;
	}

	public JComboBox getC4() {
		return c4;
	}

	public void setC4(JComboBox c4) {
		this.c4 = c4;
	}

	public JComboBox getC5() {
		return c5;
	}

	public void setC5(JComboBox c5) {
		this.c5 = c5;
	}
	
}