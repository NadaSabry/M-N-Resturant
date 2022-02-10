/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import resturant.*;
import Connec.connect;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class Signin_up {

    private String Username;
    private String Password;
    private String email;
    private String type;
    
    static Connection con;
    PreparedStatement pst = null;
    ResultSet rs = null;

    connect c1 = new connect();

    public Signin_up(String Username, String Password, String email, String type) {
        this.Username = Username;
        this.Password = Password;
        this.email = email;
        this.type = type;
    }

    public Signin_up(String user, String pass) {
        Username = user;
        Password = pass;
    }

    public void signUp() throws SQLException {
        con = c1.connect();
        try {
            // don't add empty data
            String query = "insert into login(UserName,Password,Email,Type)values('" + Username + "','" + Password +"','"+ email +"','" + type + "')";
            pst = con.prepareStatement(query);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "insert successfuly");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public String Signin() throws SQLException {
        con = c1.connect();
        try {
            String query = "SELECT Type FROM login WHERE  UserName=? and Password=?";
            pst = con.prepareStatement(query);
            pst.setString(1, Username);
            pst.setString(2, Password);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
