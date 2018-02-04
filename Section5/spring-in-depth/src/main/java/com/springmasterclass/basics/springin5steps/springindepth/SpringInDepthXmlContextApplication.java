package com.springmasterclass.basics.springin5steps.springindepth;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmasterclass.basics.springin5steps.springindepth.xml.XmlPersonDAO;

@Configuration
@ComponentScan
public class SpringInDepthXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringInDepthXmlContextApplication.class);

	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext xmlApplicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

				XmlPersonDAO xmlPersonDAO = 
							xmlApplicationContext.getBean(XmlPersonDAO.class);
	
				System.out.println(xmlPersonDAO);
				System.out.println(xmlPersonDAO.getXmlJdbcConnection());
				
				LOGGER.info("Beans lodaded -> {}", (Object)xmlApplicationContext.getBeanDefinitionNames()); ;
				
				LOGGER.info("{} {}", xmlPersonDAO, xmlPersonDAO.getXmlJdbcConnection());
		}
		
	}
}
