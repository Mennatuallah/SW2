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
        VisitorPatient vp = new VisitorPatient(user, pass, id, fname, lname, age, Mhistory, Time,Dfname,Dlname,dID,dept);
        if(vp.addpatient()){
             System.out.println("Added NewVisitorPatient Successfully ... !");
        }else{
            System.out.println("Failed to insert ... !");            
        }                        
    }

    public String displayAllVisitorPatient() {
        VisitorPatient vp = new VisitorPatient();
        System.out.println(vp.displayAllPatient());
        return vp.displayAllPatient();
    }

    public void searchForVisitorPatient(int id) {
        VisitorPatient vp = new VisitorPatient();
        System.out.println(vp.searchPatient(id));
    }

    public void updateVisitorPatient(int oldID, VisitorPatient newVisitorPatientValues) {
        VisitorPatient vp = new VisitorPatient();
        if (vp.updatePatient(oldID, newVisitorPatientValues)) {
            System.out.println(newVisitorPatientValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteVisitorPatient(int Id) {
        VisitorPatient vp = new VisitorPatient();
        if (vp.deletePation(Id)) {
           System.out.println("VisitorPatient: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
    
    
    public void addNewRpatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time,String Dfname,String Dlname,int dID,department dept,int mybedID,int myroomNumber)
    {
        ResidentPatient rp = new ResidentPatient(user, pass, id, fname, lname, age, Mhistory, Time,Dfname,Dlname,dID, dept,mybedID,myroomNumber);
        if(rp.addpatient()){
             System.out.println("Added NewResidentPatient Successfully ... !");
        }else{
            System.out.println("Failed to insert ... !");            
        }   
         bed b =new bed(id,myroomNumber);
         b.bookbed(mybedID, myroomNumber); //
        System.out.println("And booked hisbed Successfully ... !");
    }  
    
    public String displayAllResidentPatient() {
        ResidentPatient rp = new ResidentPatient();
        System.out.println(rp.displayAllPatient());
        return rp.displayAllPatient();
    }

    public void searchForResidentPatient(int id) {
        ResidentPatient rp = new ResidentPatient();
        System.out.println(rp.searchPatient(id));
    }

    public void updateResidentPatient(int oldID, ResidentPatient newResidentPatientValues) {
        ResidentPatient rp = new ResidentPatient();
        if (rp.updatePatient(oldID, newResidentPatientValues)) {
            System.out.println(newResidentPatientValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteResidentPatient(int Id) {
        ResidentPatient rp = new ResidentPatient();
        if (rp.deletePation(Id)) {
           System.out.println("ResidentPatient: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
    
    
    
    public void addNewDoctor(String user, String pass, int id, String fname, String lname, int age,double salary, department dept,String timetable) {
        Doctor doc = new Doctor(user, pass, id, fname, lname, age,salary, dept,timetable);
        if (doc.addDoctors()) {
            System.out.println(doc.toString() + "Added New Doctor Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
    
    public String displayAllDoctor() {
        Doctor doc = new Doctor();
        System.out.println(doc.displayAllDoctors());
        return doc.displayAllDoctors();
    }

    public void searchForDoctor(int id) {
        Doctor doc = new Doctor();
        System.out.println(doc.searchDoctor(id));
    }

    public void updateDoctor(int oldID, Doctor newDoctorValues) {
        Doctor doc = new Doctor();
        if (doc.updateDoctor(oldID, newDoctorValues)) {
            System.out.println(newDoctorValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

    public void deleteDoctor(int Id) {
        Doctor doc = new Doctor();
        if (doc.deleteDoctor(Id)) {
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
