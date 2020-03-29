package com.entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;


@Entity(name="Cliente")
@Table(name="cliente")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cliente  {
	
	private String nome;
	private String cognome;
	private String via;
	private String n_civico;
	private String citta;
	private Integer CAP;
	private String codNazionale;
	private String codSDI;
	 @Id
	private String CF;
	private String codiceSian;
	@OneToMany(cascade = CascadeType.ALL)
	public List<Pesata> pesate=new ArrayList<Pesata>();
	public float somma;
	public float mediaPrezzo;
	
	
	public Cliente() {
	};
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public String getVia() {
		return via;
	}


	public void setVia(String via) {
		this.via = via;
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


	public Integer getCAP() {
		return CAP;
	}


	public void setCAP(Integer cAP) {
		CAP = cAP;
	}

	public float getsomma() {
		return somma;
	}


	public float getMediaPrezzo() {
		return mediaPrezzo;
	}

	public String getCodNazionale() {
		return codNazionale;
	}


	public void setCodNazionale(String codNazionale) {
		this.codNazionale = codNazionale;
	}


	public String getCodSDI() {
		return codSDI;
	}


	public void setCodSDI(String codSDI) {
		this.codSDI = codSDI;
	}


	public String getCF() {
		return CF;
	}


	public void setCF(String cF) {
		CF = cF;
	}


	public String getCodiceSian() {
		return codiceSian;
	}


	public void setCodiceSian(String codiceSian) {
		this.codiceSian = codiceSian;
	}
	public List<Pesata> getPesate() {
		return pesate;
	}
	public void setPesate(List<Pesata> pesate) {
		this.pesate = pesate;
	}
	


}