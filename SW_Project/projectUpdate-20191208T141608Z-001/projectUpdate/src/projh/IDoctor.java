/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;


public interface IDoctor {

    public String searchDoctor(int id);

    public boolean deleteDoctor(int id);

    public boolean updateDoctor(int oldID, Doctor x);

    public String displayAllDoctors();

    public void showMHistoryofResident(int pid);

    public void showMHistoryofVisitor(int pid);

    public void MakeReport(int dID, int pID, String myreport);

    public void approve(int pID, int dID);

    public String displayAllTimeTable();

    public boolean addDoctors();
}
