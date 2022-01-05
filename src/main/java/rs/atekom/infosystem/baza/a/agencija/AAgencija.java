package rs.atekom.infosystem.baza.a.agencija;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import rs.atekom.infosystem.baza.OsnovnaSema;

@Entity
@Table(name = "a_agencija", catalog = "atekom")
public class AAgencija extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private String naziv;
	private Boolean aktivan;
	private String kontaktOsoba;
	private String adresa;
	private String telefon;
	private String email;
	
	public AAgencija() {
		// TODO Auto-generated constructor stub
		}

	public String toString() {
		return this.naziv;
		}
	
	public String getNaziv() {
		return naziv;
		}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
		}

	public String getKontaktOsoba() {
		return kontaktOsoba;
		}

	public void setKontaktOsoba(String kontaktOsoba) {
		this.kontaktOsoba = kontaktOsoba;
		}

	public String getAdresa() {
		return adresa;
		}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
		}

	public String getTelefon() {
		return telefon;
		}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
		}

	public String getEmail() {
		return email;
		}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "aktivan", nullable = false, columnDefinition = "int default 1")
	public Boolean getAktivan() {
		return aktivan;
		}

	public void setAktivan(Boolean aktivan) {
		this.aktivan = aktivan;
		}
	
	}
