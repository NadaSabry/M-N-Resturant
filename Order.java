/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import static Class.Employee.con;
import Connec.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class Order {
//data field
    private int id;
    
    static Connection con;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public Order() {
    }

    public Order(int cusid) {
        this.id = cusid;
    }

    public int getCusid() {
        return id;
    }

    public void setCusid(int cusid) {
        this.id = cusid;
    }
    
    connect c=new connect();
    
    public void Accept_Order() throws SQLException{
            con = c.connect();
             try {
            String sql="update Orderr set Approval = ? where  Bill_number= ?";
            pst=con.prepareStatement(sql);
            pst.setString(1,"true");
            pst.setInt(2,id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Accept Order :) ");
             }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public void Cancel_Order() throws SQLException{
            con = c.connect();
            try {
            String sql="update Orderr set Approval = ? where Bill_number = ?";
            pst=con.prepareStatement(sql);
            pst.setString(1,"false");
            pst.setInt(2,id);
            pst.execute();
            JOptionPane.showMessageDialog(null, " Cancel Order :( ");
             }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
    public ResultSet  show_Order () throws SQLException{
            con = c.connect();
            try {
            String sql="Select * from Orderr";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            return rs;
              }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
    }return null;
   }
    
   public ResultSet total()throws SQLException{
       con=c.connect();
       try{
           String sql="select * from Orderr where Bill_number=?";
           pst=con.prepareStatement(sql);
           pst.setInt(1,id);
           rs=pst.executeQuery();
           return rs;
       }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);
       }
      return null;
   }
   public void Accept_pay() throws SQLException{
            con = c.connect();
             try {
            String sql="update Orderr set pay = ? where  Bill_number= ?";
            pst=con.prepareStatement(sql);
            pst.setString(1,"true");
            pst.setInt(2,id);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Payment was successful (Thank YOU : Sair :) )");
             }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }
    
}
