package com.library.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Around("execution(* com.library.service.*.*(..))")
	public void logExecutionTime(ProceedingJoinPoint jointpoint)throws Throwable {
		long startTime = System.currentTimeMillis();
        Object object = jointpoint.proceed();
        long endtime = System.currentTimeMillis()-startTime;
        System.out.println(jointpoint.getSignature()+" "+endtime+" "+"ms");
	}


}
