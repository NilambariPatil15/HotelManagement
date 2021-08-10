
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
	 


	 public class DisplayCustomer extends JFrame implements ActionListener{
		
		/**
		 * git
		 */
		private static final long serialVersionUID = 1L;
		JTable t1;
		JButton b1,b2;


		DisplayCustomer(){
			
			setBounds(80,80,800,600);
			/*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("adress");
			Image i2 = i1.getImage().getScaledInstance(600,600, Image.SCALE_DEFAULT);
			ImageIcon i3 = new ImageIcon(i2);
			JLabel icon = new JLabel(i3);
			icon.setBounds(440,10,600,600);
			add(icon);*/

			JLabel l1 = new JLabel("Number");
			l1.setBounds(0,10,100,20);
			add(l1);
			
			JLabel l2 = new JLabel("Name");
			l2.setBounds(75,10,80,20);
			add(l2);

			JLabel l3 = new JLabel("Gender");
			l3.setBounds(145,10,80,20);
			add(l3);

			JLabel l4 = new JLabel("Country");
			l4.setBounds(220,10,60,20);
			add(l4);

			JLabel l5 = new JLabel("Room");
			l5.setBounds(300,10,40,20);
			add(l5);
			JLabel l6 = new JLabel("Status");
			l6.setBounds(370,10,60,20);
			add(l6);
			JLabel l7 = new JLabel("Deposit");
			l7.setBounds(440,10,60,20);
			add(l7);

	  
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
					String str="select * from customer";
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
		new DisplayCustomer().setVisible(true);

	}
	 }


