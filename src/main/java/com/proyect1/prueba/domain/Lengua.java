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
@Table(name = "lengua")
public class Lengua implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_len")
	private int id_len;
	@Column(name = "lengua")
	private String lengua;

	public Lengua() {
		super();
	}

	public Lengua(int id_len, String lengua) {
		super();
		this.id_len = id_len;
		this.lengua = lengua;
	}

	public int getId_len() {
		return id_len;
	}

	public void setId_len(int id_len) {
		this.id_len = id_len;
	}

	public String getLengua() {
		return lengua;
	}

	public void setLengua(String lengua) {
		this.lengua = lengua;
	}

	@Override
	public String toString() {
		return "Lengua [id_len=" + id_len + ", lengua=" + lengua + "]";
	}

}
