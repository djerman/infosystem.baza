package rs.atekom.infosystem.baza.j;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.a.jedinicamere.AJedinicaMere;
import rs.atekom.infosystem.baza.a.poreskatarifa.APoreskaTarifa;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.i.grupaartikala.IGrupaArtikala;

@Entity
@Table(name = "j_artikal")
public class JArtikal extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private String sifra;
	private IGrupaArtikala grupa;
	private String naziv;
	private String en;
	private String de;
	private AJedinicaMere jm;
	private APoreskaTarifa poreskaTarifa;
	private String opis;
	private String opis_sr;
	private String opis_en;
	private String opis_de;
	private Long proizvodnja;
	private Date rokTrajanja;
	private BigDecimal infCena;
	private BigDecimal rastur;
	
	public JArtikal() {
		// TODO Auto-generated constructor stub
		}

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

	public IGrupaArtikala getGrupa() {
		return grupa;
		}

	public void setGrupa(IGrupaArtikala grupa) {
		this.grupa = grupa;
		}

	public String getNaziv() {
		return naziv;
		}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
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

	public AJedinicaMere getJm() {
		return jm;
		}

	public void setJm(AJedinicaMere jm) {
		this.jm = jm;
		}

	public APoreskaTarifa getPoreskaTarifa() {
		return poreskaTarifa;
		}

	public void setPoreskaTarifa(APoreskaTarifa poreskaTarifa) {
		this.poreskaTarifa = poreskaTarifa;
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

	public Long getProizvodnja() {
		return proizvodnja;
		}

	public void setProizvodnja(Long proizvodnja) {
		this.proizvodnja = proizvodnja;
		}

	public Date getRokTrajanja() {
		return rokTrajanja;
		}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
		}

	public BigDecimal getInfCena() {
		return infCena;
		}

	public void setInfCena(BigDecimal infCena) {
		this.infCena = infCena;
		}

	public BigDecimal getRastur() {
		return rastur;
		}

	public void setRastur(BigDecimal rastur) {
		this.rastur = rastur;
		}
	
	}
