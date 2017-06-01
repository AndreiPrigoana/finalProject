package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AdministratorView {
	
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

	private JTextField f1;
	private JTextField f2;
	private JTextField f3;
	private JTextField f4;
	
	private JComboBox c1;
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	
	public AdministratorView(){
		
		frame = new JFrame("Administrator");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame1 = new JFrame("Administrator");
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
		
		b1 = new JButton("Add");
		b2 = new JButton("Update");
		b3 = new JButton("View");
		b4 = new JButton("Delete");
		b5 = new JButton("Logout");
		b6 = new JButton("Login");
		b7 = new JButton("Back");
		
		f1 = new JTextField(); // Employee user
		f2 = new JTextField(); // Employee password
		f3 = new JTextField(); // Login user
		f4 = new JTextField(); // Login Password
		
		c1 = new JComboBox<>();
		
		l1 = new JLabel("Employee Username:");
		l2 = new JLabel("Employee password:");
		l3 = new JLabel("Employee id:");
		l4 = new JLabel("Custommer service employees:");
		l5 = new JLabel("User");
		l6 = new JLabel("Password");
		
		// ------------------------------------------- TABELS ------------------------------------------- //
		
		model1 = new DefaultTableModel(); // Doctor Table
		model1.addColumn("Id");
		model1.addColumn("UserName");
		t1 = new JTable(model1);
		p2.setBounds(280, 100, 800, 130);
		scroll1 = new JScrollPane(t1);
		p2.add(scroll1);
		p1.add(p2);
		
		// ---------------------------------------------------------------------------------------------- //

		b1.setBounds(510, 530, 150, 25);
		p1.add(b1);
		b2.setBounds(510, 600, 150, 25);
		p1.add(b2);
		b3.setBounds(690, 530, 150, 25);
		p1.add(b3);
		b4.setBounds(690, 600, 150, 25);
		p1.add(b4);
		
		b5.setBounds(600, 30, 150, 25);
		b5.setForeground(Color.RED);
		p1.add(b5);
		
		b6.setBounds(600, 400, 150, 25);
		p3.add(b6);
		b7.setBounds(600, 440, 150, 25);
		p3.add(b7);
		
		f1.setBounds(580, 300, 200, 20);
		p1.add(f1);
		f2.setBounds(580, 380, 200, 20);
		p1.add(f2);
		
		c1.setBounds(580, 460, 200, 20);
		p1.add(c1);
		
		f3.setBounds(570, 300, 200, 20);
		p3.add(f3);
		f4.setBounds(570, 350, 200, 20);
		p3.add(f4);
		
		l1.setBounds(580, 280, 120, 20);
		p1.add(l1);
		l2.setBounds(580, 360, 120, 20);
		p1.add(l2);
		l3.setBounds(580, 440, 120, 20);
		p1.add(l3);
		l4.setBounds(280, 35, 500, 100);
		Font f = new Font("serif", Font.PLAIN, 25);
		l4.setFont(f);
		p1.add(l4);
		
		l5.setBounds(570, 280, 120, 20);
		p3.add(l5);
		l6.setBounds(570, 330, 120, 20);
		p3.add(l6);
		
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

	public JComboBox getC1() {
		return c1;
	}

	public void setC1(JComboBox c1) {
		this.c1 = c1;
	}
	
}
