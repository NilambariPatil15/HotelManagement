package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class conn{
    Connection c;
    Statement s;

public conn(){
    try{
        java.lang.Class.forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql:///projecthms","root","password");
        s=c.createStatement();
    }catch(Exception e){
        e.printStackTrace();
    }
}
}