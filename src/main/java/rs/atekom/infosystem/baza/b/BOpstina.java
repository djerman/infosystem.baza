package rs.atekom.infosystem.baza.b;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.a.drzava.ADrzava;

@Entity
@Table(name = "b_opstina")
public class BOpstina extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private ADrzava drzava;
	private String naziv;
	private String sr;
	private String en;
	private String de;
	private String pozivniBroj;
	private String postanskiBroj;
	private String pozivNaBroj;

	public BOpstina() {
		// TODO Auto-generated constructor stub
		}
	
	public String toString() {
		return this.naziv;
		}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "drzava")
	public ADrzava getDrzava() {
		return drzava;
		}

	public void setDrzava(ADrzava drzava) {
		this.drzava = drzava;
		}

	@Column(name = "naziv", nullable = false)
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

	public void setEn(String en) {
		this.en = en;
		}

	public String getDe() {
		return de;
		}

	public void setDe(String de) {
		this.de = de;
		}

	public String getPozivniBroj() {
		return pozivniBroj;
		}

	public void setPozivniBroj(String pozivniBroj) {
		this.pozivniBroj = pozivniBroj;
		}

	public String getPostanskiBroj() {
		return postanskiBroj;
		}

	public void setPostanskiBroj(String pozivniBroj) {
		this.postanskiBroj = pozivniBroj;
		}

	public String getPozivNaBroj() {
		return pozivNaBroj;
		}

	public void setPozivNaBroj(String pozivNaBroj) {
		this.pozivNaBroj = pozivNaBroj;
		}

	}
