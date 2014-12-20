package com.exampletwo;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;

import com.exampletwo.EmployeeController;
import com.exampletwo.EmployeeService;

/**
 * The class that holds all unit tests for
 * the EmployeeController class.
 *  
 */
public class EmployeeControllerTest {

    @Test
    public void shouldReturnCountOfEmployeesFromTheService() {
        //Creating a mock using the PowerMockito.mock method for the EmployeeService class.
        EmployeeService mock = PowerMockito.mock(EmployeeService.class);

        //Next statement essentially says that when getEmployeeCount method
        //is called on the mocked EmployeeService instance, return 10.
        PowerMockito.when(mock.getEmployeeCount()).thenReturn(10);

        EmployeeController employeeController = new EmployeeController(mock);
        Assert.assertEquals(10, employeeController.getEmployeeCount());
    }
}
