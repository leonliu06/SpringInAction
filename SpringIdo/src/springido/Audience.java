package springido;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
	public void takeSeats(){ // 表演之前
		System.out.println("The audience is taking their seats.");
	}
	
	public void turnOffCellPhones(){ // 表演之前
		System.out.println("The audience is turning off their cellphones");
	}
	
	public void applaud(){ // 表演之后
		System.out.println("CLAP CLAP CLAP CLAP ");
	}
	
	public void demandRefund(){ // 表演失败之后
		System.out.println("Boo! We want our money back!");
	}
	
	public void watchPerformance(ProceedingJoinPoint joinPoint){
		try{
			// 表演之前
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones");
			long start = System.currentTimeMillis();
			
			// 执行被通知的方法
			joinPoint.proceed();
			
			// 表演之后
			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP");
			System.out.println("The performanct took " + (end - start) + " milliseconds");
		}catch(Throwable t){
			System.out.println("Boo! We want our money bakc!"); // 表演失败之后
		}
	}
}
