package com.pack;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {

    @Id
    private int pid;
    @Column(name = "project_name")
    private String projectName;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> emps;

    public Project() {
        super();
    }

    public Project(int pid,String projectName,List<Employee>emps) {
        this.pid = pid;
        this.projectName=projectName;
        this.emps=emps;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmps() {
        return emps;
    }

    public void setEmps(List<Employee> emps) {
        this.emps = emps;
    }
}
