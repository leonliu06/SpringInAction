package springido;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdoMain {
	public static void main(String[] args){
		System.out.println("----------");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springido/spring-ido.xml");
		System.out.println("----------");
		Performer performer = (Performer)ctx.getBean("poeticDuke");
		performer.perform();
		
		Stage stage = (Stage)ctx.getBean("theStage");
		
		stage.ShowStage();
		
		//Auditorium auditorium = (Auditorium)ctx.getBean("auditorium");
		
		Performer performer2 = (Performer)ctx.getBean("kenny");
		performer2.perform();
		
		Performer performer3 = (Performer)ctx.getBean("kenny2");
		performer3.perform();
	}
}
