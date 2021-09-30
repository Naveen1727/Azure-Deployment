package com.mashreq.ConsumeSoapWebService;

import org.com.mashreq.CurrencyName;
import org.com.mashreq.CurrencyNameResponse;
import org.com.mashreq.FullCountryInfo;
import org.com.mashreq.FullCountryInfoAllCountries;
import org.com.mashreq.FullCountryInfoAllCountriesResponse;
import org.com.mashreq.FullCountryInfoResponse;
import org.com.mashreq.ListOfCountryNamesByCode;
import org.com.mashreq.ListOfCountryNamesByCodeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class ClientApplication {

	@Autowired
	private Jaxb2Marshaller jaxb2Marshaller;
	//@Autowired
	private WebServiceTemplate serviceTemplate;


	public CurrencyNameResponse getCurrencyResponse(CurrencyName ISOCode) {
		serviceTemplate=new WebServiceTemplate(jaxb2Marshaller);
		CurrencyNameResponse currencyNameResponse=(CurrencyNameResponse) serviceTemplate.marshalSendAndReceive("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso",ISOCode);
		return currencyNameResponse;
	}
	
	public ListOfCountryNamesByCodeResponse getListOfCountryNamesByCode(ListOfCountryNamesByCode  listOfCountryNamesByCode) {
		serviceTemplate=new WebServiceTemplate(jaxb2Marshaller);
		ListOfCountryNamesByCodeResponse listOfCountryNamesByCodeResponse=(ListOfCountryNamesByCodeResponse) serviceTemplate.marshalSendAndReceive("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso",listOfCountryNamesByCode);
		return listOfCountryNamesByCodeResponse;
	}
	
	public FullCountryInfoResponse getFullCountryInfoResponse(FullCountryInfo fullCountryInfo) {
		serviceTemplate=new WebServiceTemplate(jaxb2Marshaller);
		FullCountryInfoResponse fullCountryInfoResponse=(FullCountryInfoResponse) serviceTemplate.marshalSendAndReceive("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso",fullCountryInfo);
		return fullCountryInfoResponse;
	}
	
	public FullCountryInfoAllCountriesResponse getFullCountryInfoAllCountries(FullCountryInfoAllCountries fullCountryInfoAllCountries) {
		serviceTemplate=new WebServiceTemplate(jaxb2Marshaller);
		FullCountryInfoAllCountriesResponse fullCountryInfoAllCountriesResponse=(FullCountryInfoAllCountriesResponse) serviceTemplate.marshalSendAndReceive("http://webservices.oorsprong.org/websamples.countryinfo/CountryInfoService.wso",fullCountryInfoAllCountries);
		return fullCountryInfoAllCountriesResponse;
	}
}
