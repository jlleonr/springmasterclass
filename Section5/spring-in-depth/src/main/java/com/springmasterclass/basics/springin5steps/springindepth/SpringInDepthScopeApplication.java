package com.springmasterclass.basics.springin5steps.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springmasterclass.basics.springin5steps.springindepth.scope.PersonDAO;

@SpringBootApplication
public class SpringInDepthScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringInDepthScopeApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringInDepthScopeApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO2);
		
		LOGGER.info("{}", personDAO.getJdbcConnection());
		LOGGER.info("{}", personDAO2.getJdbcConnection());

	}
}
