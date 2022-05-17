/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;

public class VisitorPatient extends patient implements Serializable{
    
    private final String visitorPatientFileName = "vpatients.bin";
    public static ArrayList<VisitorPatient> visitorPatients = new ArrayList<VisitorPatient>();
    
    public VisitorPatient(){
        
    }
    
    public VisitorPatient(String user, String password, int id, String firstName, String lastName, int age, String messageHistory, String Time,String doctorFirstName,String doctorLastName,int dID,department Department)
    {
        super(user,password,id,firstName,lastName,age,messageHistory,Time,doctorFirstName,doctorLastName,dID,Department);            
    } 

    
    

    public boolean addpatient(){
        loadFromFile();
        visitorPatients.add(this);
        return commitToFile();
    }
     
      public void loadFromFile() {
          if(FManger.read(visitorPatientFileName)!=null)
        visitorPatients = (ArrayList<VisitorPatient>) FManger.read(visitorPatientFileName);
    }
     
     public boolean commitToFile() {
        return FManger.write(visitorPatientFileName,visitorPatients);
    }
     
     
    public boolean updatePatient(int oldID,VisitorPatient x)
    {
        loadFromFile();
        int index = getPatientIndex(oldID);
        if (index != -1) {
            visitorPatients.set(index, x);
            return commitToFile();
        }
        return false;        
    }
    

    @Override
    public boolean deletePation(int id) {
        loadFromFile();
        int index = getPatientIndex(id);
        if (index != -1) {
            visitorPatients.remove(index);
            return commitToFile();
        }
        return false;
    }

    @Override
    public String searchPatient(int id) {
        loadFromFile();
        int index = getPatientIndex(id);
        if (index != -1) {
            return "\nFound ...!" + visitorPatients.get(index).toString();
        } else {
            return null;
        }
    }
    
    @Override
    public void makeApp(int id)
    {
        
        for(VisitorPatient x : visitorPatients)
        {
            if(x.id==id)
            {
                appointment Appointment = new appointment(x.firstName,x.lastName,x.id,x.DoctorFirstName,x.DoctorLastName,x.doctorID,x.Time);
                if(Appointment.checkallow(x.doctorID,x.Time))
                {
                    if (Appointment.addappointment()) {
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
        String allVisitorPatient = "\nAll VisitorPatient Data:\n";
        for (VisitorPatient x : visitorPatients) {
            allVisitorPatient = allVisitorPatient + x.toString();
        }
        return allVisitorPatient;
    }

    @Override
    protected int getPatientIndex(int id) {
        for (int i = 0; i < visitorPatients.size(); i++) {
            if (visitorPatients.get(i).getID() == id) {
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
                       + "My DR. Name : " + DoctorFirstName +" "+DoctorLastName+"  "
                       + "Time : " + Time +"  "
                       + "Dept: " + myDepartment.getDepartmentName() + "\n"
                       +"UserName: " + userName + "\t Password: " + password + "\n";
    }

    @Override
    public String dispalyMHistory(int id) {
      String messageHistory = "\n your Report :";
        for(VisitorPatient x : visitorPatients)
        {
            if(x.id==id){ 
                messageHistory= messageHistory + x.MessageHistory ;             
            }
        }
        return messageHistory ;
    }
    @Override    
    public void showALLTimeTable(){
        receptionist timeTable = new receptionist();
        timeTable.displayALLTimeTable();  
    }
    @Override
        public void showMyReport(int id)
    {
        appointment report = new appointment();
        System.out.print(report.dispalyReport(id));      
    }
     
    
}    
