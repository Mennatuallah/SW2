/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;
/**
 *
 * @author 
 */
public class ResidentPatient extends patient implements Serializable {
    
    /**
     *
     */
    protected int mybedID;
    protected int myroomNumber;
    private final String rPatientFileName = "rpatients.bin";
    public static ArrayList<ResidentPatient> rpatients = new ArrayList<ResidentPatient>();
    
    
    public ResidentPatient(){
        
    }
    
    public ResidentPatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time,String Dfname,String Dlname,int dID,department dept,int mybedID,int myroomNumber)
    {
        super(user,pass,id,fname,lname,age,Mhistory,Time,Dfname,Dlname,dID,dept);
        this.mybedID=mybedID;
        this.myroomNumber=myroomNumber;
        
    }

    public void setMybedID(int mybedID) {
        this.mybedID = mybedID;
    }

    public void setMyroomNumber(int myroomNumber) {
        this.myroomNumber = myroomNumber;
    }

    public int getMybedID() {
        return mybedID;
    }

    public int getMyroomNumber() {
        return myroomNumber;
    }
    
   
    @Override
     public boolean addpatient() {
        loadFromFile();
        rpatients.add(this);
        return commitToFile();
    }
     
      @Override
      public void loadFromFile() {
          if(FManger.read(rPatientFileName)!=null)
             rpatients = (ArrayList<ResidentPatient>) FManger.read(rPatientFileName);
    }
      
     @Override
     public boolean commitToFile() {
        return FManger.write(rPatientFileName,rpatients);
    }
     
    @Override
    public void makeApp(int id)
    {
        
        for(ResidentPatient r : rpatients)
        {
            if(r.id==id)
            {
                appointment a = new appointment(r.fname,r.lname,r.id,r.Dfname,r.Dlname,r.dID,r.Time);
                if(a.checkallow(r.dID,r.Time))
                {
                   if (a.addappointment()) {
                   System.out.println(r.toString() + "Added Appointment Successfully ... !");
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
    public boolean deletePation(int id) {
        loadFromFile();
        int index = getPatientIndex(id);
        if (index != -1) {
            rpatients.remove(index);
            return commitToFile();
        }
        return false;
    }
    
    
    public boolean updatePatient(int oldID,ResidentPatient x)
    {
        loadFromFile();
        int index = getPatientIndex(oldID);
        if (index != -1) {
            rpatients.set(index, x);
            return commitToFile();
        }
        return false;  
    }
    
    
    @Override
    public String toString() {
               return "\nmy name is : " + fname + " " + lname + "  " 
                       +" ID : "+id +"  "
                       +" Age : " + age + "  "
                       +"my DR Name : " + Dfname +" "+Dlname+"\n"
                       +"Time : " + Time +"  "
                       +"mybedID : "+ mybedID+"  "
                       +"myroomNumber : "+myroomNumber+"  "
                       + "Dept: " + myDept.getDeptName() + "  "
                       +"\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    @Override
    public String searchPatient(int id) {
        loadFromFile();
        int index = getPatientIndex(id);
        if (index != -1) {
            return "\nFound ...!" + rpatients.get(index).toString();
        } else {
            return null;
        }
    }    

    @Override
    public String displayAllPatient() {
       loadFromFile();
        String S = "\nAll ResidentPatient Data:\n";
        for (ResidentPatient x : rpatients) {
            S = S + x.toString();
        }
        return S;
    }
    
    @Override
    protected int getPatientIndex(int id) {
        for (int i = 0; i < rpatients.size(); i++) {
            if (rpatients.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }    

    @Override
    public String dispalyMHistory(int id) {
        String s = "\n your Report :";
        for(ResidentPatient x : rpatients)
        {
            if(x.id==id){ 
                s= s + x.Mhistory ;             
            }
        }
        return s ;
    }

}
