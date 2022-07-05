package rs.atekom.infosystem.baza.d.pretplatnik;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.a.agencija.AAgencija;

@Entity
@Table(name = "d_pretplatnik", uniqueConstraints = @UniqueConstraint(columnNames = {"naziv", "pib"}))
public class DPretplatnik extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private AAgencija agencija;
	private String naziv;
	private String punNaziv;
	//private String adresa;
	private String pib;
	private String mb;
	private String telefon;
	private String fax;
	private String sifraDelatnosti;
	private String email;
	private String odgovornoLice;
	private Boolean obveznikPDV;
	private Integer poreskiPeriod;
	private Integer vrstaVlasnistva;
	private Integer vrstaPosla;
	private Integer velicinaObveznika;
	private Integer vrstaIzvestaja;
	private Integer racunovodstvenaRegulativa;
	private String nadlezniSud;
	private String poreskaUprava;
	private String napomena;
	private String logo;
	private byte[] slika;
	private String slikaIme;
	private Boolean aktivan;

	public DPretplatnik() {
		// TODO Auto-generated constructor stub
		}

	public String toString() {
		return this.naziv;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agencija")
	public AAgencija getAgencija() {
		return agencija;
		}

	public void setAgencija(AAgencija agencija) {
		this.agencija = agencija;
		}

	@Column(name = "naziv", nullable = false)
	public String getNaziv() {
		return naziv;
		}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
		}

	@Column(name = "punNaziv", nullable = false)
	public String getPunNaziv() {
		return punNaziv;
		}

	public void setPunNaziv(String punNaziv) {
		this.punNaziv = punNaziv;
		}

	/*
	@Column(name = "adresa", nullable = false)
	public String getAdresa() {
		return adresa;
		}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
		}*/

	@Column(name = "pib", nullable = false)
	public String getPib() {
		return pib;
		}

	public void setPib(String pib) {
		this.pib = pib;
		}

	@Column(name = "mb", nullable = false)
	public String getMb() {
		return mb;
		}

	public void setMb(String mb) {
		this.mb = mb;
		}

	public String getTelefon() {
		return telefon;
		}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
		}

	public String getFax() {
		return fax;
		}

	public void setFax(String fax) {
		this.fax = fax;
		}

	public String getSifraDelatnosti() {
		return sifraDelatnosti;
		}

	public void setSifraDelatnosti(String sifraDelatnosti) {
		this.sifraDelatnosti = sifraDelatnosti;
		}

	public String getEmail() {
		return email;
		}

	public void setEmail(String email) {
		this.email = email;
		}

	public String getNadlezniSud() {
		return nadlezniSud;
		}

	public void setNadlezniSud(String nadlezniSud) {
		this.nadlezniSud = nadlezniSud;
		}

	public String getPoreskaUprava() {
		return poreskaUprava;
		}

	public void setPoreskaUprava(String poreskaUprava) {
		this.poreskaUprava = poreskaUprava;
		}

	public String getOdgovornoLice() {
		return odgovornoLice;
		}

	public void setOdgovornoLice(String odgovornoLice) {
		this.odgovornoLice = odgovornoLice;
		}

	public Boolean getObveznikPDV() {
		return obveznikPDV;
		}

	public void setObveznikPDV(Boolean obveznikPDV) {
		this.obveznikPDV = obveznikPDV;
		}

	public Integer getPoreskiPeriod() {
		return poreskiPeriod;
		}

	public void setPoreskiPeriod(Integer poreskiPeriod) {
		this.poreskiPeriod = poreskiPeriod;
		}

	public Integer getVrstaVlasnistva() {
		return vrstaVlasnistva;
		}

	public void setVrstaVlasnistva(Integer vrstaVlasnistva) {
		this.vrstaVlasnistva = vrstaVlasnistva;
		}

	public Integer getVrstaPosla() {
		return vrstaPosla;
		}

	public void setVrstaPosla(Integer vrstaPosla) {
		this.vrstaPosla = vrstaPosla;
		}

	public Integer getVelicinaObveznika() {
		return velicinaObveznika;
		}

	public void setVelicinaObveznika(Integer velicinaObveznika) {
		this.velicinaObveznika = velicinaObveznika;
		}

	public Integer getVrstaIzvestaja() {
		return vrstaIzvestaja;
		}

	public void setVrstaIzvestaja(Integer vrstaIzvestaja) {
		this.vrstaIzvestaja = vrstaIzvestaja;
		}

	public Integer getRacunovodstvenaRegulativa() {
		return racunovodstvenaRegulativa;
		}

	public void setRacunovodstvenaRegulativa(Integer racunovodstvenaRegulativa) {
		this.racunovodstvenaRegulativa = racunovodstvenaRegulativa;
		}

	public String getNapomena() {
		return napomena;
		}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
		}

	public Boolean getAktivan() {
		return aktivan;
		}

	public void setAktivan(Boolean aktivan) {
		this.aktivan = aktivan;
		}

	public String getLogo() {
		return logo;
		}

	public void setLogo(String logo) {
		this.logo = logo;
		}

	@Transient
	public byte[] getSlika() {
		return slika;
		}

	public void setSlika(byte[] slika) {
		this.slika = slika;
		}

	@Transient
	public String getSlikaIme() {
		return slikaIme;
		}

	public void setSlikaIme(String slikaIme) {
		this.slikaIme = slikaIme;
		}
	
	}
