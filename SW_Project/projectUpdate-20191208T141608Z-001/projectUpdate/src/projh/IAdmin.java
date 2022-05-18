/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;


public interface IAdmin {

    public void addNewVpatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time, String Dfname, String Dlname, int dID, department dept);

    public String displayAllVisitorPatient();

    public void searchForVisitorPatient(int id);

    public void updateVisitorPatient(int oldID, VisitorPatient newVisitorPatientValues);

    public void deleteVisitorPatient(int Id);

    public void addNewRpatient(String user, String pass, int id, String fname, String lname, int age, String Mhistory, String Time, String Dfname, String Dlname, int dID, department dept, int mybedID, int myroomNumber);

    public String displayAllResidentPatient();

    public void searchForResidentPatient(int id);

    public void updateResidentPatient(int oldID, ResidentPatient newResidentPatientValues);

    public void deleteResidentPatient(int Id);

    public void addNewDoctor(String user, String pass, int id, String fname, String lname, int age, double salary, department dept, String timetable);

    public String displayAllDoctor();

    public void searchForDoctor(int id);

    public void updateDoctor(int oldID, Doctor newDoctorValues);

    public void deleteDoctor(int Id);

}
