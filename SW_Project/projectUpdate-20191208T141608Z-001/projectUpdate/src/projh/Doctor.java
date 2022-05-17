/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;

public class Doctor extends staff implements Serializable {
    
    protected String timetable ;
    protected String myreport;
    private final String Docfilename  = "Doc.bin" ;
    public static ArrayList<Doctor>  doctors = new ArrayList<Doctor>();
    
    public Doctor(){
        
    }
    
    public Doctor(String user, String pass, int id, String fname, String lname, int age, double salary, department dept,String timetable) {
        super(user, pass, id, fname, lname, age,salary, dept);
        this.timetable=timetable;
        
    }
    
    public void setTimeTable(String timetable)
    {
        this.timetable=timetable;        
    }
    
    public String getTimeTable()
    {
        return this.timetable;
    }
    
    public boolean addDoctors() {
        loadFromFile();
        doctors.add(this);
        return commitToFile();
    }
    
    String displayAllTimeTable() {
        loadFromFile();
        String S = "\nAll timetable Data:\n";
        for (Doctor x : doctors) {
            S = S + x.firstName + "  " +x.lastName+"  "+x.timetable +"\n";
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
    
    public void approve(int pID,int dID){
        appointment x = new appointment();
        x.approve(pID, dID);         
    }   
    
    
    public void MakeReport(int dID,int pID,String myreport)
    {
        appointment ap= new appointment();
        ap.addReport(dID,pID, myreport);             
    }
    
    public void showMHistoryofVisitor(int pid)
    {
        VisitorPatient v = new VisitorPatient();
        System.out.println(v.dispalyMHistory(pid));
    }
    
     public void showMHistoryofResident(int pid)
    {
        ResidentPatient rp = new ResidentPatient();
        System.out.println(rp.dispalyMHistory(pid));
    }
     
    public String displayAllDoctors() {
        loadFromFile();
        String S = "\nAll Doctors Data:\n";
        for (Doctor x : doctors) {
            S = S + x.toString();
        }
        return S;
    }
     
     
      public boolean updateDoctor(int oldID,Doctor x)
    {
        loadFromFile();
        int index = getDoctorIndex(oldID);
        if (index != -1) {
            doctors.set(index, x);
            return commitToFile();
        }
        return false;        
    }
    

    
    public boolean deleteDoctor(int id) {
        loadFromFile();
        int index = getDoctorIndex(id);
        if (index != -1) {
            doctors.remove(index);
            return commitToFile();
        }
        return false;
    }

    
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
