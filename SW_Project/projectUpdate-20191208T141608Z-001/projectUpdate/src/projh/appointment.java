/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;

public class appointment implements Serializable{
   
    
    protected String patientFirstName ;
    protected String patientLastName ;   
    protected int patientID;
    protected String doctorFirstName ;
    protected String doctorLastName;
    protected int doctorID;
    protected String time ;
    protected ArrayList<String> message =new ArrayList<String>() ;
    protected String report ;
    protected boolean approve ;
    private final String Appfilename  = "app.bin" ;
    filemanger FManger = new filemanger();
    public static ArrayList<appointment>  appointments = new ArrayList<appointment>();
    
    public appointment(){
        
    }   
    
    
    public appointment(String patientFirstName,String patientLastName,int patientID,String doctorFirstName,String doctorLastName,int doctorID,String time ){
        this.patientFirstName=patientFirstName;
        this.patientLastName=patientLastName;
        this.patientID=patientID;
        this.doctorFirstName=doctorFirstName;
        this.doctorLastName=doctorLastName;
        this.doctorID=doctorID;        
        this.time=time;       
        this.report="  ";
        this.approve=false; 
    
    }
    
    
    
    
    public void settime(String time)
    {
        this.time=time;
    }
    
    public void setPatientFirstName(String pfname)
    {
        this.patientFirstName=pfname;
    }
     public void setPatientLastName(String plname)
    {
        this.patientLastName=plname;
    }
    
    public void setDoctorFirstName(String dfname)
    {
        this.doctorFirstName=dfname;
    }
    
    
    
    
    
    
    
    public String gettime()
    {
        return this.time;
    }
    
    public String getPatientFirstName()
    {
        return this.patientFirstName;
    }
    
    public String getPatientLastName()
    {
        return this.patientLastName;
    }
    
    public String getDoctorFirstName()
    {
        return this.doctorFirstName;
    }
    
    
    public String filterApp(int doctorID,String Time)
    {
        loadFromFile();
        String FillterAppointment ="Appointments of DR \n";
        for(appointment x : appointments)
        {
            if(x.doctorID==doctorID && x.time.equals(Time))
            {                
                 FillterAppointment = FillterAppointment + x.toString();
            }            
        }   
        return FillterAppointment ;
    }
    
    
    
     
    boolean checkallow(int doctorID,String Time)
    {
        loadFromFile();
        int c =0;
        for(appointment x : appointments)
        {
            if(x.doctorID==doctorID && x.time.equals(Time))
            {                
                c++;
            }            
        }   
        return (c<=2);
    }
    
    
    public void addReport(int doctorID,int patientID,String report)
    {
        loadFromFile();
        for(appointment x: appointments)
        {
            if(x.doctorID==doctorID && x.patientID==patientID)
            {
                x.report=report;
                commitToFile();
            }
        }
    }
  
     
     public boolean addappointment() {
        loadFromFile();
        appointments.add(this);
        return commitToFile();
    }
     
    public void loadFromFile() {
        appointments = (ArrayList<appointment>) FManger.read(Appfilename);
    }
     
     public boolean commitToFile() {
        return FManger.write(Appfilename, appointments);
    }
     
    public String displayAllAppoint() {
        loadFromFile();
        String appointmentData = "\nAll appointment Data:\n";
        for (appointment x : appointments) {
            appointmentData = appointmentData + x.toString();
        }
        return appointmentData;
    }
    
    public String dispalyReport(int id)
    {
        String report = "\n your Report :";
        for(appointment x : appointments)
        {
            if(x.patientID==id){ 
                report= report + x.report ;              
                
            }
        }
        return report ;
    }
    
    
    public void approve(int patientID,int doctorID)
    {
        loadFromFile();
        for(appointment x : appointments )
        {
            if(x.patientID==patientID && x.doctorID==doctorID)
            {
                x.approve=true;
            }
        }
    }
    
    @Override
        public String toString() {
        return "\n name of patient : " + patientFirstName + " " + patientLastName + "\n"
                + "name of doctor : " + doctorFirstName + " "+doctorLastName +"\n"
                + "time of appointment : " + time + "\n"
                + "message : " + message +"\n"
                + "report : " + report+"\n" ;
    }
    
    

}
