package com.entity;

import java.io.Serializable;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Frantoio implements Serializable{
	private String nome;
	private String via;
	private String n_civico;
	private String citta;
	@Id
	private String partitaIva;
	private String codiceSDI;
	
	public Frantoio(String nome, String via, String n_civico, String citta,String partitaIva, String codiceSDI) {
		this.nome=nome;
		this.via=via;
		this.n_civico=n_civico;
		this.citta=citta;
		this.partitaIva=partitaIva;
		this.codiceSDI=codiceSDI;
		
	}
	public static Frantoio createFrantoio() {
		Scanner in=new Scanner(System.in);
		System.out.println("Dammi il nome del frantoio: ");
		String nome = in.nextLine();
		System.out.println("Dammi la via del frantoio: ");
		String via = in.nextLine();
		System.out.println("Dammi il n_civico del frantoio: ");
		String n_civico = in.nextLine();
		System.out.println("Dammi il citta del frantoio: ");
		String citta = in.nextLine();	
		System.out.println("Dammi la partita iva del frantoio: ");
		String partitaIva=in.nextLine();		
		System.out.println("Dammi il codSDI del frantoio: ");
		String codSDI=in.nextLine();
		return new Frantoio(nome,via,n_civico,citta,partitaIva,codSDI);
	}
	
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getN_civico() {
		return n_civico;
	}
	public void setN_civico(String n_civico) {
		this.n_civico = n_civico;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public String getPartitaIva() {
		return partitaIva;
	}
	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}
	public String getCodiceSDI() {
		return codiceSDI;
	}
	public void setCodiceSDI(String codiceSDI) {
		this.codiceSDI = codiceSDI;
	}
	
	
	
}
