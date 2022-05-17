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
import View.javafxapplication3.Login;

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
        
    }

   
    public static void checkDirectoryContents(File dir){
        File[] files = dir.listFiles();
        boolean visitorPatientFile = true;
        boolean appFile = true;
        boolean doctorFile = true;
        boolean residentPatientFile = true;
        

        for (File file : files) {

            if (file.getName().contains("vpatints.bin")) {
                visitorPatientFile = false;
            } else  if (file.getName().contains("app.bin")) {
                appFile = false;
            } else if (file.getName().contains("Doc.bin")) {
                doctorFile = false;
            } else if (file.getName().contains("rpatients.bin")) {
                residentPatientFile = false;
            }
        }
        if (visitorPatientFile) {
            VisitorPatient visitor_patient = new VisitorPatient();
            visitor_patient.commitToFile();
        } 
        
        if (appFile) {
            appointment Appointment = new appointment();
            Appointment.commitToFile();
        } 
        
        if (doctorFile) {
            Doctor doctor = new Doctor();
            doctor.commitToFile();
        } 
        
        if (residentPatientFile) {
            ResidentPatient resident_patient = new ResidentPatient();
            resident_patient.commitToFile();
        } 
        
      
    }
    
}
