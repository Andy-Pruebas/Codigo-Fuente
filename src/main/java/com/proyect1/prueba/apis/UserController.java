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
import com.proyect1.prueba.domain.User;
import com.proyect1.prueba.repository.UserRepository;

@RestController
@RequestMapping("/apis")
public class UserController {

	@Autowired
	UserRepository repository;

	@GetMapping("/users")
	public List<User> findall() {
		return repository.findAll();
	}

	@PostMapping("/users")
	public User guardar(@RequestBody User user) {
		return repository.save(user);
	}

	@GetMapping("/users/{id_usuario}")
	public Optional<User> buscarid(@PathVariable int id_usuario) {
		return repository.findById(id_usuario);
	}
	@DeleteMapping("/users/{id_usuario}")
	void eliminar(@PathVariable int id_usuario) {
		repository.deleteById(id_usuario);
	}
}
