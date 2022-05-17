package rs.atekom.infosystem.baza.f.preduzece;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;

@Entity
@Table(name = "f_preduzece")
public class FPreduzece extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	//@Size(min = 1, max = 32)
	private String naziv;
	//@Length(min = 1, max = 64)
	private String punNaziv;
	private String pib;
	private String mb;
	private Boolean pdv;
	//@Pattern(regexp = "(^[1-9]{1}[0-9]{9}$)|(^$)", message = "Invalid Phone Number format")
	private String tel;
	private String napomena;
	private String email;
	private Boolean banka;
	private Boolean ustanova;
	private String odgovornoLice;
	
	public FPreduzece() {
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

	/*owner side - child
	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "partner_id")
    @MapsId
	public GPartner getPartner() {
		return partner;
		}

	public void setPartner(GPartner partner) {
		this.partner = partner;
		}
*/
	public String getNaziv() {
		return naziv;
		}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
		}

	public String getPunNaziv() {
		return punNaziv;
		}

	public void setPunNaziv(String punNaziv) {
		this.punNaziv = punNaziv;
		}

	public String getPib() {
		return pib;
		}

	public void setPib(String pib) {
		this.pib = pib;
		}

	public String getMb() {
		return mb;
		}

	public void setMb(String mb) {
		this.mb = mb;
		}

	public Boolean getPdv() {
		return pdv;
		}

	public void setPdv(Boolean pdv) {
		this.pdv = pdv;
		}

	public String getTel() {
		return tel;
		}

	public void setTel(String tel) {
		this.tel = tel;
		}

	public String getNapomena() {
		return napomena;
		}

	public void setNapomena(String napomena) {
		this.napomena = napomena;
		}

	public String getEmail() {
		return email;
		}

	public void setEmail(String email) {
		this.email = email;
		}

	public Boolean getBanka() {
		return banka;
		}

	public void setBanka(Boolean banka) {
		this.banka = banka;
		}

	public Boolean getUstanova() {
		return ustanova;
		}

	public void setUstanova(Boolean ustanova) {
		this.ustanova = ustanova;
		}

	public String getOdgovornoLice() {
		return odgovornoLice;
		}

	public void setOdgovornoLice(String odgovornoLice) {
		this.odgovornoLice = odgovornoLice;
		}
	
	}
