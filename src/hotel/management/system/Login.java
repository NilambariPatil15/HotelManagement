package hotel.management.system;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


 public class Login extends JFrame implements ActionListener{
     
    private static final long serialVersionUID = 1L;
    JLabel l1, l2;
    JTextField t1;
    JButton b1,b2; 
    JPasswordField t2;
    
    Login(){
        l1= new JLabel("USERNAME");
        l1.setBounds(40,20,100,30);
        add(l1);
        l2= new JLabel("PASSWORD");
        l2.setBounds(40,70,100,30);
        add(l2);
        
        t1= new JTextField();
        t1.setBounds(140,20,150,30);

        t2= new JPasswordField();
        t2.setBounds(140,70,150,30);

        b1= new JButton("LOGIN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(40,120,90,30);
        b1.addActionListener(this);
       
        b2= new JButton("CANCEL");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(180,120,90,30);
        getContentPane().setBackground(Color.CYAN);
        b2.addActionListener(this);
        add(t1);

        add(t2);
        add(b1);
        add(b2);

        setLayout(null);
        setBounds(200,200,400,200);
        setVisible(true);
    }
    public static void main(String[] args){
        new Login();

    }
          public void actionPerformed(ActionEvent ae){
                JLabel j= new JLabel();
                if(ae.getSource()==b1){
                    
                    String user=t1.getText();
                    char[] pass=t2.getPassword();
                    StringBuilder final_pass = new StringBuilder();
                for(char x : pass) {
                 final_pass.append(x);
                }
                    conn c=new conn();
                    String str="select * from login where username = '"+user+"' and password= '"+final_pass+"'";
                    try{
                    ResultSet rs =c.s.executeQuery(str);
                    if(rs.next()){
                        new LoginSuccess().setVisible(true);
                        this.setVisible(false);
                    }
                    else{
                    	
                        j.setText("invalid");
                         this.setVisible(false);
                    }
                    
                    }catch(Exception e){}
                }
                else {
                    if(ae.getSource()==b2)
                             System.exit(0);
                }
    


 }
 }