package com.pack.map;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name="StudentData123")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="roll",length=5)
    private int roll;
    @Column(name="sname",length=25)
    private String sname;
    @Column(name="course",length=15)
    private String course;
    @Column(name="fee",length=5)
    private double fee;

    @OneToOne(cascade = CascadeType.ALL)
    private Marks marks;

    public Student() {
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getSname() {
        return sname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
