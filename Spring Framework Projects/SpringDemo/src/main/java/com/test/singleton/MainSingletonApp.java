package com.test.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSingletonApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(SingletonBeanConfig.class);
        ctx.refresh();

        SampleBean bean1 = ctx.getBean(SampleBean.class);
        System.out.println(bean1.hashCode());

        SampleBean bean2 = ctx.getBean(SampleBean.class);
        System.out.println(bean2.hashCode());
        ctx.close();
    }
}
