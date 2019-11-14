package com.proyect1.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyect1.prueba.domain.Info_Quechua;


@Repository
public interface InfoQRepository extends JpaRepository<Info_Quechua, Integer>{

}
