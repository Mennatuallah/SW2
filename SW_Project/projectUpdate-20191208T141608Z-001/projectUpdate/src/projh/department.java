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
public class department implements Serializable {
    private String DeptID;
    private String DeptName;
    filemanger FManger = new filemanger();
    private final String DeptFileName = "./Department.bin";
    public static ArrayList<department> departments = new ArrayList<department>();
    

    public department() {

    }

    public department(String DeptID, String DeptName) {
        this.DeptID = DeptID;
        this.DeptName = DeptName;
    }

    public void setDeptID(String DeptID) {
        this.DeptID = DeptID;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }


    public String getDeptID() {
        return this.DeptID;
    }

    public String getDeptName() {
        return this.DeptName;
    }



    public boolean addDept() {
        loadFromFile();
        departments.add(this);
        return commitToFile();
        }
    public boolean commitToFile() {
        return FManger.write(DeptFileName, departments);
    }

    public void loadFromFile() {
        departments = (ArrayList<department>) FManger.read(DeptFileName);
    }
    

    @Override
    public String toString() {
        return "Dept Name : " + DeptName + "\n";
    }
}
