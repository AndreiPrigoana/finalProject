package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PilotView {
	
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
	
	public PilotView(){
		
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
		

		b1 = new JButton("Back");
		
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
		p2.setBounds(82, 120, 1200, 500);
		scroll1 = new JScrollPane(t1);
		p2.add(scroll1);
		p1.add(p2);
		
		// ---------------------------------------------------------------------------------------------- //

		b1.setBounds(600, 50, 150, 25);
		b1.setForeground(Color.RED);
		p1.add(b1);
		
		
		p1.add(label1);
		p3.add(label2);
		
		frame.setVisible(true);
		frame1.setVisible(false);
		
	}
	
	public void addItemListener(ActionListener a) {
		b1.addActionListener(a);
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

	public JPanel getP1() {
		return p1;
	}

	public void setP1(JPanel p1) {
		this.p1 = p1;
	}

	public JPanel getP2() {
		return p2;
	}

	public void setP2(JPanel p2) {
		this.p2 = p2;
	}

	public JPanel getP3() {
		return p3;
	}

	public void setP3(JPanel p3) {
		this.p3 = p3;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public void setLabel2(JLabel label2) {
		this.label2 = label2;
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

	public JScrollPane getScroll1() {
		return scroll1;
	}

	public void setScroll1(JScrollPane scroll1) {
		this.scroll1 = scroll1;
	}

	public JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}
	
}
