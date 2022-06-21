package rs.atekom.infosystem.baza.a.uloga;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;

@Entity
@Table(name = "a_uloga", uniqueConstraints = @UniqueConstraint(columnNames = {"naziv"}))
public class AUloga extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private String naziv;
	private String sr;
	private String en;
	private String de;
	
	public AUloga() {
		// TODO Auto-generated constructor stub
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
