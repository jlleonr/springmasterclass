package com.springmasterclass.basics.springin5steps.springindepth.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SomeExternalService {

	// get value from property file
	@Value("${external.service.url}")
	private String url;

	public String getUrl() {
		return url;
	}



}
