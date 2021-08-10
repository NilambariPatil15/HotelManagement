package hotel.management.system;

	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;

	public class HotelManagement extends JFrame implements ActionListener{
	    /**
	     *
	     */
	    private static final long serialVersionUID = 1L;
	    JButton bt1;
	   // JFrame j=new JFrame("Reception");
	    
	    HotelManagement(){
	        setBounds(200,150,500,400);
	        
	        JLabel l1=new JLabel();
	        l1.setText("HOTEL TRINITY");
	        l1.setFont(new Font("Tahoma",Font.PLAIN,40));
	        l1.setAlignmentX(CENTER_ALIGNMENT);
	        l1.setBounds(100,30,300,40);
	        l1.setForeground(Color.BLACK);
	        ImageIcon i=new ImageIcon("/hotel/management/system/images/Hotel.jpg");
	      
	        JLabel l= new JLabel(i);
	        l.setBounds(0,0,500,400);
	        add(l);

	       
	        add(l1);
	        
	         bt1 = new JButton("NEXT");
	         bt1.setBackground(Color.BLACK);
	         bt1.setForeground(Color.WHITE);
	         bt1.setBounds(190,300,150,30);
	         bt1.setAlignmentX(CENTER_ALIGNMENT);
	         bt1.addActionListener(this);

	        add(bt1);
	       
	        setLayout(null);
	        setVisible(true);
	        while(true){
	            l1.setVisible(false);
	            try{
	                Thread.sleep(500);
	            }
	            catch(Exception e){

	            }
	            l1.setVisible(true);
	            try{
	                Thread.sleep(500);

	            }catch(Exception e){}
	            
	        } 
	    }
	     public static void main (String[] args){
	        new  HotelManagement();
	    }
	     public void actionPerformed(ActionEvent e){
	         
	        new Login().setVisible(true);
	        this.setVisible(false);
	          

	   }
	}

	   





