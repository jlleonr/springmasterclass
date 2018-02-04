package com.springmasterclass.basics.springin5steps.springindepth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springmasterclass.basics.springin5steps.springindepth.basic.BinarySearchImpl;
import com.springmasterclass.basics.springin5steps.springindepth.properties.SomeExternalService;

@Configuration
@ComponentScan("com.springmasterclass.basics.springin5steps.springindepth.properties")
//Load app.properties
@PropertySource("classpath:app.properties")
public class SpringInDepthPropertiesApplication {

	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext annotationConfigApplicationContext = 
				new AnnotationConfigApplicationContext(SpringInDepthPropertiesApplication.class)) {
			
			SomeExternalService externalService = 
							annotationConfigApplicationContext.getBean(SomeExternalService.class);

			System.out.println(externalService.getUrl());
		}
		
	}
}
