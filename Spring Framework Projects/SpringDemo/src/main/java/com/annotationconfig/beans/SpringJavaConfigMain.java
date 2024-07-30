package com.annotationconfig.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.annotationconfig.beans.Country;
import com.annotationconfig.beans.ApplicationConfiguration;

public class SpringJavaConfigMain {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Country countryObj = (Country) appContext.getBean("countryObj");
        String countryName=countryObj.getCountryName();

        System.out.println("Country name: "+ countryName);
    }
}