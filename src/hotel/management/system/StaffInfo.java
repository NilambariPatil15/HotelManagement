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

public class StaffInfo extends JFrame implements ActionListener{ 

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JTable t1;
JButton b1, b2;

StaffInfo(){

t1= new JTable( ) ;
t1.setBounds(0, 40, 1000, 500);
add(t1);

JLabel l1 = new JLabel("NAME");
l1.setBounds(40, 10, 70, 20);
add(l1);
JLabel l2 = new JLabel("ID");
l2.setBounds(250, 10, 70, 20);
add(l2);
JLabel l3 = new JLabel("AGE");
l3.setBounds(420, 10, 70, 20);
add(l3);
JLabel l4 = new JLabel("DESIGNTION");
l4.setBounds(610, 10, 90, 20);
add(l4);
JLabel l5 = new JLabel("SALARY");
l5.setBounds(800, 10, 70, 20);
add(l5);
b1 = new JButton("Load Data");
b1.setBounds(350, 560, 120, 30);
b1.setBackground(Color.BLACK);
b1.setForeground(Color.WHITE);
b1.addActionListener(this);
add(b1);

b2 = new JButton("Back");
b2.setBounds(530, 560, 120, 30);
b2.setBackground(Color.BLACK);
b2.setForeground(Color.WHITE);
b2.addActionListener(this);


add(b2);

getContentPane().setBackground(Color.WHITE);
setLayout(null);
setBounds(100, 50,1000, 650);
setVisible(true);
}



public void actionPerformed(ActionEvent aa) {
if(aa.getSource() == b1){
try{

conn c = new conn();
String str ="select * from employee";
ResultSet rs =c.s.executeQuery(str);
t1.setModel(DbUtils.resultSetToTableModel(rs));



}catch(Exception e){}
}
else if (aa.getSource()==b2){
new Reception().setVisible(true);
this.setVisible(false);
}
}

public static void main(String[] args)
{
 new StaffInfo().setVisible(true);
}    
}
