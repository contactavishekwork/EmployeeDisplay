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
public class ResponseContainer {
    private Employee emp = new Employee();
    private Department dept = new Department();

    public void setEmployee(Employee emp){
        this.emp = emp;
    }
    
    public Employee getEmployee(){
        return emp;
    }
    
    public void setDepartment(Department dept){
        this.dept = dept;
    }
    
    public Department getDepartment(){
        return dept;
    }
}
