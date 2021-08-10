package hotel.management.system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginSuccess extends JFrame  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	LoginSuccess(){
		JLabel l2 = new JLabel("Login Success");
		l2.setBounds(300,70,1000,50);
		l2.setForeground(Color.BLACK);
		l2.setFont(new Font("Tahoma",Font.PLAIN,46));
		//l1.add(l2);

	  add(l2);
		setLayout(null);
		setBounds(0,0,1950,1020);
		setVisible(true);
	}

}
