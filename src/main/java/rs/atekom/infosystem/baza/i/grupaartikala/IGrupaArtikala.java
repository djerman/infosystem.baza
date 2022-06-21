package rs.atekom.infosystem.baza.i.grupaartikala;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;

@Entity
@Table(name = "i_grupaartikala", uniqueConstraints = {@UniqueConstraint(columnNames = {"pretplatnik", "sifra"}), @UniqueConstraint(columnNames = {"pretplatnik", "naziv"})})
public class IGrupaArtikala extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private String sifra;
	private String naziv;
	private String opis;
	
	public IGrupaArtikala() {
		// TODO Auto-generated constructor stub
		}

	public String toString() {
		return this.naziv;
		}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pretplatnik", nullable = false)
	public DPretplatnik getPretplatnik() {
		return pretplatnik;
		}

	public void setPretplatnik(DPretplatnik pretplatnik) {
		this.pretplatnik = pretplatnik;
		}

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

	public String getOpis() {
		return opis;
		}

	public void setOpis(String opis) {
		this.opis = opis;
		}
	
	}
