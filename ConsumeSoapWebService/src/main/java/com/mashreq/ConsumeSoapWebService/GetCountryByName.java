package com.mashreq.ConsumeSoapWebService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class GetCountryByName {

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller jaxb2Marshaller=new Jaxb2Marshaller();
		jaxb2Marshaller.setPackagesToScan("org.com.mashreq");
		return jaxb2Marshaller;
	}
	

}
