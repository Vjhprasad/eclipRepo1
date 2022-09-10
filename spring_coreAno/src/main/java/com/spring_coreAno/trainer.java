package com.spring_coreAno;

import org.springframework.stereotype.Component;

@Component("a1")
public class trainer implements Trainer_interf{

	public void teach() {
		System.out.println("teaching Anotation to the trainees ");
		
	}
}