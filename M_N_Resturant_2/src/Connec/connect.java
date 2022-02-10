/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mac
 */
public class connect {
    
    private final String user ="admin";
    private final String pass ="nada123";
    private final String url = "jdbc:sqlserver://localhost:1433;databaseName=Employeedb;" ;
    public Connection connect() throws SQLException{
        return DriverManager.getConnection(url, user, pass);
    }
}
