package Advice.AfterReturning;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class DoAfterReturning {
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        System.out.println("****SPRING AOP**** DoAfterReturningMethod : Executing after method return!");
    }
}
