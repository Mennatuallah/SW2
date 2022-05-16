/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;

/**
 *
 * @author 
 */
import java.io.Serializable;

 
public abstract class person implements Serializable {
    protected int id;
    protected String userName;
    protected String pass;
    protected String fname;
    protected String lname;
    protected int age;
    department myDept;

    filemanger FManger = new filemanger();

    

    public person() {
    }

    public person(String user, String pass, int id, String fname, String lname, int age, department dept) {
             
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.userName = user;
        this.pass = pass;
        this.myDept = dept;
         
    }

    
    public abstract String toString();

    
    public void setID(int id) {
        this.id = id;
    }

    public void setFName(String fname) {
        this.fname = fname;
    }

    public void setLName(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setDept(department dept) {
        this.myDept = dept;
    }

    
    public String getuserName() {
        return this.userName;
    }

    public String getPass() {
        return this.pass;
    }

    public int getID() {
        return this.id;
    }

    public String getFName() {
        return this.fname;
    }

    public String getLName() {
        return this.lname;
    }

    public int getAge() {
        return this.age;
    }

    public boolean login(String userName, String Pass) {
        if (userName.equals("Admin") && Pass.equals("12345678")) {
            return true;
        }
        return false;
    }

}
