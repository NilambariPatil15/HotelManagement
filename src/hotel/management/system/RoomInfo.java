package hotel.management.system;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;
 


 public class RoomInfo extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTable t1;
	JButton b1,b2;


	RoomInfo(){
		
		setBounds(150,150,800,600);


		JLabel l1 = new JLabel("Room Number");
		l1.setBounds(10,10,100,20);
		add(l1);
		
		JLabel l2 = new JLabel("Availability");
		l2.setBounds(120,10,80,20);
		add(l2);

		JLabel l3 = new JLabel("Status");
		l3.setBounds(230,10,80,20);
		add(l3);

		JLabel l4 = new JLabel("Price");
		l4.setBounds(330,10,60,20);
		add(l4);

		JLabel l5 = new JLabel("Bed Type");
		l5.setBounds(400,10,100,20);
		add(l5);

  
		t1 = new JTable();
		t1.setBounds(0,40,500,400);
		add(t1);

		b1 = new JButton("LOAD DATA");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(100,460,120,30);
		b1.addActionListener(this);
		add(b1);
		

		b2 = new JButton("BACK");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(250,460,120,30);
		b2.addActionListener(this);
		add(b2);

		getContentPane().setBackground(Color.WHITE);

		setLayout(null);
		
		setVisible(true);
  }

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==b1) {
			try {
				conn c= new conn();
				String str="select * from room";
				ResultSet rs= c.s.executeQuery(str);
				try {
				t1.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e) {}
				
			}catch(Exception e) {}
		
		}else if(ae.getSource()==b2) {
			new Reception().setVisible(true);
			this.setVisible(false);

		}
  }
        public static void main(String[]args){
	new RoomInfo().setVisible(true);

}
 }