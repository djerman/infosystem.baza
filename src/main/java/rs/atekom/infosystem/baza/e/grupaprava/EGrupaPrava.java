package rs.atekom.infosystem.baza.e.grupaprava;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;

@Entity
@Table(name = "e_grupaprava", uniqueConstraints = @UniqueConstraint(columnNames = {"pretplatnik", "naziv"}))
public class EGrupaPrava extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private String naziv;
	private String sr;
	private String en;
	private String de;
	private String opis;
	private String opis_sr;
	private String opis_en;
	private String opis_de;
	
	public EGrupaPrava() {
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

	public String getOpis() {
		return opis;
		}

	public void setOpis(String opis) {
		this.opis = opis;
		}

	public String getOpis_sr() {
		return opis_sr;
		}

	public void setOpis_sr(String opis_sr) {
		this.opis_sr = opis_sr;
		}

	public String getOpis_en() {
		return opis_en;
		}

	public void setOpis_en(String opis_en) {
		this.opis_en = opis_en;
		}

	public String getOpis_de() {
		return opis_de;
		}

	public void setOpis_de(String opis_de) {
		this.opis_de = opis_de;
		}
	
	}
