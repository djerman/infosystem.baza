package rs.atekom.infosystem.baza.j;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.a.jedinicamere.AJedinicaMere;
import rs.atekom.infosystem.baza.a.poreskatarifa.APoreskaTarifa;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.e.konto.EKonto;
import rs.atekom.infosystem.baza.i.grupaartikala.IGrupaArtikala;

@Entity
@Table(name = "j_artikal", uniqueConstraints = {
		@UniqueConstraint(name = "UniquePretplatnikAndNaziv", columnNames = {"pretplatnik", "naziv"}), 
		@UniqueConstraint(name = "UniquePretplatnikAndSifra", columnNames = {"pretplatnik", "sifra"})})
public class JArtikal extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private Integer tip;
	private IGrupaArtikala grupa;
	private String sifra;
	private String naziv;
	private String barcode;
	private AJedinicaMere jm;
	private APoreskaTarifa poreskaTarifa;
	private String en;
	private String de;
	private Long proizvodnja;
	private Date rokTrajanja;
	private BigDecimal infCena;
	private BigDecimal rastur;
	private String opis;
	private String opis_en;
	private String opis_de;
	private EKonto prihod;
	private EKonto rashod;
	
	public JArtikal() {
		// TODO Auto-generated constructor stub
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pretplatnik", nullable = false)
	public DPretplatnik getPretplatnik() {
		return pretplatnik;
		}

	public void setPretplatnik(DPretplatnik pretplatnik) {
		this.pretplatnik = pretplatnik;
		}

	@Column(nullable = false)
	public Integer getTip() {
		return tip;
		}

	public void setTip(Integer tip) {
		this.tip = tip;
		}

	@Column(nullable = false)
	@Size(max = 20)
	public String getSifra() {
		return sifra;
		}

	public void setSifra(String sifra) {
		this.sifra = sifra;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupa", nullable = true)
	public IGrupaArtikala getGrupa() {
		return grupa;
		}

	public void setGrupa(IGrupaArtikala grupa) {
		this.grupa = grupa;
		}

	@NotNull
	@Size(min = 3, max = 45, message = "prekratko ili predugo")
	public String getNaziv() {
		return naziv;
		}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
		}

	@Size(max = 50)
	public String getEn() {
		return en;
		}

	public void setEn(String en) {
		this.en = en;
		}

	@Size(max = 50)
	public String getDe() {
		return de;
		}

	public void setDe(String de) {
		this.de = de;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jm", nullable = false)
	public AJedinicaMere getJm() {
		return jm;
		}

	public void setJm(AJedinicaMere jm) {
		this.jm = jm;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "poreskaTarifa", nullable = false)
	public APoreskaTarifa getPoreskaTarifa() {
		return poreskaTarifa;
		}

	public void setPoreskaTarifa(APoreskaTarifa poreskaTarifa) {
		this.poreskaTarifa = poreskaTarifa;
		}

	@Size(max = 256)
	public String getOpis() {
		return opis;
		}

	public void setOpis(String opis) {
		this.opis = opis;
		}

	@Size(max = 20)
	public String getBarcode() {
		return barcode;
		}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
		}

	@Size(max = 256)
	public String getOpis_en() {
		return opis_en;
		}

	public void setOpis_en(String opis_en) {
		this.opis_en = opis_en;
		}

	@Size(max = 256)
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prihod", nullable = true)
	public EKonto getPrihod() {
		return prihod;
	}

	public void setPrihod(EKonto prihod) {
		this.prihod = prihod;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rashod", nullable = true)
	public EKonto getRashod() {
		return rashod;
	}

	public void setRashod(EKonto rashod) {
		this.rashod = rashod;
	}
	
	
	}
