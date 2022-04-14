
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {

    
    public Connection connection;
    
    public koneksi(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/pos_furniture",
                    "root","");            
            //JOptionPane.showMessageDialog(null, "terkoneksi database");            
        } 
        catch(SQLException se){
            JOptionPane.showMessageDialog(null, "gagal terkoneksi database");
            System.exit(0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
