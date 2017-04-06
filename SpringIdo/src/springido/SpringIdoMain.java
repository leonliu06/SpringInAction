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
		
		Contestant performer6 = (Contestant) performer3;
		performer6.receiveAward();
		
		Contestant performer4 = (Contestant)ctx.getBean("kenny2");
		//performer4.perform();
		performer4.receiveAward();
		
		Performer performer5 = (Performer) performer4;
		performer5.perform();
		
		Thinker thinker = (Thinker)ctx.getBean("volunteer");
		thinker.thinkOfSomething("wwww");
		
		MindReader magician = (MindReader)ctx.getBean("magician");
		System.out.println(magician.getThoughts());
	}
}
