package Java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avishek
 */
public class Employee {

    private int empID;
    private int deptID;
    private String name;
    private float salary;

    public Employee() {
        empID = 100;
        deptID = 101;
        name = "AJ Tavares";
        salary = 200.00f;
    }

    public Employee(int empID, int deptID, String name, float salary) {
        this.empID = empID;
        this.deptID = deptID;
        this.name = name;
        this.salary = salary;
    }

    
    /**
     * @return the deptID
     */
    public int getDeptID() {
        return deptID;
    }

    /**
     * @return the empID
     */
    public int getEmpID() {
        return empID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param deptID the deptID to set
     */
    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    /**
     * @param empID the empID to set
     */
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    
}
