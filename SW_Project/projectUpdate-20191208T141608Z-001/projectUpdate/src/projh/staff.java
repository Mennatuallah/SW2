/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
/**
 *
 * @author الاستاذ
 */
public abstract class staff extends person implements Serializable {
    
     protected double salary;

    public staff() {
    }

    public staff(String user, String pass, int id, String fname, String lname, int age, double salary, department dept) {
        super(user, pass, id, fname, lname, age, dept);

        this.salary = salary;
        this.myDept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDeptName() {
        return this.myDept.getDepartmentName();
    }

    /*•== operator is used to compare the references of the objects.
    •Comparing two references for equality does not compare the contents of the objects referenced.
    override this method so that it is used to compare the values of two objects.*/
    @Override
    public boolean equals(Object o) {
        staff u = (staff) o;
        return id == u.id && fname.equals(u.fname) && lname.equals(u.lname) && age == u.age && salary == u.salary && myDept.getDepartmentName().equals(u.myDept.getDepartmentName());
    }

    @Override
    public abstract String toString();
}
