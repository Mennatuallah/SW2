/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

public class ResidentPatient extends patient implements Serializable {
    
  
    protected int myBedID;
    protected int myRoomNumber;
    private final String residentPatientFileName = "rpatients.bin";
    public static ArrayList<ResidentPatient> residentPatients = new ArrayList<ResidentPatient>();
    
    
    public ResidentPatient(){
        
    }
    
    public ResidentPatient(String user, String password, int id, String firstName, String lastName, int age, String MessageHistory, String Time,String DoctorFirstName,String DoctorLastName,int doctorID,department department,int myBedID,int myRoomNumber)
    {
        super(user,password,id,firstName,lastName,age,MessageHistory,Time,DoctorFirstName,DoctorLastName,doctorID,department);
        this.myBedID=myBedID;
        this.myRoomNumber=myRoomNumber;
        
    }

    public void setMyBedID(int myBedID) {
        this.myBedID = myBedID;
    }

    public void setMyRoomNumber(int myRoomNumber) {
        this.myRoomNumber = myRoomNumber;
    }

    public int getMyBedID() {
        return myBedID;
    }

    public int getMyRoomNumber() {
        return myRoomNumber;
    }
    
   
    @Override
     public boolean addpatient() {
        loadFromFile();
        residentPatients.add(this);
        return commitToFile();
    }
     
      @Override
      public void loadFromFile() {
          if(FManger.read(residentPatientFileName)!=null)
             residentPatients = (ArrayList<ResidentPatient>) FManger.read(residentPatientFileName);
    }
      
     @Override
     public boolean commitToFile() {
        return FManger.write(residentPatientFileName,residentPatients);
    }
     
    @Override
    public void makeApp(int id)
    {
        
        for(ResidentPatient Resident_Patient : residentPatients)
        {
            if(Resident_Patient.id==id)
            {
                appointment a = new appointment(Resident_Patient.firstName,Resident_Patient.lastName,Resident_Patient.id,Resident_Patient.DoctorFirstName,Resident_Patient.DoctorLastName,Resident_Patient.doctorID,Resident_Patient.Time);
                if(a.checkallow(Resident_Patient.doctorID,Resident_Patient.Time))
                {
                   if (a.addappointment()) {
                   System.out.println(Resident_Patient.toString() + "Added Appointment Successfully ... !");
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
            residentPatients.remove(index);
            return commitToFile();
        }
        return false;
    }
    
    
    public boolean updatePatient(int oldID,ResidentPatient Resident_Patient)
    {
        loadFromFile();
        int index = getPatientIndex(oldID);
        if (index != -1) {
            residentPatients.set(index, Resident_Patient);
            return commitToFile();
        }
        return false;  
    }
    
    
    @Override
    public String toString() {
               return "\nmy name is : " + firstName + " " + lastName + "  " 
                       +" ID : "+id +"  "
                       +" Age : " + age + "  "
                       +"my DR Name : " + DoctorFirstName +" "+DoctorLastName+"\n"
                       +"Time : " + Time +"  "
                       +"mybedID : "+ myBedID+"  "
                       +"myroomNumber : "+myRoomNumber+"  "
                       + "Dept: " + myDepartment.getDepartmentName() + "  "
                       +"\nUserName: " + userName + "\t Password: " + password + "\n";
    }

    @Override
    public String searchPatient(int id) {
        loadFromFile();
        int index = getPatientIndex(id);
        if (index != -1) {
            return "\nFound ...!" + residentPatients.get(index).toString();
        } else {
            return null;
        }
    }    

    @Override
    public String displayAllPatient() {
       loadFromFile();
        String allResidentPatients = "\nAll ResidentPatient Data:\n";
        for (ResidentPatient x : residentPatients) {
            allResidentPatients = allResidentPatients + x.toString();
        }
        return allResidentPatients;
    }
    
    @Override
    protected int getPatientIndex(int id) {
        for (int i = 0; i < residentPatients.size(); i++) {
            if (residentPatients.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }    

    @Override
    public String dispalyMHistory(int id) {
        String messageHistory = "\n your Report :";
        for(ResidentPatient Resident_Patient : residentPatients)
        {
            if(Resident_Patient.id==id){ 
                messageHistory= messageHistory + Resident_Patient.MessageHistory ;             
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
        appointment myReport = new appointment();
        System.out.print(myReport.dispalyReport(id));      
    }
}
