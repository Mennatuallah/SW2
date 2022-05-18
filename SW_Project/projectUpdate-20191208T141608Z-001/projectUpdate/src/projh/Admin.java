/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;


public class Admin extends staff implements IAdmin{
     public Admin() {

    }

    public Admin(String user, String pass, int id, String fname, String lname, int age, double salary, department dept) {
        super(user, pass, id, fname, lname, age, salary, dept);
    }

    
    
    

     @Override
    public String displayAllVisitorPatient() {
        VisitorPatient Visitor_Patient = new VisitorPatient();
        System.out.println(Visitor_Patient.displayAllPatient());
        return Visitor_Patient.displayAllPatient();
    }

     @Override
    public void searchForVisitorPatient(int id) {
        VisitorPatient Visitor_Patient = new VisitorPatient();
        System.out.println(Visitor_Patient.searchPatient(id));
    }

     @Override
    public void updateVisitorPatient(int oldID, VisitorPatient newVisitorPatientValues) {
        VisitorPatient Visitor_Patient = new VisitorPatient();
        if (Visitor_Patient.updatePatient(oldID, newVisitorPatientValues)) {
            System.out.println(newVisitorPatientValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

     @Override
    public void deleteVisitorPatient(int Id) {
        VisitorPatient Visitor_Patient = new VisitorPatient();
        if (Visitor_Patient.deletePation(Id)) {
           System.out.println("VisitorPatient: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
    
    @Override
    public void addNewRpatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time,String Dfname,String Dlname,int dID,department dept,int mybedID,int myroomNumber)
    {
        ResidentPatient Resident_Patient = new ResidentPatient(user, pass, id, fname, lname, age, Mhistory, Time,Dfname,Dlname,dID, dept,mybedID,myroomNumber);
        if(Resident_Patient.addpatient()){
             System.out.println("Added NewResidentPatient Successfully ... !");
        }else{
            System.out.println("Failed to insert ... !");            
        }   
         bed bed =new bed(id,myroomNumber);
         bed.bookbed(mybedID, myroomNumber); //
        System.out.println("And booked hisbed Successfully ... !");
    }  
    
@Override
    public String displayAllResidentPatient() {
        ResidentPatient Resident_Patient = new ResidentPatient();
        System.out.println(Resident_Patient.displayAllPatient());
        return Resident_Patient.displayAllPatient();
    }
@Override
    public void searchForResidentPatient(int id) {
        ResidentPatient Resident_Patient = new ResidentPatient();
        System.out.println(Resident_Patient.searchPatient(id));
    }

     @Override
    public void updateResidentPatient(int oldID, ResidentPatient newResidentPatientValues) {
        ResidentPatient Resident_Patient = new ResidentPatient();
        if (Resident_Patient.updatePatient(oldID, newResidentPatientValues)) {
            System.out.println(newResidentPatientValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

     @Override
    public void deleteResidentPatient(int Id) {
        ResidentPatient Resident_Patient = new ResidentPatient();
        if (Resident_Patient.deletePation(Id)) {
           System.out.println("ResidentPatient: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
    
    
    
     @Override
    public void addNewDoctor(String user, String pass, int id, String fname, String lname, int age,double salary, department dept,String timetable) {
        Doctor Doctor = new Doctor(user, pass, id, fname, lname, age,salary, dept,timetable);
        if (Doctor.addDoctors()) {
            System.out.println(Doctor.toString() + "Added New Doctor Successfully ... !");
        } else {
            System.out.println("Failed to insert ... !");
        }
    }
    
     @Override
    public String displayAllDoctor() {
        Doctor doctor = new Doctor();
        System.out.println(doctor.displayAllDoctors());
        return doctor.displayAllDoctors();
    }

     @Override
    public void searchForDoctor(int id) {
        Doctor doctor = new Doctor();
        System.out.println(doctor.searchDoctor(id));
    }

     @Override
    public void updateDoctor(int oldID, Doctor newDoctorValues) {
        Doctor doctor = new Doctor();
        if (doctor.updateDoctor(oldID, newDoctorValues)) {
            System.out.println(newDoctorValues.toString() + "Updated Successfully ... !");
        } else {
            System.out.println("Failed to Updated ... !");
        }
    }

     @Override
    public void deleteDoctor(int Id) {
        Doctor doctor = new Doctor();
        if (doctor.deleteDoctor(Id)) {
           System.out.println("Doctor: "+ Id + " Deleted Successfully ... !");
        } else {
            System.out.println("Failed to Deleted ... !");
        }
    }
    
    

    @Override
       public String toString() {
        return "I'm Manager : " + firstName + " " + lastName + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + myDepartment.getDepartmentName() + "\nUserName: " + userName + "\t Password: " + password + "\n";
    }

    @Override
    public void addNewVpatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time, String Dfname, String Dlname, int dID, department dept) {
               VisitorPatient Visitor_Patient = new VisitorPatient(user, pass, id, fname, lname, age, Mhistory, Time,Dfname,Dlname,dID,dept);
        if(Visitor_Patient.addpatient()){
             System.out.println("Added NewVisitorPatient Successfully ... !");
        }else{
            System.out.println("Failed to insert ... !");            
        }  
    }

    
}
