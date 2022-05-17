package rs.atekom.infosystem.baza.a.prava;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import rs.atekom.infosystem.baza.OsnovnaSema;

@Entity
@Table(name = "a_prava")
public class APrava extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private String putanja;
	private String naziv;
	private String sr;
	private String en;
	private String de;
	private String opis;
	private String opis_sr;
	private String opis_en;
	private String opis_de;
	private Integer tip;

	public APrava() {
		// TODO Auto-generated constructor stub
		}

	@Column(name = "putanja", unique = true, nullable = false)
	public String getPutanja() {
		return putanja;
		}

	public void setPutanja(String putanja) {
		this.putanja = putanja;
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

	public Integer getTip() {
		return tip;
		}

	public void setTip(Integer tip) {
		this.tip = tip;
		}
	
	}
