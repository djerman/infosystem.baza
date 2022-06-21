package rs.atekom.infosystem.baza.a.drzava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;

@Entity
@Table(name = "a_drzava", uniqueConstraints = @UniqueConstraint(columnNames = {"naziv"}))
public class ADrzava extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private String naziv;
	private String sr;
	private String en;
	private String de;
	private String pozivniBroj;
	private String oznaka;
	private Boolean podrazumevan;

	public ADrzava() {
		// TODO Auto-generated constructor stub
		}

	public String toString() {
		return this.naziv;
		}

	@Column(name = "naziv", nullable = false, unique = true)
	public String getNaziv() {
		return naziv;
		}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
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

	public String getDe() {
		return de;
		}

	public void setDe(String de) {
		this.de = de;
		}
	
	public void setEn(String en) {
		this.en = en;
		}

	public String getPozivniBroj() {
		return pozivniBroj;
		}

	public void setPozivniBroj(String pozivniBroj) {
		this.pozivniBroj = pozivniBroj;
		}

	public String getOznaka() {
		return oznaka;
		}

	public void setOznaka(String oznaka) {
		this.oznaka = oznaka;
		}

	@Column(name = "podrazumevan", nullable = false)
	public Boolean getPodrazumevan() {
		return podrazumevan;
		}

	public void setPodrazumevan(Boolean podrazumevan) {
		this.podrazumevan = podrazumevan;
		}
	
	}
