package com.proyect1.prueba.domain;

import javax.persistence.Column;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "preguntas")
public class Pregunta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pregunta")
	private int id_pregunta;
	@Column(name = "pregunta")
	private String pregunta;

	public Pregunta() {
		super();
	}

	public Pregunta(int id_pregunta, String pregunta) {
		super();
		this.id_pregunta = id_pregunta;
		this.pregunta = pregunta;
	}

	public int getId_pregunta() {
		return id_pregunta;
	}

	public void setId_pregunta(int id_pregunta) {
		this.id_pregunta = id_pregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	@Override
	public String toString() {
		return "Pregunta [id_pregunta=" + id_pregunta + ", pregunta=" + pregunta + "]";
	}

}
