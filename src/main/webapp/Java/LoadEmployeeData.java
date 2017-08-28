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
public class LoadEmployeeData {

    private FileReader fr;
    private BufferedReader fbr;
    private ArrayList<Employee> empList;
    private final String fileName = "D:\\IMCS Group\\Training Class\\Projects\\EmployeeDisplay\\EmployeeDisplay\\src\\main\\webapp\\ResourceFiles\\EmployeeData.txt";
    private Employee emp;

    {
        empList = new ArrayList<>();
        loadData();
    }

    private void loadData() {
        emp = new Employee();
        String temp = "";
        String[] ftemp;

        try {
            fr = new FileReader(fileName);
            fbr = new BufferedReader(fr);

            while ((temp = fbr.readLine()) != null) {
                ftemp = temp.split(",");
                emp.setEmpID(Integer.parseInt(ftemp[0]));
                emp.setDeptID(Integer.parseInt(ftemp[1]));
                emp.setName(ftemp[2]);
                emp.setSalary(Float.parseFloat(ftemp[3]));
                empList.add(emp);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public ArrayList<Employee> getListOfEmployee() {
        return empList;
    }

    public Employee getEmployeeData(int empID) {
        emp = new Employee();
        boolean flag = false;
        Iterator<Employee> itr = empList.iterator();
        while (itr.hasNext()) {
            emp = itr.next();
            if (emp.getEmpID() == empID) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            return emp;
        } else {
            return null;
        }
    }
}
