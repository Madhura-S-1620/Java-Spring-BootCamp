package com.test.springjdbc;




import java.util.List;
import javax.sql.DataSource;

public interface EmployeeDAO {

    public void setDataSource(DataSource ds);


    public void create(String ename, Integer pincode);

    public Employee getEmployee(Integer eid);

    public List<Employee> listEmployees();

    public void delete(Integer eid);

    public void update(Integer eid, Integer pincode);
}

