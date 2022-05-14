/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafxapplication3.Login;

/**
 *
 * @author الاستاذ
 */
public class ProjH extends Application {

    
        public static department the_Heart = new department("1", "the Heart");
    public static department Bones = new department("1", "Bones");
    public static department the_belly= new department("2", "the belly");
    public static department Surgery = new department("3", "Surgery");
        //public static department IT = new department("3", "IT");
    
      @Override
    public void start(Stage primaryStage) throws Exception {
        
         
        new Login().start(primaryStage);
    }  


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); // current directory				
	checkDirectoryContents(currentDir);
        
        
        
        
        Scanner input = new Scanner(System.in); 
        
        Login.launch(args);
        /*
        Admin admin = new Admin("Admin@yahoo.com", "12345678", 1, "admin", "admin", 35, 5500, a);
        admin.addNewVpatient("aa","aa",10,"mostafa" ,"mohamed",10,"pppppalp", "sunday", "ali","mostafa",11, a);
        admin.addNewVpatient("aa","aa",11,"hossam" ,"mohamed", 10,"pppppalp", "sunday", "ali","mostafa",11, a);
        admin.addNewVpatient("aa","aa",12,"amr" ,"mohamed", 10,"pppppalp", "sunday", "ali","mostafa",11, a);
        admin.addNewVpatient("aa","aa",13,"mohamed" ,"mohamed", 10,"pppppalp", "sunday", "ali","mostafa",11, a);
        admin.addNewVpatient("aa","aa",14,"moaz" ,"mohamed", 10,"pppppalp", "monday", "ahmed","mostafa",12, a);
        admin.addNewDoctor("user","pass",10,"ali","mostafa",25,10000,b,"sunday");
        admin.addNewDoctor("aa", "aaa",11, "ahmed", "mostafa", 30, 5550, a, "monday");
        receptionist r1 = new receptionist("Admin@yahoo.com", "12345678",2, "admin1","admin1",20, 5500, a);
        Doctor z = new Doctor();
        VisitorPatient p = new VisitorPatient();
        r1.BookAppForVisitor(10);
        r1.BookAppForVisitor(11);
        r1.BookAppForVisitor(12);
        r1.BookAppForVisitor(13);
        r1.BookAppForVisitor(14);
        z.MakeReport(11,10,"the patient is well ");
        p.showMyReport(10);
        
*/
        
        //String user, String pass, int id, String fname, S/ring lname, int age, double salary, department dept
        /*
                
        Admin admin = new Admin( "Admin@yahoo.com", "12345678",1, "admin", "admin", 35,7000 ,Bones);
        Admin x = new Admin();

        
        
        String userName, Pass, Fname, Lname, Dfname , Dlname,dept,myhis,time, addresse;
        int id, oldID, age, Did;
        double salary;
        int ch =1;
        System.out.print("\n\nWelecome Admin ... !\n\nUser Name : ");
        userName = input.next();
        System.out.print("Password  : ");
        Pass = input.next();
        if (x.login(userName, Pass)) {

            while (ch != 0) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("\n\t ________________________________\n\t"
                        + "| Enter 1: Add New Patient.     |\n\t| Enter 2: Add New Doctor. "
                        + "\n\t| Enter 3: Display All Patient.|\n\t| Enter 4: Display All Doctor. "
                        + "\n\t| Enter 5: Search Patient.     |\n\t| Enter 6: Search Doctor.   "
                        + "\n\t| Enter 7: Update Patient.     |\n\t| Enter 8: Update Doctor.   "
                        + "\n\t| Enter 9: Delete Patient.     |\n\t| Enter 10: Delete Doctor.  "
                        + "\n\t -------------------------------\n\t");
                ch = input.nextInt();

                switch (ch) {
                    case 1:
                        //int id, String fname, String lname,String addresse, int age,Department dept, String Time,String Mhistory,String Dname 
                        System.out.println("patient user name : ");
                        userName = input.next();
                        System.out.print("Patient password : ");
                        Pass = input.next();
                        System.out.print("Patient ID : ");
                        id = input.nextInt();
                         System.out.print("Patient Fast Name : ");
                        Fname = input.next();
                        System.out.print("Patient Last Name : ");
                        Lname = input.next();
                        System.out.print("Patient Age : ");
                        age = input.nextInt();
                         System.out.print("Patient Mhistory : ");
                        myhis = input.next();
                        //System.out.println("Patient Department :");
                        //dept=input.next();
                        System.out.println("Patient Time :");
                        time = input.next();
                        System.out.println("doctor First name :");
                        Dfname = input.next();
                        System.out.println("doctor Last name :");
                        Dlname = input.next();
                        System.out.println("doctor ID :");
                        Did = input.nextInt();
                        
                        //String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time,String Dfname,String Dlname,int dID,department dept
                        admin.addNewVpatient(userName,Pass,id,Fname,Lname, age,myhis,time,Dfname,Dlname,Did,Bones);
                        break;
                    case 2:
                        System.out.print("Doctor First Name : ");
                        Fname = input.next();
                        System.out.print("Doctor Last Name : ");
                        Lname = input.next();
                        System.out.print("Doctor ID : ");
                        id = input.nextInt();
                        System.out.print("Doctor Age : ");
                        age = input.nextInt();
                        //System.out.println("Patient Department :");
                        //dept=input.next();
                        System.out.println("Doctor addresse :");
                        addresse = input.next();
                        
                        System.out.println("Doctor salary :");
                        salary = input.nextDouble();
                        System.out.println("Doctor userName");
                        userName = input.next();
                        
                        System.out.println("Doctor Password");
                        Pass = input.next();
          
                        
                        System.out.println("Doctor Time");
                        time = input.next();
                        //int id,String fname,String lname,String addresse,int age,Department dept,double salary,String username,String pass,String time,String spec
                        admin.addNewDoctor(userName,Pass,id,);
                        break;
                    case 3:
                         admin.displayAllPatient();
                         break;
                         
                    case 4:
                         
                         admin.displayAlldoctor();
                         break;
                    case 5:
                         System.out.print("\nSearch for Patient ...!\nEnter Patient ID : ");
                        id = input.nextInt();
                        admin.SearchOnPatient(id);
                        break;
                        
                    case 6:
                        
                         System.out.print("\nSearch for Doctor ...!\nEnter doctor ID : ");
                        id = input.nextInt();
                        admin.SearchOnDoctor(id);
                        break;
                    case 7:
                        
                        System.out.print("Patient First Name : ");
                        Fname = input.next();
                        System.out.print("Patient Last Name : ");
                        Lname = input.next();
                        System.out.print("Patient ID : ");
                        id = input.nextInt();
                        System.out.print("Patient Age : ");
                        age = input.nextInt();
                        //System.out.println("Patient Department :");
                        //dept=input.next();
                        System.out.println("Pateint addresse :");
                        addresse = input.next();
                        System.out.println("Patient Dieseas :");
                        myhis = input.next();
                        System.out.println("Patient Time :");
                        time = input.next();
                        System.out.println("doctor name :");
                        Dname = input.next();
                        Patient f = new Patient(id, Fname, Lname, addresse, age, IT, time, myhis, Dname);
                        admin.UpdataPatient(id,f);
                        break;
                        
                    case 8:
                        
                         System.out.print("Doctor First Name : ");
                        Fname = input.next();
                        System.out.print("Doctor Last Name : ");
                        Lname = input.next();
                        System.out.print("Doctor ID : ");
                        id = input.nextInt();
                        System.out.print("Doctor Age : ");
                        age = input.nextInt();
                        //System.out.println("Patient Department :");
                        //dept=input.next();
                        System.out.println("Doctor addresse :");
                        addresse = input.next();
                        
                        System.out.println("Doctor salary :");
                        salary = input.nextDouble();
                        System.out.println("Doctor userName");
                        userName = input.next();
                        
                        System.out.println("Doctor Password");
                        Pass = input.next();
                        
                        System.out.println("Doctor Specialization");
                        sepc = input.next();
                        
                        System.out.println("Doctor Time");
                        time = input.next();
                        Doctor s = new Doctor(id, Fname, Lname, addresse, age, IT, salary, userName, Pass, time, sepc);
                        admin.UpdataDoctor( id,s);
                        break;
                    case 9:
                         System.out.print("\nDelete Patient info ...!\nEnter Patient ID : ");
                        id = input.nextInt();
                        admin.DeletPatient(id);
                        break;
                    case 10:
                         System.out.print("\nDelete Doctor info ...!\nEnter Doctor ID : ");
                        id = input.nextInt();
                        admin.DeletDoctor(id);
                        break;
                    default:
                        System.out.println("you entered wrong answer");
                        break;
                }
             }
        }
        
        */
    }

   
    public static void checkDirectoryContents(File dir){
        File[] files = dir.listFiles();
        boolean vpatientFile = true;
        boolean appFile = true;
        boolean doctorFile = true;
        boolean rpatientFile = true;
        

        for (File file : files) {

            if (file.getName().contains("vpatints.bin")) {
                vpatientFile = false;
            } else  if (file.getName().contains("app.bin")) {
                appFile = false;
            } else if (file.getName().contains("Doc.bin")) {
                doctorFile = false;
            } else if (file.getName().contains("rpatients.bin")) {
                rpatientFile = false;
            }
        }
        if (vpatientFile) {
            VisitorPatient x = new VisitorPatient();
            x.commitToFile();
        } 
        
        if (appFile) {
            appointment x = new appointment();
            x.commitToFile();
        } 
        
        if (doctorFile) {
            Doctor x = new Doctor();
            x.commitToFile();
        } 
        
        if (rpatientFile) {
            ResidentPatient x = new ResidentPatient();
            x.commitToFile();
        } 
        
      
    }

   
    
    
}
