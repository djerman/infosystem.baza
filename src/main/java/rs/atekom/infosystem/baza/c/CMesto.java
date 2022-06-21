package rs.atekom.infosystem.baza.c;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.a.drzava.ADrzava;
import rs.atekom.infosystem.baza.b.BOpstina;

@Entity
@Table(name = "c_mesto", uniqueConstraints = @UniqueConstraint(columnNames = {"naziv"}))
public class CMesto extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private ADrzava drzava;
	private BOpstina opstina;
	private String naziv;
	private String sr;
	private String en;
	private String de;
	private String postanskiBroj;
	private String pozivniBroj;
	
	public CMesto() {
		// TODO Auto-generated constructor stub
		}

	public String toString() {
		return this.naziv;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "drzava", nullable = false)
	public ADrzava getDrzava() {
		return drzava;
		}

	public void setDrzava(ADrzava drzava) {
		this.drzava = drzava;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "opstina", nullable = true)
	public BOpstina getOpstina() {
		return opstina;
		}

	public void setOpstina(BOpstina opstina) {
		this.opstina = opstina;
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

	public String getPostanskiBroj() {
		return postanskiBroj;
		}

	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
		}

	public String getPozivniBroj() {
		return pozivniBroj;
		}

	public void setPozivniBroj(String pozivniBroj) {
		this.pozivniBroj = pozivniBroj;
		}
	
	}
