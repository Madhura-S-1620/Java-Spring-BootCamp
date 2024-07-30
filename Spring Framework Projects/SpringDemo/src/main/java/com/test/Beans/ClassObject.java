package com.test.Beans;


import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;




public class ClassObject implements  DisposableBean, InitializingBean{

    private String name;

    ClassObject() {
        System.out.println("We are getting the Constructor of ClassObject beaninvoked!");
    }
    public String getName() {
        return name;   }
    public void setName(String name) {
        this.name = name;
    }

    //Bean initialization code
    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Initializing method of ClassObject bean is invoked!");
    }

    //Bean destruction code
    @Override
    public void destroy() throws Exception {
        System.out.println("We are getting the Destroy method of ClassObject bean invoked!");
    } }

