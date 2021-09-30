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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConsumeSoapWebServiceApplication {

	@Autowired
	private ClientApplication clientApplication;
	
	@PostMapping("/getCurrencyDetails")
	public CurrencyNameResponse getCurrencyResponseFromClient(@RequestBody CurrencyName  ISOCode) {
		return  clientApplication.getCurrencyResponse(ISOCode);
	}
	
	@PostMapping("/getListOfCountryNamesByCode")
	public ListOfCountryNamesByCodeResponse getListOfCountryNamesByCodeFromClient(@RequestBody ListOfCountryNamesByCode  listOfCountryNamesByCode) {
		return  clientApplication.getListOfCountryNamesByCode(listOfCountryNamesByCode);
	}
	
	@PostMapping("/getFullCountryInfo")
	public FullCountryInfoResponse getFullCountryInfoFromClient(@RequestBody FullCountryInfo  fullCountryInfo) {
		return  clientApplication.getFullCountryInfoResponse(fullCountryInfo);
	}
	@PostMapping("/getFullCountryInfoAllCountries ")
	public FullCountryInfoAllCountriesResponse getFullCountryInfoAllCountriesFromClient(@RequestBody FullCountryInfoAllCountries  fullCountryInfoAllCountries) {
		return  clientApplication.getFullCountryInfoAllCountries(fullCountryInfoAllCountries);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumeSoapWebServiceApplication.class, args);
	}

}
