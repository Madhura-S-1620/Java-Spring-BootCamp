package com.test.singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class SingletonBeanConfig {

    @Bean
    @Scope(value="prototype")    //Singleton= gives same address and prototype gives different address.
    public SampleBean getBean()
    {
        return new SampleBean();
    }

}
