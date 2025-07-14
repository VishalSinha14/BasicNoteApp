package NotesApp1;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {                            //as there might be error in connecting jdbc
            Class.forName("com.mysql.cj.jdbc.Driver"); //step 1-- registering the driver
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/flightmanagementsystem","root","mysql"); //step 2--building connection string 
            s = c.createStatement();  //setp 3-- creating statement to directly access in java

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


