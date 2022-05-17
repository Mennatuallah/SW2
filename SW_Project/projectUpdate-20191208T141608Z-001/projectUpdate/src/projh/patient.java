/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;

public abstract class patient extends person implements Serializable  {
    protected String Time ;
    protected String Mhistory ;
    protected String Dfname;
    protected String Dlname;
    protected int dID;
    protected String myMassage; 
    
    
    
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
    
    public patient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time,String Dfname,String Dlname,int dID,department dept)
    {
        super(user, pass, id, fname, lname, age, dept);
        this.Time=Time;
        this.Mhistory=Mhistory;
        this.Dfname=Dfname;
        this.Dlname=Dlname;
        this.dID=dID;
    }
    
    public void setTime(String Time)
    {
        this.Time=Time;
    }
    
    public void setMhistory(String Mhistory)
    {
        this.Mhistory=Mhistory;
    }
    
    public void setDfname(String Dfname)
    {
        this.Dfname=Dfname;
    }

    
     public void setDlname(String Dlname)
    {
        this.Dlname=Dlname;
    }
     
     
    
    
       public void setdID(int dID)
    {
        this.dID=dID;
    }  

       
       
       
       

    public String getTime()
    {
        return this.Time;
    }
    
    public String getMhistory()
    {
        return this.Mhistory;
    }  
    
    public String getDfname()
    {
        return this.Dfname;
    }   
    
    
    public String setDlname()
    {
       return this.Dlname;
    }  
    

    public int setdID()
    {
        return this.dID;
    }   
   
    
    public void showALLTimeTable(){
        receptionist r = new receptionist();
        r.displayALLTimeTable();  
    }
    
    public void showMyReport(int id)
    {
        appointment a = new appointment();
        System.out.print(a.dispalyReport(id));      
    }
    
    
    
    
}

