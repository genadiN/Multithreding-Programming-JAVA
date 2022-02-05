package problem6;

import java.time.LocalDate;

public class Employee {
    private Integer employeeNumber;
    private String employeeFirstName;
    private String employeeLastName;
    private LocalDate hireDate;

    public Employee(Integer employeeNumber, String employeeFirstName,
                    String employeeLastName, LocalDate hireDate) {
        this.employeeNumber = employeeNumber;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.hireDate = hireDate;
    }

    //.. getter and setter methods, constructor and toString()

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
}
