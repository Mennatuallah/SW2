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
public class appointment implements Serializable {

    protected String patientFname;
    protected String patientLname;
    protected int patientID;
    protected String doctorFname;
    protected String doctorLname;
    protected int doctorID;
    protected String time;
    protected ArrayList<String> massage = new ArrayList<String>();
    protected String report;
    protected boolean approve;
    private final String Appfilename = "app.bin";
    filemanger FManger = new filemanger();
    public static ArrayList<appointment> appointments = new ArrayList<appointment>();

    public appointment() {

    }

    public appointment(String patientfname, String plname, int pID, String dfname, String dlname, int dID, String time) {
        this.patientFname = patientfname;
        this.patientLname = plname;
        this.patientID = pID;
        this.doctorFname = dfname;
        this.doctorLname = dlname;
        this.doctorID = dID;
        this.time = time;
        this.report = "  ";
        this.approve = false;

    }

    public void settime(String time) {
        this.time = time;
    }

    public void setpfname(String pfname) {
        this.patientFname = pfname;
    }

    public void setplname(String plname) {
        this.patientLname = plname;
    }

    public void setdfname(String dfname) {
        this.doctorFname = dfname;
    }

    public String gettime() {
        return this.time;
    }

    public String getpfname() {
        return this.patientFname;
    }

    public String getplname() {
        return this.patientLname;
    }

    public String getdfname() {
        return this.doctorFname;
    }

    public String filterApp(int dID, String Time) {
        loadFromFile();
        String S = "Appointments of DR \n";
        for (appointment x : appointments) {
            if (x.doctorID == dID && x.time.equals(Time)) {
                S = S + x.toString();
            }
        }
        return S;
    }

    //?? ????? ?? ???? ???? ???? ??? ?? 
    boolean checkallow(int dID, String Time) {
        loadFromFile();
        int c = 0;
        for (appointment x : appointments) {
            if (x.doctorID == dID && x.time.equals(Time)) {
                c++;
            }
        }
        return (c <= 2);
    }

    public void addReport(int dID, int pID, String report) {
        loadFromFile();
        for (appointment x : appointments) {
            if (x.doctorID == dID && x.patientID == pID) {
                x.report = report;
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

    public String dispalyReport(int id) {
        String s = "\n your Report :";
        for (appointment x : appointments) {
            if (x.patientID == id) {
                s = s + x.report;

            }
        }
        return s;
    }

    public void approve(int pid, int dID) {
        loadFromFile();
        for (appointment x : appointments) {
            if (x.patientID == pid && x.doctorID == dID) {
                x.approve = true;
            }
        }
    }

    @Override
    public String toString() {
        return "\n name of patient : " + patientFname + " " + patientLname + "\n"
                + "name of doctor : " + doctorFname + " " + doctorLname + "\n"
                + "time of appointment : " + time + "\n"
                + "massage : " + massage + "\n"
                + "report : " + report + "\n";
    }

}
