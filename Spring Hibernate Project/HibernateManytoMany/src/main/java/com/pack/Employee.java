package com.pack;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Employee{

    private int empid;
    private String name;

    @ManyToMany
    private List<Project> projects;

    public Employee() {
        super();
    }

    public Employee(int empid,String name, List<Project>projects) {
        this.empid = empid;
        this.name=name;
        this.projects=projects;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}