package com.springmasterclass.basics.springin5steps.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springmasterclass.basics.componentscan.ComponentDAO;
import com.springmasterclass.basics.springin5steps.springindepth.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.springmasterclass.basics.componentscan")
public class ComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(ComponentScanApplication.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}", componentDAO);
		
	}
}
