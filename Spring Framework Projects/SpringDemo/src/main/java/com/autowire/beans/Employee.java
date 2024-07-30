package com.autowire.beans;

import com.autowire.beans.DepartmentBean;
public class Employee
{
    private String fullName;

    private DepartmentBean departmentBean;

    public Employee(DepartmentBean departmentBean) {
        this.departmentBean=departmentBean;
    }

    public DepartmentBean getDepartmentBean() {
        return departmentBean;
    }
    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
