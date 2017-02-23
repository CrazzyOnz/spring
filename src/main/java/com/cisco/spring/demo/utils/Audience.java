package com.cisco.spring.demo.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	public Audience() {
	} 
	
	@Pointcut("execution(** com.cisco.spring.demo.api.Performance.perform(..))") 
	public void performance(){} 

	@Around("performance()")   
	public void watchPerformance(ProceedingJoinPoint jp){  
		try{
			
			System.out.println("Silence the Phone"); 
			System.out.println("Taking seats"); 
			jp.proceed();
			System.out.println("Clap Clap");
			
		}catch (Throwable e){
			System.out.println("Demand Refund");
		}
		
	}

	/*
	 * @Before("execution(** com.cisco.spring.demo.api.Performance.perform(..))"
	 * ) public void silenceCallPhones() { System.out.println(
	 * "Silence the Phone"); }
	 * 
	 * @Before("execution(** com.cisco.spring.demo.api.Performance.perform(..))"
	 * ) public void takeSeats() { System.out.println("Taking seats"); }
	 * 
	 * @AfterReturning(
	 * "execution(** com.cisco.spring.demo.api.Performance.perform(..))") public
	 * void applause() { System.out.println("Clap Clap"); }
	 * 
	 * @AfterThrowing(
	 * "execution(** com.cisco.spring.demo.api.Performance.perform(..))") public
	 * void demandRefund() { System.out.println("Demand Refund"); }
	 */
}
