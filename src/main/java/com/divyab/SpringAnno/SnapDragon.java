package com.divyab.SpringAnno;

import org.springframework.stereotype.Component;

@Component ("snapDragon")
public class SnapDragon implements MobileProcessor {

	public void process() {
		System.out.println("Snap Dragon");
		
	}

}
