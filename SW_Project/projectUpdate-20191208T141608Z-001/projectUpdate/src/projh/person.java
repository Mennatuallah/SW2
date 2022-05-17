/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;


import java.io.Serializable;
import java.rmi.server.ObjID;

 
public abstract class person implements Serializable {
    public int id;
    protected String userName;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected int age;
    department myDepartment;

    filemanger FManger = new filemanger();

    

    public person() {
    }

    public person(String user, String password, int id, String firstName, String LastName, int age, department Department) {
             
        this.id = id;
        this.firstName = firstName;
        this.lastName = LastName;
        this.age = age;
        this.userName = user;
        this.password = password;
        this.myDepartment = Department;
         
    }

    
    public abstract String toString();

    
    public void setID(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDepartment(department Department) {
        this.myDepartment = Department;
    }

    
    public String getuserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean login(String userName, String Password) {
        if (userName.equals("Admin") && Password.equals("12345678")) {
            return true;
        }
        return false;
    }

    public void showMyReport(ObjID id) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
