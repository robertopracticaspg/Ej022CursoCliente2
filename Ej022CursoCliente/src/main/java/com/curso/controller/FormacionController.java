package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Formacion;
import com.curso.service.FormacionService;



@RestController
public class FormacionController {
@Autowired	
	
	FormacionService service;
	
	@PostMapping(value="formacion/{curso}/{asignatura}/{precio}")
	public List<Formacion> nuevaFormacion
	(@PathVariable("curso") String curso, 
	 @PathVariable("asignatura")int asignatura,
	 @PathVariable("precio")double precio){
		Formacion ejemplar = new Formacion(curso,asignatura,precio);
		return service.nuevaFormacion(ejemplar);
	}
	////////////////////////////////////////////////////
	// Alta curso. A partir de los datos de formación recibidos en el cuerpo, se dará de alta el curso a través del 
	//microservicio de cursos, siempre que no exista un curso con el mismo nombre, en cuyo caso no se hará nada. La duración 
	//del curso se establecerá según la fórmula: asignaturas*10
//	@PostMapping(value="formacion/{curso}/{asignatura}/{precio}")
//	public List<Formacion> nuevaFormacion2
//	(@PathVariable("curso") String curso, 
//	 @PathVariable("asignatura")int asignatura,
//	 @PathVariable("precio")double precio){
//		Formacion ejemplar = new Formacion(curso,asignatura,precio);
//	
//		return service.nuevaFormacion2(ejemplar);
//	}
	
}
