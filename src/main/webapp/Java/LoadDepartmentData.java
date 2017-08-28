package Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avishek
 */
public class LoadDepartmentData {
    private FileReader fr;
    private BufferedReader fbr;
    private ArrayList<Department> deptList;
    private final String fileName = "D:\\IMCS Group\\Training Class\\Projects\\EmployeeDisplay\\EmployeeDisplay\\src\\main\\webapp\\ResourceFiles\\DepartmentData.txt";
    Department dept;
    
    {
        deptList = new ArrayList<>();
    }
    
    private void loadData(){
        dept = new Department();
        String temp = "";
        String[] ftemp;

        try {
            fr = new FileReader(fileName);
            fbr = new BufferedReader(fr);

            while ((temp = fbr.readLine()) != null) {
                ftemp = temp.split(",");
                dept.setDeptID(Integer.parseInt(ftemp[0]));
                dept.setDeptName(ftemp[1]);
                dept.setDeptSupervisor(Integer.parseInt(ftemp[2]));
                deptList.add(dept);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public ArrayList<Department> getListOfDepartment(){
        return deptList;
    }
    
    public Department getDepartmentData(int deptID){
        dept = new Department();
        boolean flag = false;
        Iterator<Department> itr = deptList.iterator();
        while (itr.hasNext()) {
            dept = itr.next();
            if (dept.getDeptID()== deptID) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            return dept;
        } else {
            return null;
        }
    }
}
