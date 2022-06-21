package rs.atekom.infosystem.baza.a.tipbrojaca;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import rs.atekom.infosystem.baza.OsnovnaSema;

@Entity
@Table(name = "a_tipbrojaca", uniqueConstraints = {@UniqueConstraint(columnNames = {"naziv"}), @UniqueConstraint(columnNames = {"tip"})})
public class ATipBrojaca extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private String naziv;
	private Integer tip;
	private String sr;
	private String en;
	private String de;
	private String opis;
	private String opissr;
	private String opisen;
	private String opisde;

	public ATipBrojaca() {
		// TODO Auto-generated constructor stub
	}

	public Integer getTip() {
		return tip;
	}

	public void setTip(Integer tip) {
		this.tip = tip;
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

	public String getOpissr() {
		return opissr;
	}

	public void setOpissr(String opissr) {
		this.opissr = opissr;
	}

	public String getOpisen() {
		return opisen;
	}

	public void setOpisen(String opisen) {
		this.opisen = opisen;
	}

	public String getOpisde() {
		return opisde;
	}

	public void setOpisde(String opisde) {
		this.opisde = opisde;
	}
	
}
