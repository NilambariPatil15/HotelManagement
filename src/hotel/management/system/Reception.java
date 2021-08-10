package hotel.management.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Reception extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
JButton b1,b2,b3;

   Reception(){
	
    
     JButton b1= new JButton("New Customer:");
       
        b1.setBounds(40,40,150,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        //b1.addActionListener(this);
        b1.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
        	  new AddCustomer().setVisible(true);
             // new Reception().setVisible(false);

          }
        });

        add(b1);
        
      JButton b2= new JButton("Staff Details:");
        
        b2.setBounds(40,90,150,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
          	  new StaffInfo().setVisible(true);
               // new Reception().setVisible(false);

            }
          });
        add(b2);
        
     JButton b3= new JButton("Add Room:");
        
        b3.setBounds(40,140,150,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
          	  new AddRoom().setVisible(true);
                new Reception().setVisible(false);

            }
          });
        add(b3);
        
 JButton b4= new JButton("Rooms:");
        
        b4.setBounds(40,190,150,30);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
          	  new RoomInfo().setVisible(true);
               // new Reception().setVisible(false);

            }
          });
        add(b4);
JButton b5= new JButton("Customer Info:");
        
        b5.setBounds(40,240,150,30);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
          	  new DisplayCustomer().setVisible(true);
               // new Reception().setVisible(false);

            }
          });
        add(b5);
 


    setLayout(null);
    setBounds(100,100,500,350);
	setVisible(true);



}
    
     public void actionPerformed(ActionEvent ae) {
    	 
    	 	if(ae.getSource()==b1){
    	 		
            new AddCustomer().setVisible(true);
            this.setVisible(false);

         }
    	 	else if(ae.getSource()==b2){
            new StaffInfo().setVisible(true);
            this.setVisible(false);
         }
         else if(ae.getSource()==b3){
        	new RoomInfo().setVisible(true);
            this.setVisible(false);

         }
     }
     public static void main (String[] args){
         new Reception().setVisible(true);

     }
}
