package com.exampletwo;

/**
 * This is a very simple employee controller
 * which will make use of the EmployeeService to
 * perform Create, Read, Update and Delete (CRUD)
 * of Employee objects.
 * It delegates the heavy lifting to the
 * EmployeeService class
 *  
 */
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    /**
     * This method is responsible to return the
     * count of employees in the system.
     * @return Total number of employees in the system.
     */
    public int getEmployeeCount() {
        return employeeService.getEmployeeCount();
    }
}
