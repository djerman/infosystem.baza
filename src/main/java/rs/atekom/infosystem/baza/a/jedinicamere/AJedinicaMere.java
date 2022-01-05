package rs.atekom.infosystem.baza.a.jedinicamere;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import rs.atekom.infosystem.baza.OsnovnaSema;

@Entity
@Table(name = "a_jedinicamere")
public class AJedinicaMere extends OsnovnaSema{

	private static final long serialVersionUID = 1L;

	private String naziv;
	private String nazivSr;
	private String nazivEn;
	private String nazivDe;
	private String oznaka;
	private String sr;
	private String en;
	private String de;
	
	public AJedinicaMere() {
		// TODO Auto-generated constructor stub
		}

	@Column(name = "naziv", unique = true, nullable = false)
	public String getNaziv() {
		return naziv;
		}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
		}

	public String getNazivSr() {
		return nazivSr;
		}

	public void setNazivSr(String nazivSr) {
		this.nazivSr = nazivSr;
		}

	public String getNazivEn() {
		return nazivEn;
		}

	public void setNazivEn(String nazivEn) {
		this.nazivEn = nazivEn;
		}

	public String getNazivDe() {
		return nazivDe;
		}

	public void setNazivDe(String nazivDe) {
		this.nazivDe = nazivDe;
		}

	@Column(name = "oznaka", unique = true, nullable = false)
	public String getOznaka() {
		return oznaka;
		}

	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
		}

	public String getSr() {
		return sr;
		}

	public void setSr(String sr) {
		this.sr = sr;
		}

	public String getEn() {
		return en;
		}

	public void setEn(String en) {
		this.en = en;
		}

	public String getDe() {
		return de;
		}

	public void setDe(String de) {
		this.de = de;
		}
	
	}
