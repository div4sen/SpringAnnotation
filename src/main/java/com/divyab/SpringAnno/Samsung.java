package com.divyab.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component ("samsung")//Non qualified and decapitalised
public class Samsung {
	
	@Autowired
	@Qualifier("snapDragon")
	MobileProcessor cpu;
	
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config ()
	{
		System.out.println("Octa Core Samsung");
		cpu.process();
	}

}
