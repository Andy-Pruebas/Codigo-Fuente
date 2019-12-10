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
@Table(name = "respuestasanemia")
public class RespuestaAnemia implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_respuanemia")
	private int id_respuesta;
	@Column(name = "respuesta")
	private String respuesta;
	@Column(name = "peso")
	private int peso;
	public int getId_respuesta() {
		return id_respuesta;
	}
	public void setId_respuesta(int id_respuesta) {
		this.id_respuesta = id_respuesta;
	}
	public String getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "RespuestaAnemia [id_respuesta=" + id_respuesta + ", respuesta=" + respuesta + ", peso=" + peso + "]";
	}
	
}
