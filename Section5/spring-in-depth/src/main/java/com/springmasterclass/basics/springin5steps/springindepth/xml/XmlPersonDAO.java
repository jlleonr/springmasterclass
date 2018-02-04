package com.springmasterclass.basics.springin5steps.springindepth.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class XmlPersonDAO {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	XmlJdbcConnection xmlJdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}
	
}
