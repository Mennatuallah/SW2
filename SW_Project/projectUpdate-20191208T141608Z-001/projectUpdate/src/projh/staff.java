/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;

public abstract class staff extends person implements Serializable {
    
     protected double salary;

    public staff() {
    }

    public staff(String user, String password, int id, String firstName, String lastName, int age, double salary, department Department) {
        super(user, password, id, firstName, lastName, age, Department);

        this.salary = salary;
        this.myDepartment = Department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDepartmentName() {
        return this.myDepartment.getDepartmentName();
    }

    
    @Override
    public boolean equals(Object o) {
        staff u = (staff) o;
        return id == u.id && firstName.equals(u.firstName) && lastName.equals(u.lastName) && age == u.age && salary == u.salary && myDepartment.getDepartmentName().equals(u.myDepartment.getDepartmentName());
    }

    @Override
    public abstract String toString();
}
