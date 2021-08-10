package hotel.management.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
	 

	public class AddRoom extends JFrame implements ActionListener{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		JTextField j1,j2,j3,j4,j5;
		JButton b1,b2;
	AddRoom(){
		setBounds(150,150,800,600);

		
		JLabel l1 = new JLabel("Room Number");
		l1.setBounds(40,130,100,20);
		add(l1);
		j1= new JTextField();
		j1.setBounds(170,130,150,25);
		add(j1);
		
		
		JLabel l2 = new JLabel("Availability");
		l2.setBounds(40,190,190,20);
		add(l2);
		j2= new JTextField();
		j2.setBounds(170,190,150,25);
		add(j2);
		

		JLabel l3 = new JLabel("Status");
		l3.setBounds(40,250,80,20);
		add(l3);
		j3= new JTextField();
		j3.setBounds(170,250,150,25);
		add(j3);
		

		JLabel l4 = new JLabel("Price");
		l4.setBounds(40,310,60,20);
		add(l4);
		j4= new JTextField();
		j4.setBounds(170,310,150,25);
		add(j4);
		

		JLabel l5 = new JLabel("Bed Type");
		l5.setBounds(40,370,220,20);
		add(l5);
		j5= new JTextField();
		j5.setBounds(170,370,150,25);
		add(j5);
		
		b1 = new JButton("Add ");
		b1.setBackground(Color.BLACK);
		b1.setBackground(Color.WHITE);
		b1.setBounds(50,410,120,25);
		b1.addActionListener(this);
				
		add(b1);

		b2 = new JButton("Back");
		b2.setBackground(Color.BLACK);
		b2.setBackground(Color.WHITE);
		b2.setBounds(200,410,120,25);
		b2.addActionListener(this);
	    
		add(b2);
		
		
		
		getContentPane().setBackground(Color.WHITE);

		setLayout(null);
		
		setVisible(true);
	}

		
		  public static void main(String[]args){
				new AddRoom().setVisible(true);

			}


		
		public void actionPerformed(ActionEvent ae) {
			
		        if(ae.getSource()==b1) {
		        String room=j1.getText();
		        String avail=j2.getText();
		        String s=j3.getText();
		        String p=j4.getText();
		        String b=j5.getText();
		       
		        
		        conn c= new conn();
		        String str ="insert into room values('"+room+"','"+avail+"','"+s+"','"+p+"','"+b+"')";
		        try{
		            c.s.executeUpdate(str);
		            this.setVisible(false);
		        }catch(Exception e1) {}
		        
		    }
		        else if(ae.getSource()==b2) {
		        	new Reception().setVisible(true);
		        	this.setVisible(false);
		        	
		        }
			
		}
	}

		


