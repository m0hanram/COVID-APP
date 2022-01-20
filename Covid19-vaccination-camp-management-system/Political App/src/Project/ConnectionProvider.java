/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
//import java.sql.*;
import java.sql.*;
//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;
/**
 *
 * @author Avinash Chandan
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","avinash12082001");
            return con;
        }
        catch(Exception e){
            System.out.println("Some error : "+e);
            return null;
        }
    }
}
