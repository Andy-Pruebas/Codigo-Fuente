package com.proyect1.prueba.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyect1.prueba.domain.RespuestaAnemia;

@Repository
public interface RespuestaAnemiaRepository extends JpaRepository<RespuestaAnemia,Integer>{

}
