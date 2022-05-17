/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projh;
import java.io.Serializable;
import java.util.ArrayList;

public class department implements Serializable {
    private String DepartmentID;
    private String DepartmentName;
    filemanger FManger = new filemanger();
    private final String DeptFileName = "./Department.bin";
    public static ArrayList<department> departments = new ArrayList<department>();
    

    public department() {

    }

    public department(String DepartmentID, String DepartmentName) {
        this.DepartmentID = DepartmentID;
        this.DepartmentName = DepartmentName;
    }

    public void setDeptID(String DepartmentID) {
        this.DepartmentID = DepartmentID;
    }

    public void setDeptName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }


    public String getDepartmentID() {
        return this.DepartmentID;
    }

    public String getDepartmentName() {
        return this.DepartmentName;
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
        return "Department Name : " + DepartmentName + "\n";
    }
}
