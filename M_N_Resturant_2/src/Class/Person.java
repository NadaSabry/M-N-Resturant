/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mac
 */
public abstract class  Person {
    protected String name;
    protected int id;
    protected String Address;
    protected String mail;
    protected String gender;
    
    public Person(){
        
    }

    public Person(String cusname, int cusid, String Address, String mail, String gender) {
        this.name = cusname;
        this.id = cusid;
        this.Address = Address;
        this.mail = mail;
        this.gender = gender;
    }

    public String getCusname() {
        return name;
    }

    public void setCusname(String name) {
        this.name = name;
    }

    public int getCusid() {
        return id;
    }

    public void setCusid(int id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    abstract void Insert()throws SQLException;
    
    abstract void Delete(int Id)throws SQLException;
    
    abstract void Update()throws SQLException;
    
    abstract ResultSet Search()throws SQLException;
    
}
