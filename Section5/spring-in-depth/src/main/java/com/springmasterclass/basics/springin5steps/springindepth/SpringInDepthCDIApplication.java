package com.springmasterclass.basics.springin5steps.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.springmasterclass.basics.springin5steps.springindepth.cdi.CDI_Business;

@SpringBootApplication
@ComponentScan("com.springmasterclass.basics.springin5steps.springindepth.cdi")
public class SpringInDepthCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInDepthCDIApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringInDepthCDIApplication.class, args);

		CDI_Business cdiBusiness = applicationContext.getBean(CDI_Business.class);

		LOGGER.info("{}", cdiBusiness.getClass());

	}
}
