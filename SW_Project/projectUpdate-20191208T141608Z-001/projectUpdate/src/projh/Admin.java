/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;


public class Admin extends staff {
     public Admin() {

    }

    public Admin(String user, String pass, int id, String fname, String lname, int age, double salary, department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);
    }

    
    
    
    public void addNewVpatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time,String Dfname,String Dlname,int dID,department dept)
    {
        VisitorPatient x = new VisitorPatient(user, pass, id, fname, lname, age, Mhistory, Time,Dfname,Dlname,dID,dept);
        if(x.addpatient()){
             System.out.println("Added NewVisitorPatient Successfully ... !");
        }else{
            System.out.println("Failed to insert ... !");            
        }                        
    }

    public String displayAllVisitorPatient() {
        VisitorPatient x = new VisitorPatient();
        System.out.println(x.displayAllPatient());
        return x.displayAllPatient();
    }

    public void searchForVisitorPatient(int id) {
        VisitorPatient x = new VisitorPatient();
        System.out.println(x.searchPatient(id));
    }

    public void updateVisitorPatient(int oldID, VisitorPatient newVisitorPatientValues) {
        VisitorPatient x = new VisitorPatient();
        if (x.updatePatient(oldID, newVisitorPatientValues)) {
            System.out.println(newVisitorPatientValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteVisitorPatient(int Id) {
        VisitorPatient x = new VisitorPatient();
        if (x.deletePation(Id)) {
           System.out.println("VisitorPatient: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
    
    
    public void addNewRpatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time,String Dfname,String Dlname,int dID,department dept,int mybedID,int myroomNumber)
    {
        ResidentPatient x = new ResidentPatient(user, pass, id, fname, lname, age, Mhistory, Time,Dfname,Dlname,dID, dept,mybedID,myroomNumber);
        if(x.addpatient()){
             System.out.println("Added NewResidentPatient Successfully ... !");
        }else{
            System.out.println("Failed to insert ... !");            
        }                        
        x.bookbed(mybedID, myroomNumber);
        System.out.println("And booked hisbed Successfully ... !");
    }  
    
    public String displayAllResidentPatient() {
        ResidentPatient x = new ResidentPatient();
        System.out.println(x.displayAllPatient());
        return x.displayAllPatient();
    }

    public void searchForResidentPatient(int id) {
        ResidentPatient x = new ResidentPatient();
        System.out.println(x.searchPatient(id));
    }

    public void updateResidentPatient(int oldID, ResidentPatient newResidentPatientValues) {
        ResidentPatient x = new ResidentPatient();
        if (x.updatePatient(oldID, newResidentPatientValues)) {
            System.out.println(newResidentPatientValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteResidentPatient(int Id) {
        ResidentPatient x = new ResidentPatient();
        if (x.deletePation(Id)) {
           System.out.println("ResidentPatient: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
    
    
    
    public void addNewDoctor(String user, String pass, int id, String fname, String lname, int age,double salary, department dept,String timetable) {
        Doctor x = new Doctor(user, pass, id, fname, lname, age,salary, dept,timetable);
        if (x.addDoctors()) {
            System.out.println(x.toString() + "Added New Doctor Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
    
    public String displayAllDoctor() {
        Doctor x = new Doctor();
        System.out.println(x.displayAllDoctors());
        return x.displayAllDoctors();
    }

    public void searchForDoctor(int id) {
        Doctor x = new Doctor();
        System.out.println(x.searchDoctor(id));
    }

    public void updateDoctor(int oldID, Doctor newDoctorValues) {
        Doctor x = new Doctor();
        if (x.updateDoctor(oldID, newDoctorValues)) {
            System.out.println(newDoctorValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteDoctor(int Id) {
        Doctor x = new Doctor();
        if (x.deleteDoctor(Id)) {
           System.out.println("Doctor: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
    

    @Override
       public String toString() {
        return "I'm Manager : " + fname + " " + lname + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + myDept.getDeptName() + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    
}
