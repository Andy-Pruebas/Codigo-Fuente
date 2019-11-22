package com.proyect1.prueba.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "informacion_c")
public class Info implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "info")
	private String info;
	@Column(name = "id_len")
	private int id_len;
	
	public Info() {
		super();
	}

	public Info(int id, String info,int id_len) {
		super();
		this.id = id;
		this.info = info;
		this.id_len=id_len;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public int getId_len() {
		return id_len;
	}

	public void setId_len(int id_len) {
		this.id_len = id_len;
	}

	@Override
	public String toString() {
		return "Info [id=" + id + ", info=" + info + ", id_len=" + id_len + "]";
	}


}
