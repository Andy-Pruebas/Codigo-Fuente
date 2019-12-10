package com.proyect1.prueba.apis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyect1.prueba.domain.RespuestaAnemia;
import com.proyect1.prueba.repository.RespuestaAnemiaRepository;

@RestController
@RequestMapping("/apis")
public class RespuestaAnemiaController {
	@Autowired
	RespuestaAnemiaRepository Anemia;
	@GetMapping("/respuestasanemia")
	public List<RespuestaAnemia> findAll() {
		return Anemia.findAll();
	}
	@PostMapping("/respuestaanemia")
	public RespuestaAnemia guardar(@RequestBody RespuestaAnemia anemia){
		return Anemia.save(anemia);
	}
	@GetMapping("/respuestasanemia/{id_respuanemia}")
	public Optional<RespuestaAnemia> findid(@PathVariable int id_respuanemia) {
		return Anemia.findById(id_respuanemia);
	}
}
