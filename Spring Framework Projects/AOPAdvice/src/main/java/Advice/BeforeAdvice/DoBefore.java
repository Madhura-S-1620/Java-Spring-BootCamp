package Advice.BeforeAdvice;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class DoBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("****SPRING AOP**** DoBeforeMethod : Executing before method!");
    }
}
