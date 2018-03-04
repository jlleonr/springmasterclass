package com.springmasterclass.basics.springin5steps.springindepth.cdi;

import javax.inject.Named;

//@Component
@Named
public class CDI_DAO {
	
	public int[] getData() {
		return new int[] { 5, 89, 100 };
	}
	
}
