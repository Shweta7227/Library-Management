/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library-Management;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Shweta Sindhu
 */
public class DbConnect {

    /**
     * @param args the command line arguments
     */
    
     public static Connection getConnection() {
       Connection con;
       
            try {

                con = DriverManager.getConnection("jdbc:derby://localhost:1527/MyProject", "Shweta", "123");
                
                System.out.println("Connected to the database successfully!");
                 return con;
            } 
             catch (SQLException e) {
               e.printStackTrace();
            }
        

        return null;
        
    }
    
}
