
package auditor.s.choice;

import databaseDAO.dbConnect;
import java.sql.SQLException;


public class AuditorSChoice {

    /**
     * @throws java.sql.SQLException
     */
    protected static boolean exists = false; 
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
         Report home = new Report();
         home.setVisible(true);
         dbConnect conn = new dbConnect();
         conn.connectOnline();
         conn.connectOffline();
               
    }
    
}
