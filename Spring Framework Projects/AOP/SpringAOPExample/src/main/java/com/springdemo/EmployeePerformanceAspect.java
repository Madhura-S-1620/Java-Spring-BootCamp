package com.springdemo;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeePerformanceAspect {

    @Before("execution(* com.springdemo.Employee.work())")
    public void beforeWork() {
        System.out.println("Before work: Prepare for work...");
    }

    @After("execution(* com.springaopdemo.Employee.work())")
    public void afterWork() {
        System.out.println("After work: Work completed!");
    }

    @Around("execution(* com.springaopdemo.Employee.takeBreak())")
    public void aroundTakeBreak(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Around takeBreak: Entering break time...");
        proceedingJoinPoint.proceed(); // Execute the method
        System.out.println("Around takeBreak: Exiting break time...");
    }

    @AfterThrowing(pointcut = "execution(* com.springaopdemo.Employee.throwException())", throwing = "ex")
    public void afterThrowingException(Exception ex) {
        System.out.println("Exception thrown: " + ex.getMessage());
        // Notify or handle the exception as needed
    }
}
