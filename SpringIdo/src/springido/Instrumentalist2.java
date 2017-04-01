package springido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("eddie")
public class Instrumentalist2 implements Performer{

	@Autowired
	private Instrument2 instrument2;
	
	@Override
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("Instrumentalist2");
		instrument2.play();
	}

}
