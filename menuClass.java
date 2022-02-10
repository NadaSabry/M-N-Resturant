/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Ne
 */
 
import Connec.connect;
import java.awt.Menu;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing. *;
import net.proteanit.sql.DbUtils;
//import menue.*;
//import static menue.designe.*;
public class menuClass  extends  JFrame   {
    
 private String food_name;
  static Connection con;
  private  String dessert;
  private String juises;
  private int quantityOfFood;
    PreparedStatement pst = null;
    ResultSet rs = null;
    connect c1 = new connect();
 
    
    public menuClass()   {
        
    }

    public menuClass(String food_name, String dessert, String juises, int quantityOfFood) {
        this.food_name = food_name;
        this.dessert = dessert;
        this.juises = juises;
        this.quantityOfFood = quantityOfFood;
    }

     

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getJuises() {
        return juises;
    }

    public void setJuises(String juises) {
        this.juises = juises;
    }

    public int getQuantityOfFood() {
        return quantityOfFood;
    }

    public void setQuantityOfFood(int quantityOfFood) {
        this.quantityOfFood = quantityOfFood;
    }
    
    
    public ResultSet Search()    throws SQLException{
        try{
                String loc= "jdbc:sqlserver://localhost:1433;databaseName=billsRecord  ;user=admin;password=24680" ;
          Connection  con = DriverManager.getConnection( loc);
        
        String query= "select * from  i  ";
        pst=con.prepareStatement(query);
        
        rs=pst.executeQuery();
        return rs;
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
        return null;
     }
    }
 public void showMenue() throws SQLException{
 
          try {
             con = c1.connect();
            
           ShowTableDate();
         } catch (HeadlessException ex) {
             Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
         }
      
    
  

 }  
 
   public void ShowTableDate(){
     
         try{      
         
              String loc= "jdbc:sqlserver://localhost:1433;databaseName=billsRecord  ;user=admin;password=246800" ;
            con = DriverManager.getConnection( loc);
           String sql;
             sql = "SELECT * from   i ";
           pst=con.prepareStatement(sql);
            ResultSet rs=pst.executeQuery();
            
           //jTable1.setModel(DbUtils);
        JTable t=new JTable();
           t.setModel(DbUtils.resultSetToTableModel(rs));
        }
         
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
 
 }

private void countTheQuantityAndPrice(){
         Menu p=new Menu();
         JSpinner j=new JSpinner();
         JTextField h=new JTextField();
         JLabel pricee=new JLabel();
          try {
              int i=(Integer)j .getValue() ;
                 String loc= "jdbc:sqlserver://localhost:1433;databaseName=billsRecord  ;user=admin;password=246800" ;
               con = DriverManager.getConnection( loc);
              String sql = "SELECT Price from   i where name=? ";
              pst=con.prepareStatement(sql);
              
              pst.setString(1,  h.getText());
              rs=pst.executeQuery();
              if(rs.next()){
              String add=rs.getString("Price");
              int r;
              int e;e =  Integer.parseInt(add);
        
               
           
             
                  
              pricee.setText( e *i+"");
              
              
              
                     System.out.println(e);
              }
              
          } catch (SQLException ex) {
              Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
          }
}

private void saveTheBill()throws SQLException {
 String sql="insert into r(total,food_name, quantity_of_food ,drinks,desserts)values(?,?,?,?,?)";
           con = DriverManager.getConnection("jdbc:sqlserver://localHost:1433;databaseName=Bill ;user=admin;password=246800");
           pst = con.prepareStatement(sql);
}
}