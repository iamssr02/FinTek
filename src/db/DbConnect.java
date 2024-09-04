package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection connection;
    public static Statement statement;
    static{
        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/fintrekdb"+"?useSSL=false", 
                            "root", "Rtime=now");
            statement = connection.createStatement();
        }catch(Exception exeption){
            JOptionPane.showMessageDialog(null, exeption);
        }
    }
}
