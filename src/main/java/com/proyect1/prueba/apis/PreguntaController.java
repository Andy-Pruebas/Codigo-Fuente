package com.proyect1.prueba.apis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyect1.prueba.domain.Pregunta;
import com.proyect1.prueba.repository.PreguntaRepository;

@RestController
@RequestMapping("/apis")
public class PreguntaController {
	@Autowired
	PreguntaRepository pregunta;
	
	@GetMapping("/preguntas")
	public List<Pregunta> findAll(){
		return pregunta.findAll();
	}
	@GetMapping("/preguntas/{id_pregunta}")
	public Optional<Pregunta> findid(@PathVariable int id_pregunta){
		return pregunta.findById(id_pregunta);
	}
}
