package com.gendis.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="anggota")
public class Anggota implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id_anggota;
	private String nama_anggota;
	private String email_anggota;
	private String password_anggota;
	
	@Id
	public int getId_anggota() {
		return id_anggota;
	}
	public void setId_anggota(int id_anggota) {
		this.id_anggota = id_anggota;
	}
	public String getNama_anggota() {
		return nama_anggota;
	}
	public void setNama_anggota(String nama_anggota) {
		this.nama_anggota = nama_anggota;
	}
	public String getEmail_anggota() {
		return email_anggota;
	}
	public void setEmail_anggota(String email_anggota) {
		this.email_anggota = email_anggota;
	}
	public String getPassword_anggota() {
		return password_anggota;
	}
	public void setPassword_anggota(String password_anggota) {
		this.password_anggota = password_anggota;
	}
	
	

}
