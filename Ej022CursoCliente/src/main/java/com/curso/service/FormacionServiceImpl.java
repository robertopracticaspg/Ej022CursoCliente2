package com.curso.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.model.Formacion;



@Service
public class FormacionServiceImpl implements FormacionService {

	@Autowired
	RestTemplate template;
	
	private String url="http://localhost:8080/";
	@Override
	public List<Formacion> nuevaFormacion(Formacion formacion) {
		template.postForLocation(url+"curso", formacion); //con POST
		return Arrays.asList(template.getForObject(url + "formacion", Formacion[].class)); //con GET
				
	}
	/////////////////////////////////////////////////////////////////////////////////////
	


}