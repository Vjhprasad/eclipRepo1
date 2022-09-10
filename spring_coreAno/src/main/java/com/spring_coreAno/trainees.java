package com.spring_coreAno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
@Component("b1")
public class trainees {
	@Autowired
	@Qualifier("a2")
	private Trainer_interf tt;
	
	public void setTt(Trainer_interf tt) {
		this.tt = tt;
	}
	public void usingtrainer()
	{
		tt.teach();
	}
	public static void main(String args[])
	{
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("ob.xml");
		
		trainees t1 = (trainees)ctx.getBean("b1");
		t1.usingtrainer();	
	}	
}
