package com.test.setterbased;

public class Student {

    private int st_id;
    private String st_name;
    private String st_course;

    public int getSt_id() {
        return st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_course() {
        return st_course;
    }

    public void setSt_course(String st_course) {
        this.st_course = st_course;
    }

    void display(){
        System.out.println(st_id+" "+st_name+" "+st_course);    }
}
