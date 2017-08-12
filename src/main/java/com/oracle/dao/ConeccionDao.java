package com.oracle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Oracle D77738
 */
public class ConeccionDao {
    
    private Connection con; 

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    
    public void Conectar(){
            String url = "jdbc:derby://localhost:1527/BaseTest";
            String driver= "org.apache.derby.jdbc.ClientDriver";
            String userName= "root";
            String passwor= "root";
            
         try {                         
               Class.forName(driver).newInstance();
               con = DriverManager.getConnection(url, userName, passwor);
               
               System.out.println("Conexion exitosa");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void Cerrar(){
        try {
            if (con != null && !con.isClosed()){
                con.close();
            }   } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
