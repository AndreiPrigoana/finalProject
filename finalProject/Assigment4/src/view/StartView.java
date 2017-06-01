package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartView{

	private JFrame frame;
	
	private JPanel p1;
	
	private JLabel label1;
	
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	
	
	public StartView(){
		
		frame = new JFrame("Start");
		frame.setBounds(550, 200, 300, 250);
		
		p1 = new JPanel();
		frame.add(p1);
		
		label1 = new JLabel();
		
		b1 = new JButton("Administrator");
		b2 = new JButton("Employee");
		b3 = new JButton("Client");
		b4 = new JButton("Pilot");
		
		p1.setLayout( new BorderLayout() );
		
		b1.setBounds(80, 50, 120, 20);
		p1.add(b1);
		b2.setBounds(80, 80, 120, 20);
		p1.add(b2);
		b3.setBounds(80, 110, 120, 20);
		p1.add(b3);
		b4.setBounds(80, 140, 120, 20);
		p1.add(b4);
		
		p1.add(label1);
		
		frame.setVisible(false);
	}
	public void addItemListener(ActionListener a) {
		b1.addActionListener(a);
		b2.addActionListener(a);
		b3.addActionListener(a);
		b4.addActionListener(a);
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
	public JFrame getFrame() {
		return frame;
	}
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	public JPanel getP1() {
		return p1;
	}
	public void setP1(JPanel p1) {
		this.p1 = p1;
	}
	public JLabel getLabel1() {
		return label1;
	}
	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}
	
	
}
