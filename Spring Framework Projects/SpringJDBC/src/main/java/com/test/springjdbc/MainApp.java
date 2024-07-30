
package com.test.springjdbc;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.test.springjdbc.EmployeeJDBCTemplate;
import org.springframework.jdbc.core.JdbcTemplate;


public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate)context.getBean("employeeJDBCTemplate");
        System.out.println("Data Creation" );
        employeeJDBCTemplate.create("Tom", 4113);
        employeeJDBCTemplate.create("Sunny",3321 );
        employeeJDBCTemplate.create("Nyka", 1744);
        System.out.println("Listing Multiple Data" );
        List<Employee> employees;
        employees = employeeJDBCTemplate.listEmployees();
        for (Employee record : employees) {
            System.out.print("ID : " + record.getEid() );
            System.out.print(", Name : " + record.getEmpname() );
            System.out.println(", Pincode : " + record.getPincode());
        }

        Employee emp = new Employee();
        System.out.println("Updating Data with ID = 2" );
        employeeJDBCTemplate.update(2, 3456);
        System.out.println("Listing Data with ID = 2 " );
        Employee employee = employeeJDBCTemplate.getEmployee(2);
        System.out.print("ID : " + emp.getEid() );
        System.out.print(", Name : " + emp.getEmpname() );
        System.out.println(", Pincode : " + emp.getPincode());
    }}
