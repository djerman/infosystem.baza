package rs.atekom.infosystem.baza.f.brojac;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.a.tipbrojaca.ATipBrojaca;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;

@Entity
@Table(name = "f_brojac", uniqueConstraints = {@UniqueConstraint(columnNames = {"pretplatnik", "tip"})})
public class FBrojac extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private String prefiks;
	private Integer brojPolja;
	private Integer stanje;
	private String sufiks;
	private ATipBrojaca tip;
	private Boolean reset;
	
	public FBrojac() {
		// TODO Auto-generated constructor stub
	}

	public DPretplatnik getPretplatnik() {
		return pretplatnik;
	}

	public void setPretplatnik(DPretplatnik pretplatnik) {
		this.pretplatnik = pretplatnik;
	}

	public String getPrefiks() {
		return prefiks;
	}

	public void setPrefiks(String prefiks) {
		this.prefiks = prefiks;
	}

	public Integer getBrojPolja() {
		return brojPolja;
	}

	public void setBrojPolja(Integer brojPolja) {
		this.brojPolja = brojPolja;
	}

	public Integer getStanje() {
		return stanje;
	}

	public void setStanje(Integer stanje) {
		this.stanje = stanje;
	}

	public String getSufiks() {
		return sufiks;
	}

	public void setSufiks(String sufiks) {
		this.sufiks = sufiks;
	}

	public ATipBrojaca getTip() {
		return tip;
	}

	public void setTip(ATipBrojaca tip) {
		this.tip = tip;
	}

	public Boolean getReset() {
		return reset;
	}

	public void setReset(Boolean reset) {
		this.reset = reset;
	}

}
