package rs.atekom.infosystem.baza.e.konto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.db.kontoracun.DBKontoRacun;

@Entity
@Table(name = "e_konto")
public class EKonto extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private DBKontoRacun podgrupa;
	private String sifra;
	private String naziv;
	private String sr;
	private String en;
	private String de;
	
	public EKonto() {
		// TODO Auto-generated constructor stub
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pretplatnik", nullable = true)
	public DPretplatnik getPretplatnik() {
		return pretplatnik;
		}

	public void setPretplatnik(DPretplatnik pretplatnik) {
		this.pretplatnik = pretplatnik;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "podgrupa", nullable = false)
	public DBKontoRacun getPodgrupa() {
		return podgrupa;
		}

	public void setPodgrupa(DBKontoRacun podgrupa) {
		this.podgrupa = podgrupa;
		}

	@Size(min = 4)
	@Column(name = "sifra", nullable = false)
	public String getSifra() {
		return sifra;
		}

	public void setSifra(String sifra) {
		this.sifra = sifra;
		}

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
	
	}
