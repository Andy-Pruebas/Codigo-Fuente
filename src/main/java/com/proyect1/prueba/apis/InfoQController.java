package com.proyect1.prueba.apis;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.proyect1.prueba.domain.Info_Quechua;
import com.proyect1.prueba.repository.InfoQRepository;

@RestController
@RequestMapping("/apis")
public class InfoQController {
	@Autowired
	InfoQRepository infoqrepository;

	@GetMapping("/infosq")
	public List<Info_Quechua> findall() {
		return infoqrepository.findAll();
	}

	@PostMapping("/infosq")
	public Info_Quechua guardar(@RequestBody Info_Quechua info) {
		return infoqrepository.save(info);
	}
	@GetMapping("/infosq/{id}")
	public Optional<Info_Quechua> buscarid(@PathVariable int id) {
		return infoqrepository.findById(id);
	}
	@DeleteMapping("/infosq/{id}")
	void eliminar(@PathVariable int id) {
		infoqrepository.deleteById(id);
	}
}

