package springido;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanTestMain {
	
	@Autowired
	Performer performer;
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springido/component-scan-config.xml");
		
		
		//Performer performer = (Performer) context.getBean("eddie");
		
		//Instrument guitar = (Instrument)context.getBean("guitar");
		
		ComponentScanTestMain componentScanTestMain = (ComponentScanTestMain)context.getBean("componentScanTestMain");
		
		componentScanTestMain.performer.perform();
	}
	
	
	
	

}
