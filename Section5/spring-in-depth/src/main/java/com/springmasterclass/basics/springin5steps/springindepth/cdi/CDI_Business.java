package com.springmasterclass.basics.springin5steps.springindepth.cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//@Component
@Named
public class CDI_Business {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	//@Autowired
	@Inject
	CDI_DAO cdiDAO;

	public CDI_DAO getCdiDAO() {
		return cdiDAO;
	}

	public void setCdiDAO(CDI_DAO cdiDAO) {
		this.cdiDAO = cdiDAO;
	}
	
	@PostConstruct
	private void postConstruct() {
		logger.info("CDI_Business postConstruct");

	}
	
	@PreDestroy
	private void preDestroy() {
		logger.info("CDI_Business preDestroy");

	}
}
