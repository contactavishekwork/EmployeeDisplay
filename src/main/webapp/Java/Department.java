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
public class Department {

    private int deptID;
    private String deptName;
    private int deptSupervisor;

    public Department() {
        deptID = 101;
        deptName = "Fitness Equipments";
        deptSupervisor = 100;
    }

    /**
     * @return the deptID
     */
    public int getDeptID() {
        return deptID;
    }

    /**
     * @return the deptName
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @return the deptSupervisor
     */
    public int getDeptSupervisor() {
        return deptSupervisor;
    }

    /**
     * @param deptID the deptID to set
     */
    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    /**
     * @param deptName the deptName to set
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @param deptSupervisor the deptSupervisor to set
     */
    public void setDeptSupervisor(int deptSupervisor) {
        this.deptSupervisor = deptSupervisor;
    }

}
