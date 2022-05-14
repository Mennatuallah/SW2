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
 * @author الاستاذ
 */
public class VisitorPatient extends patient implements Serializable{
    
    private final String vPatientFileName = "vpatients.bin";
    public static ArrayList<VisitorPatient> vpatients = new ArrayList<VisitorPatient>();
    
    public VisitorPatient(){
        
    }
    
    public VisitorPatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time,String Dfname,String Dlname,int dID,department dept)
    {
        super(user,pass,id,fname,lname,age,Mhistory,Time,Dfname,Dlname,dID,dept);            
    } 

    
    

    public boolean addpatient(){
        loadFromFile();
        vpatients.add(this);
        return commitToFile();
    }
     
      public void loadFromFile() {
          if(FManger.read(vPatientFileName)!=null)
        vpatients = (ArrayList<VisitorPatient>) FManger.read(vPatientFileName);
    }
     
     public boolean commitToFile() {
        return FManger.write(vPatientFileName,vpatients);
    }
     
     
    public boolean updatePatient(int oldID,VisitorPatient x)
    {
        loadFromFile();
        int index = getPatientIndex(oldID);
        if (index != -1) {
            vpatients.set(index, x);
            return commitToFile();
        }
        return false;        
    }
    

    @Override
    public boolean deletePation(int id) {
        loadFromFile();
        int index = getPatientIndex(id);
        if (index != -1) {
            vpatients.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public String searchPatient(int id) {
        loadFromFile();
        int index = getPatientIndex(id);
        if (index != -1) {
            return "\nFound ...!" + vpatients.get(index).toString();
        } else {
            return null;
        }
    }
    
    @Override
    public void makeApp(int id)
    {
        
        for(VisitorPatient x : vpatients)
        {
            if(x.id==id)
            {
                appointment a = new appointment(x.fname,x.lname,x.id,x.Dfname,x.Dlname,x.dID,x.Time);
                if(a.checkallow(x.dID,x.Time))
                {
                    if (a.addappointment()) {
                   System.out.println(x.toString() + "Added Appointment Successfully ... !");
                   } else  {
                   System.out.println("Failed to insert ... !");
                   }                     
                }else{
                    System.out.println("Failed to insert ... !");                                        
                }
                       
            }
        }       
    }
    
    

    @Override
    public String displayAllPatient() {
        loadFromFile();
        String S = "\nAll VisitorPatient Data:\n";
        for (VisitorPatient x : vpatients) {
            S = S + x.toString();
        }
        return S;
    }

    @Override
    protected int getPatientIndex(int id) {
        for (int i = 0; i < vpatients.size(); i++) {
            if (vpatients.get(i).getID() == id) {
                return i;
            }
        }
        return -1;     
    }

    @Override
    public String toString() {
               return "\nmy name is : " + fname + " " + lname + "  " 
                       +" ID : "+id +"  "
                       +" Age : " + age + "  "
                       + "My DR. Name : " + Dfname +" "+Dlname+"  "
                       + "Time : " + Time +"  "
                       + "Dept: " + myDept.getDeptName() + "\n"
                       +"UserName: " + userName + "\t Password: " + pass + "\n";
    }

    @Override
    public String dispalyMHistory(int id) {
      String s = "\n your Report :";
        for(VisitorPatient x : vpatients)
        {
            if(x.id==id){ 
                s= s + x.Mhistory ;             
            }
        }
        return s ;
    }
     
     
    
}    
