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

    public receptionist(String user, String password, int id, String firstName, String LastName, int age, double salary, department Department) {
        super(user, password, id, firstName, LastName, age, salary, Department);
    }
    
    
    
     public void displayALLAppoint() {
        appointment AllAppointment = new appointment();
        System.out.println(AllAppointment.displayAllAppoint());
    }
     
     public void displayALLTimeTable() {
        Doctor TimeTable = new Doctor();
        System.out.println(TimeTable.displayAllTimeTable());
    }
     
     
     public void filterAppointment(int doctorID ,String time)
     {
         appointment filterAppointment = new appointment();
         System.out.println(filterAppointment.filterApp(doctorID, time));
     }
     
     public void BookAppForVisitor(int id)
     {
         VisitorPatient bookAppointmentVisitor = new VisitorPatient();
         bookAppointmentVisitor.makeApp(id);
     }
     
     public void BookAppForResident(int id)
     {
         ResidentPatient bookAppointmentResident = new ResidentPatient();
         bookAppointmentResident.makeApp(id);
     }
     
     
    @Override
    public String toString() {
        return "\nmy name is : " + firstName + " " + lastName + "\n" 
                       +" ID : "+id +"\n"
                       +" Age : " + age + "\n"
                       + "\nDept: " + myDepartment.getDepartmentName() + "\n"
                       +"\nUserName: " + userName + "\t Password: " + password + "\n";
    }
    
}
