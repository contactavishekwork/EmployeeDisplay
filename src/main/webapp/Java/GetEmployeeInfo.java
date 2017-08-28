package Java;


import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avishek
 */
public class GetEmployeeInfo extends HttpServlet{
    
    private int employeeID;
    private int deptID;

    public GetEmployeeInfo() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        employeeID = Integer.parseInt(req.getParameter("empID"));
        deptID = Integer.parseInt(req.getParameter("deptID"));
        ResponseContainer respond = new ResponseContainer();
        
        LoadEmployeeData loadData = new LoadEmployeeData();
        Employee emp = loadData.getEmployeeData(employeeID);
        respond.setEmployee(emp);
        
        
        LoadDepartmentData loadDData = new LoadDepartmentData();
        Department dept = loadDData.getDepartmentData(deptID);
        respond.setDepartment(dept);
        
        req.setAttribute("Response", respond);
        RequestDispatcher rd = req.getRequestDispatcher("/DisplayData.jsp");
        rd.forward(req, resp);
    }
}
