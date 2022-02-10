/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import Connec.connect;
import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import net.proteanit.sql.DbUtils;
//import resturant.*;

/**
 *
 * @author mac
 */
public class Employee extends Person{
//data field    
    private java.util.Date date;
    static Connection con;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
//connect
    connect c = new connect();
    
//Constructor
    public Employee() {
        date = new java.util.Date();
    }

    public Employee(String cusname, int cusid, String Address, String mail, String gender) {
        super(cusname,cusid,Address,mail,gender);
        date = new java.util.Date();
    }

    public Employee(String cusname, String Address, String mail, String gender) {
        this();
        this.name = cusname;
        this.Address = Address;
        this.mail = mail;
        this.gender = gender;
    }

    public Employee(String cusname, int cusid) {
        this();
        this.name = cusname;
        this.id = cusid;
    }

//Method
    @Override
    public void Insert()throws SQLException {
        try {
            con = c.connect();
            String query = "insert into customerData(cusName,cusAddress,cusEmail,cusGender,DateOfRegister) values(?,?,?,?,?)";
            pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, Address);
            pst.setString(3, mail);
            pst.setString(4, gender);
            pst.setString(5, date.toString());
            pst.execute();
           JOptionPane.showMessageDialog(null, "Insert successfuly");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
           
        }
       
    }

    @Override
    public void Delete(int Id)throws SQLException  {
        try {
            con = c.connect();
            id=Id;
            String query = "delete from customerData where cusID=?";
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete successfuly");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
//throws SQLException
    @Override
    public void Update()throws SQLException  {
        try {
            con = c.connect();
            String query = "update customerData set cusName=?, cusAddress=?, cusEmail=?, cusGender=? where cusID=?";
            pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, Address);
            pst.setString(3, mail);
            pst.setString(4, gender);
            pst.setInt(5, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update successfuly");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @Override
    public ResultSet Search() throws SQLException {
        try {
            con = c.connect();
            String query = "select * from customerData where cusID=? or cusName=?";
            pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, name);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

//    public void sendNotifcation(){
//        menu_bills x=new menu_bills();     
//        menu_bills.jTextField1.setText(EmployeeDes.send.getText());
//        x.setVisible(true);
//        
//    }
    public ResultSet ShowTableDate() {
        try {
            con = c.connect();
            String sql = "SELECT * from customerData";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
   
    
}
    
    
    
    
    
    

