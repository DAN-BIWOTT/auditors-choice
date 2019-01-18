/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseDAO;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;


/**
 *
 * @author PRINCE ALCHEMY
 */
public final class dbConnect {
    
    public dbConnect() throws ClassNotFoundException{
        this.connectOnline();
   }
    
    public Connection connectOnline() throws ClassNotFoundException{
        Connection conn = null;
         try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/alchemystore","root","Kibiwott_254");
        System.out.println("Online Connection success!");
        }
         catch(SQLException exp){
              System.out.println("ERROR: "+exp);
                }
         return conn;
    }
    
    public Connection connectOffline() throws ClassNotFoundException{
        
      Connection conn = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AlchemyInc","root","Alchemy_254");
            System.out.println("Offline connection success!");
        } catch (SQLException ex) {
            System.out.println("this is the ERROR: "+ex);
        }
        return conn;
    }
}
