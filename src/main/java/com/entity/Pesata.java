package com.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Pesata {
	@Id @GeneratedValue(strategy=GenerationType.AUTO) long id;
	private int quintali;
	private float prezzo;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="timestamp", nullable = false,
	    columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP")
	private Date timestamp = new Date();
	@ManyToOne
	Cliente cliente;
	
	
	public Pesata() {
		
	}
	public Date getTimestamp() {
		return this.timestamp;
	}
	public int getQuintali() {
		return quintali;
	}

	public void setQuintali(int quintali) {
		this.quintali = quintali;
	}



	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	
}
