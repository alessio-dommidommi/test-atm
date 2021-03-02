package net.asforil.atmRest.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import net.asforil.atmRest.model.Atm;

@Service
public class AtmService {
	
	
	@Autowired	
	private RestTemplate restTemplate;
	
    private String ListAtmUrl = "https://www.dropbox.com/s/6fg0k2wxwrheyqk/ATMs?dl=1";
	
	
	public List<Atm> getAllAtm() {	
		
		//add a converter for restTemplate to support all media type (media type request is application/binary )
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		messageConverters.add(converter);
		restTemplate.setMessageConverters(messageConverters);	
		
		Atm[] arrayAtm = restTemplate.getForObject(ListAtmUrl, Atm[].class);
		List<Atm> listAtm = Arrays.asList(arrayAtm);			
		
		return listAtm;
	}
	
	
	
	
	
	

}
