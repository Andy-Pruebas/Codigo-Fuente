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
@Table(name = "lenguas")
public class Lengua implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_leng")
	private int id_leng;
	@Column(name = "lengua")
	private String lengua;

	public Lengua() {
		super();
	}

	public Lengua(int id_leng, String lengua) {
		super();
		this.id_leng = id_leng;
		this.lengua = lengua;
	}

	public int getId_leng() {
		return id_leng;
	}

	public void setId_leng(int id_leng) {
		this.id_leng = id_leng;
	}

	public String getLengua() {
		return lengua;
	}

	public void setLengua(String lengua) {
		this.lengua = lengua;
	}

	@Override
	public String toString() {
		return "Lengua [id_leng=" + id_leng + ", lengua=" + lengua + "]";
	}

}
