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
    private String DepartmentID;
    private String DepartmentName;
    filemanger FManger = new filemanger();
    private final String DeptFileName = "./Department.bin";
    public static ArrayList<department> departments = new ArrayList<department>();
    

    public department() {

    }

    public department(String DeptID, String DeptName) {
        this.DepartmentID = DeptID;
        this.DepartmentName = DeptName;
    }

    public void setDepartmentID(String DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }


    public String getDepartmentID() {
        return this.DepartmentID;
    }

    public String getDepartmentName() {
        return this.DepartmentName;
    }



    public boolean addDepartment() {
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
        return "Dept Name : " + DepartmentName + "\n";
    }
}
