/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;

public class Doctor extends staff implements Serializable , IDoctor {
    
    protected String TimeTable ;
    protected String MyReport;
    private final String Docfilename  = "Doc.bin" ;
    public static ArrayList<Doctor>  doctors = new ArrayList<Doctor>();
    
    public Doctor(){
        
    }
    
    public Doctor(String user, String pass, int id, String fname, String lname, int age, double salary, department dept,String timetable) {
        super(user, pass, id, fname, lname, age,salary, dept);
        this.TimeTable=timetable;
        
    }
    
    public void setTimeTable(String timetable)
    {
        this.TimeTable=timetable;        
    }
    
    public String getTimeTable()
    {
        return this.TimeTable;
    }
    
    @Override
    public boolean addDoctors() {
        loadFromFile();
        doctors.add(this);
        return commitToFile();
    }
    
    @Override
    public String displayAllTimeTable() {
        loadFromFile();
        String S = "\nAll timetable Data:\n";
        for (Doctor x : doctors) {
            S = S + x.firstName + "  " +x.lastName+"  "+x.TimeTable +"\n";
        }
        return S;
    }
    
    public boolean commitToFile() {
        return FManger.write(Docfilename, doctors);
    }

    public void loadFromFile() {
        if (FManger.read(Docfilename)!=null)
        doctors = (ArrayList<Doctor>) FManger.read(Docfilename);
    }
    @Override
    public void approve(int pID,int dID){
        appointment x = new appointment();
        x.approve(pID, dID);         
    }   
    
    
    @Override
    public void MakeReport(int dID,int pID,String myreport)
    {
        appointment Appointment= new appointment();
        Appointment.addReport(dID,pID, myreport);             
    }
    
    @Override
    public void showMHistoryofVisitor(int pid)
    {
        VisitorPatient VisitorPatient = new VisitorPatient();
        System.out.println(VisitorPatient.dispalyMHistory(pid));
    }
    
    @Override
     public void showMHistoryofResident(int pid)
    {
        ResidentPatient ResidentPatient = new ResidentPatient();
        System.out.println(ResidentPatient.dispalyMHistory(pid));
    }
     
    @Override
    public String displayAllDoctors() {
        loadFromFile();
        String S = "\nAll Doctors Data:\n";
        for (Doctor x : doctors) {
            S = S + x.toString();
        }
        return S;
    }
     
     
    @Override
      public boolean updateDoctor(int oldID,Doctor doctor)
    {
        loadFromFile();
        int index = getDoctorIndex(oldID);
        if (index != -1) {
            doctors.set(index, doctor);
            return commitToFile();
        }
        return false;        
    }
    

    
    @Override
    public boolean deleteDoctor(int id) {
        loadFromFile();
        int index = getDoctorIndex(id);
        if (index != -1) {
            doctors.remove(index);
            return commitToFile();
        }
        return false;
    }

    
    @Override
    public String searchDoctor(int id) {
        loadFromFile();
        int index = getDoctorIndex(id);
        if (index != -1) {
            return "\nFound ...!" + doctors.get(index).toString();
        } else {
            return null;
        }
    }
    
    protected int getDoctorIndex(int id) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getID() == id) {
                return i;
            }
        }
        return -1;     
    }

    @Override
    public String toString() {
        return "\nmy name is : " + firstName + " " + lastName + "  " 
                       +" ID : "+id +"  "
                       +" Age : " + age + "  "
                       + "Dept: " + myDepartment.getDepartmentName() + "  "
                       +"UserName: " + userName + " Password: " + password + "\n";
    }
    
}
