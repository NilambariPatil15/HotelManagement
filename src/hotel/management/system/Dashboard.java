package hotel.management.system;


//package hotel.managment.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame implements ActionListener {
 	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JMenuBar mb;
 JMenu m1,m2;
 JMenuItem i1,i2;
 
 Dashboard(){
	mb= new JMenuBar();
	add(mb);

	m1= new JMenu("HOTEL MANAGMENT");
	m1.setForeground(Color.RED);
	mb.add(m1);

   m2= new JMenu("ADMIN");
	m2.setForeground(Color.BLUE);
	mb.add(m2); 
	
	i1= new JMenuItem("RECEPTION");
	m1.add(i1);
	i1.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
        	new Reception().setVisible(true);
           // new Reception().setVisible(false);

        }
      });



	i2= new JMenuItem("ADD EMPLOYEE");
	m2.add(i2);
	i2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
        	new AddEmployee().setVisible(true);
           // new Reception().setVisible(false);

        }
      });



	//i3= new JMenuItem("ADD ROOMS");
	//m2.add(i3);

	//i4= new JMenuItem("ADD DRIVERS");
	//m2.add(i4);
	
	mb.setBounds(0,0,1950,30);

	//imageIcon i1= new ImageIcon(ClassLeader.getSystemResource("adress");
	//image i2= i1.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
	//imageicon i3 = new ImageIcon(i2);
	//JLabel l1 =new JLabel(i3);
//	l1.setBounds(0,0,1950,1000);
//	add(l1);
	
	JLabel l2 = new JLabel("TRINITY GROUP WELCOMES YOU!");
	l2.setBounds(300,70,1000,50);
	l2.setForeground(Color.BLACK);
	l2.setFont(new Font("Tahoma",Font.PLAIN,46));
	//l1.add(l2);

  add(l2);
	setLayout(null);
	setBounds(0,0,1950,1020);
	setVisible(true);

 }
 public static void main(String[] args){
	new Dashboard().setVisible(true);
	
}
			public void actionPerformed(ActionEvent ae){ 
				if(ae.getActionCommand().equals("RECEPTION")){
				new Reception().setVisible(true);
              //this.setVisible(false);

				}
				else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
					new AddEmployee().setVisible(true);
					//this.setVisible(false);	
				}

				
			}

}	