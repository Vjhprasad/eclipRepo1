package com.spring_coreAno;
import org.springframework.stereotype.Component;

	@Component("a2")
	public class trainer1 implements Trainer_interf{

		public void teach() {
			System.out.println("trainer 1 is teaching qualifier");
			
		}

	}
