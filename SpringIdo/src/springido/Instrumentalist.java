package springido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Instrumentalist implements Performer{
	public Instrumentalist(){}	
	
	public void perform(){
		System.out.println("Playing " + song + " : ");
		instrument.play();
		
	}
	
	private String song;
	
	public void setSong(String song){//inject the song
		this.song = song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong(){
		return song;
	}
	
	private Instrument instrument;
	
	@Autowired
	@Qualifier("saxophone")
	public void setInstrument(Instrument instrument){ // inject the instrument
		this.instrument = instrument;
	}
	
	private int age;
	
	public void setAge(int age){// inject the age
		this.age = age;
	}
}
