/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;

public abstract class patient extends person implements Serializable  {
    protected String Time ;
    protected String MessageHistory ;
    protected String DoctorFirstName;
    protected String DoctorLastName;
    protected int doctorID;
    protected String myMessage; 
    
    
    
    public abstract boolean addpatient();
    public abstract boolean commitToFile();
    public abstract void loadFromFile();
    public abstract boolean deletePation(int id);
    public abstract String searchPatient(int id);
    public abstract String displayAllPatient();
    protected abstract int getPatientIndex(int id);
    public abstract String dispalyMHistory(int id);
    public abstract void makeApp(int id);
    
    public patient(){
        
    }
    
    public patient(String user, String password, int id, String firstname, String lastName, int age, String messageHistory, String Time,String doctorFirstName,String doctorLastName,int doctorID,department Department)
    {
        super(user, password, id, firstname, lastName, age, Department);
        this.Time=Time;
        this.MessageHistory=messageHistory;
        this.DoctorFirstName=doctorFirstName;
        this.DoctorLastName=doctorLastName;
        this.doctorID=doctorID;
    }
    
    public void setTime(String Time)
    {
        this.Time=Time;
    }
    
    public void setMessageHistory(String MessageHistory)
    {
        this.MessageHistory=MessageHistory;
    }
    
    public void setDoctorFirstName(String DoctorFirstName)
    {
        this.DoctorFirstName=DoctorFirstName;
    }

    
     public void setDoctorLastName(String DoctorLastName)
    {
        this.DoctorLastName=DoctorLastName;
    }
     
     
    
    
       public void setdID(int dID)
    {
        this.doctorID=dID;
    }  

       
       
       
       

    public String getTime()
    {
        return this.Time;
    }
    
    public String getMessageHistory()
    {
        return this.MessageHistory;
    }  
    
    public String getDoctorFirstName()
    {
        return this.DoctorFirstName;
    }   
    
    
    public String setDoctorLastName()
    {
       return this.DoctorLastName;
    }  
    

    public int setDoctorID()
    {
        return this.doctorID;
    }   
   
    
    public void showALLTimeTable(){
        receptionist timeTable = new receptionist();
        timeTable.displayALLTimeTable();  
    }
    
    public void showMyReport(int id)
    {
        appointment Report = new appointment();
        System.out.print(Report.dispalyReport(id));      
    }
    
    
    
    
}

