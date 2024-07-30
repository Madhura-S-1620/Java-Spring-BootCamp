package com.onetomany.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
@Entity
@Table(name = "Employee", uniqueConstraints ={
        @UniqueConstraint(columnNames = "ID"),
        @UniqueConstraint(columnNames = "EMAIL")} )

public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true,nullable = false )
    private Integer empid;
    @Column(name = "EMAIL", unique = true,nullable = false,length = 60)
    private String email;
    @Column(name = "FNAME" , unique = false,nullable = false,length = 100)
    private String fname;
    @Column(name="LNAME", unique = true,nullable = false,length = 60)
    private String lname;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "EMP_ID")
    private List<Account> accounts;

    public Employee() {

    }

    public Employee(int empid,String fname,String lname,List<Account> accounts){
        this.empid=empid;
        this.fname=fname;
        this.lname=lname;
        this.accounts=accounts;

    }


    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }



}