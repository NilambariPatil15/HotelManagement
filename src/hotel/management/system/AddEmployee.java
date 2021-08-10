package hotel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddEmployee extends JFrame implements ActionListener{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    JTextField j1, j2, j3, j4, j5;

    AddEmployee(){

        setBounds(200,200,800,400);
        JLabel name=new JLabel("NAME :");
        name.setBounds(40,50,120,30);
        add(name);
        name.setFont(new Font("Tahoma",Font.PLAIN,18));
        JLabel id=new JLabel("ID :");
        id.setBounds(40,90,120,30);
        add(id);
        id.setFont(new Font("Tahoma",Font.PLAIN,18));
        JLabel age=new JLabel("AGE :");
        age.setBounds(40,130,120,30);
        add(age);
        age.setFont(new Font("Tahoma",Font.PLAIN,18));

        JLabel d=new JLabel("DESIGNATION :");
        d.setBounds(40,170,140,30);
        add(d);
        d.setFont(new Font("Tahoma",Font.PLAIN,18));
        JLabel S=new JLabel("SALARY:");
        S.setBounds(40,210,140,30);
        add(S);
        S.setFont(new Font("Tahoma",Font.PLAIN,18));
        
        
        JLabel ed=new JLabel("Employee details");
        ed.setBounds(400,30,220,30);
        ed.setFont(new Font("Tahoma",Font.PLAIN,28));
        add(ed);


        j1=new JTextField();
        j1.setBounds(180,50,120,30);
        add(j1);
         j2=new JTextField();
        j2.setBounds(180,90,120,30);
        add(j2);
        j3=new JTextField();
        j3.setBounds(180,130,120,30);
        add(j3);
        j4=new JTextField();
        j4.setBounds(180,170,120,30);
        add(j4);
        j5=new JTextField();
        j5.setBounds(180,210,120,30);
        add(j5);

        
        JButton b1= new JButton("SUBMIT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(180,250,100,30);
        b1.addActionListener(this);
       add(b1);
       /*JButton b2= new JButton("BACK");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(60,230,90,30);
       b2.addActionListener(this);*/

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);


    }
     public static void main(String[] args){
            new AddEmployee().setVisible(true);
        }

    public void actionPerformed(ActionEvent ae){

        String name=j1.getText();
        String id=j2.getText();
        String age=j3.getText();
        String d=j4.getText();
        String s=j5.getText();
        
        conn c= new conn();
        String str ="insert into employee values('"+name+"','"+id+"','"+age+"','"+d+"','"+s+"')";
        try{
            c.s.executeUpdate(str);
            this.setVisible(false);
        }catch(Exception e){

        }
        
    }
       

}
