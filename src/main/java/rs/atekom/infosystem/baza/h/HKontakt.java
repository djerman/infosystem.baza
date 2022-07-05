package rs.atekom.infosystem.baza.h;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.a.agencija.AAgencija;
import rs.atekom.infosystem.baza.a.uloga.AUloga;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.e.grupaprava.EGrupaPrava;
import rs.atekom.infosystem.baza.g.GPartner;
import rs.atekom.infosystem.baza.i.IAdresa;

@Entity
@Table(name = "h_kontakt", uniqueConstraints = {@UniqueConstraint(columnNames = {"pretplatnik", "ime", "prezime"}), @UniqueConstraint(columnNames = {"pretplatnik", "korisnicko"}),
		@UniqueConstraint(columnNames = {"agencija", "ime", "prezime"}), @UniqueConstraint(columnNames = {"agencija", "korisnicko"})})
public class HKontakt extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private AAgencija agencija;
	private DPretplatnik pretplatnik;
	private GPartner partner;
	private String ime;
	private String prezime;
	private String korisnicko;
	private String lozinka;
	@Column(columnDefinition = "varchar(6) default ''")
	private String jezik;
	private Boolean zaposleni;
	//@OneToOne(mappedBy = "kontakt")
	private IAdresa adresa;
	private Boolean pristup;
	private EGrupaPrava grupaPrava;
	private Boolean aktivan;
	//private Boolean sistem;
	private AUloga uloga;
	
	public HKontakt() {
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agencija")
	public AAgencija getAgencija() {
		return agencija;
		}

	public void setAgencija(AAgencija agencija) {
		this.agencija = agencija;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "partner")
	public GPartner getPartner() {
		return partner;
		}

	public void setPartner(GPartner partner) {
		this.partner = partner;
		}

	public String getIme() {
		return ime;
		}

	public void setIme(String ime) {
		this.ime = ime;
		}

	public String getPrezime() {
		return prezime;
		}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
		}

	public String getKorisnicko() {
		return korisnicko;
		}

	public void setKorisnicko(String korisnicko) {
		this.korisnicko = korisnicko;
		}

	public String getLozinka() {
		return lozinka;
		}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
		}

	public String getJezik() {
		return jezik;
		}

	public void setJezik(String jezik) {
		this.jezik = jezik;
		}

	public Boolean getZaposleni() {
		return zaposleni;
		}

	public void setZaposleni(Boolean zaposleni) {
		this.zaposleni = zaposleni;
		}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adresa", referencedColumnName = "id", nullable = true)//@OneToOne(mappedBy = "organizacija")
	public IAdresa getAdresa() {
		return adresa;
		}

	public void setAdresa(IAdresa adresa) {
		this.adresa = adresa;
		}

	public Boolean getPristup() {
		return pristup;
		}

	public void setPristup(Boolean pristup) {
		this.pristup = pristup;
		}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupaPrava")
	public EGrupaPrava getGrupaPrava() {
		return grupaPrava;
		}

	public void setGrupaPrava(EGrupaPrava grupaPrava) {
		this.grupaPrava = grupaPrava;
		}

	/*
	@Column(name = "sistem", nullable = false)
	public Boolean getSistem() {
		return sistem;
		}

	public void setSistem(Boolean sistem) {
		this.sistem = sistem;
		}
	*/
	@Column(name = "aktivan", nullable = false)
	public Boolean getAktivan() {
		return aktivan;
		}

	public void setAktivan(Boolean aktivan) {
		this.aktivan = aktivan;
		}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "uloga")
	public AUloga getUloga() {
		return uloga;
		}

	public void setUloga(AUloga uloga) {
		this.uloga = uloga;
		}
	
	}
