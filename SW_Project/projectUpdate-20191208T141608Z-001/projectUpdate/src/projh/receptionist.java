/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;

public class receptionist extends staff implements Serializable{
    
    
    
     public receptionist() {

    }

    public receptionist(String user, String pass, int id, String fname, String lname, int age, double salary, department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);
    }
    
    
    
     public void displayALLAppoint() {
        appointment a = new appointment();
        System.out.println(a.displayAllAppoint());
    }
     
     public void displayALLTimeTable() {
        Doctor x = new Doctor();
        System.out.println(x.displayAllTimeTable());
    }
     
     
     public void filterAppointment(int dID ,String time)
     {
         appointment fa = new appointment();
         System.out.println(fa.filterApp( dID, time));
     }
     
     public void BookAppForVisitor(int id)
     {
         VisitorPatient v = new VisitorPatient();
         v.makeApp(id);
     }
     
     public void BookAppForResident(int id)
     {
         ResidentPatient rp = new ResidentPatient();
         rp.makeApp(id);
     }
     
     
    @Override
    public String toString() {
        return "\nmy name is : " + fname + " " + lname + "\n" 
                       +" ID : "+id +"\n"
                       +" Age : " + age + "\n"
                       + "\nDept: " + myDept.getDeptName() + "\n"
                       +"\nUserName: " + userName + "\t Password: " + pass + "\n";
    }
    
}
