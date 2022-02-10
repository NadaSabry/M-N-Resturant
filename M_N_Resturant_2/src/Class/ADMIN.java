
package Class;

import Connec.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ADMIN extends Person{
    
    private int embsalary;
    
    static Connection con;
    PreparedStatement pst = null;
    ResultSet rs = null;
    connect c = new connect();
    public ADMIN() {
    }

    
    public ADMIN(String embname, int embid, int embsalary){
        this.name = embname;
        this.id = embid;
        this.embsalary= embsalary;
    }

    public ADMIN(int embid) {
        this.id = embid;
    }

    public ADMIN(String embname, int embid) {
        this.name = embname;
        this.id = embid;
    }
    
    
    
    @Override
    public void Insert() throws SQLException{
       try{
        con=c.connect();
        String query="insert into Employee(Name,ID,Salary) values(?,?,?)";
        pst=con.prepareStatement(query);
        pst.setString(1,name);
        pst.setInt(2,id);
        pst.setInt(3,embsalary);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Insert successfuly");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, e);
       }
    }
    
    @Override
    public void Delete(int Id) throws SQLException{
    try{
        con=c.connect();
        String query="delete from Employee where ID=?";
        pst=con.prepareStatement(query);
        pst.setInt(1,Id);
        pst.execute();
        JOptionPane.showMessageDialog(null, "Delete successfuly");
    }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);}
    }
    
    @Override
    public void Update() throws SQLException{
       try{
        con = c.connect();
        String query="update Employee set Name=?, Salary=? where ID=?";
        pst=con.prepareStatement(query);
        pst.setString(1, name);
        pst.setInt(2, embsalary);
        pst.setInt(3, id);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "Update successfuly");
       }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);}
    }
    
    public ResultSet List() throws SQLException{
        try{
        con=c.connect();
        String query= "select * from Employee";
        pst=con.prepareStatement(query);
        rs=pst.executeQuery();
        return rs;
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }return null;
    }
        
    @Override
    public ResultSet Search() throws SQLException{
        try{
        con=c.connect();
        String query= "select * from Employee where ID=? or Name=?";
        pst=con.prepareStatement(query);
        pst.setInt(1, id);
        pst.setString(2, name);
        rs=pst.executeQuery();
        return rs;
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
        return null;
     }
    }
    
}
    
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
//}
