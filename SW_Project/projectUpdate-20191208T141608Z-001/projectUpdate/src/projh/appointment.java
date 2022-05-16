/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author 
 */
public class appointment implements Serializable{
    
    
    protected String pfname ;
    protected String plname ;   
    protected int pID;
    protected String dfname ;
    protected String dlname;
    protected int dID;
    protected String time ;
    protected ArrayList<String> massage =new ArrayList<String>() ;
    protected String report ;
    protected boolean approve ;
    private final String Appfilename  = "app.bin" ;
    filemanger FManger = new filemanger();
    public static ArrayList<appointment>  appointments = new ArrayList<appointment>();
    
    public appointment(){
        
    }   
    
    
    public appointment(String pfname,String plname,int pID,String dfname,String dlname,int dID,String time ){
        this.pfname=pfname;
        this.plname=plname;
        this.pID=pID;
        this.dfname=dfname;
        this.dlname=dlname;
        this.dID=dID;        
        this.time=time;       
        this.report="  ";
        this.approve=false; 
    
    }
    
    
    
    
    public void settime(String time)
    {
        this.time=time;
    }
    
    public void setpfname(String pfname)
    {
        this.pfname=pfname;
    }
     public void setplname(String plname)
    {
        this.plname=plname;
    }
    
    public void setdfname(String dfname)
    {
        this.dfname=dfname;
    }
    
    
    
    
    
    
    
    public String gettime()
    {
        return this.time;
    }
    
    public String getpfname()
    {
        return this.pfname;
    }
    
    public String getplname()
    {
        return this.plname;
    }
    
    public String getdfname()
    {
        return this.dfname;
    }
    
    
    public String filterApp(int dID,String Time)
    {
        loadFromFile();
        String S ="Appointments of DR \n";
        for(appointment x : appointments)
        {
            if(x.dID==dID && x.time.equals(Time))
            {                
                 S = S + x.toString();
            }            
        }   
        return S ;
    }
    
    
    
     
    boolean checkallow(int dID,String Time)
    {
        loadFromFile();
        int c =0;
        for(appointment x : appointments)
        {
            if(x.dID==dID && x.time.equals(Time))
            {                
                c++;
            }            
        }   
        return (c<=2);
    }
    
    
    public void addReport(int dID,int pID,String report)
    {
        loadFromFile();
        for(appointment x: appointments)
        {
            if(x.dID==dID && x.pID==pID)
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
        String S = "\nAll appointment Data:\n";
        for (appointment x : appointments) {
            S = S + x.toString();
        }
        return S;
    }
    
    public String dispalyReport(int id)
    {
        String s = "\n your Report :";
        for(appointment x : appointments)
        {
            if(x.pID==id){ 
                s= s + x.report ;              
                
            }
        }
        return s ;
    }
    
    
    public void approve(int pid,int dID)
    {
        loadFromFile();
        for(appointment x : appointments )
        {
            if(x.pID==pid && x.dID==dID)
            {
                x.approve=true;
            }
        }
    }
    
    @Override
        public String toString() {
        return "\n name of patient : " + pfname + " " + plname + "\n"
                + "name of doctor : " + dfname + " "+dlname +"\n"
                + "time of appointment : " + time + "\n"
                + "massage : " + massage +"\n"
                + "report : " + report+"\n" ;
    }
    
    

}
