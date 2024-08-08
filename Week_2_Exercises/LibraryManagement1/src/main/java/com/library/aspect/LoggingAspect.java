package com.library.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
//import org.springframework.stereotype.Component;
import java.time.LocalTime; 

@Aspect
public class LoggingAspect {
	@Before("execution(* com.library..*(..))")
	public void beforeMethodExecution(JoinPoint jointpoint)throws Throwable {
		System.out.println(jointpoint.toString()+" "+LocalTime.now());
	}
	
	@After("execution(* com.library..*(..))")
	public void AfterMethodExecution(JoinPoint jointpoint)throws Throwable {
		System.out.println(jointpoint.toString()+" "+LocalTime.now());
	}
}
