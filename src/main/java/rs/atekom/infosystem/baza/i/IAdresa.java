package rs.atekom.infosystem.baza.i;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.c.CMesto;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.e.EOrganizacija;
import rs.atekom.infosystem.baza.g.GPartner;
import rs.atekom.infosystem.baza.h.HKontakt;

@Entity
@Table(name = "i_adresa", catalog = "atekom")
public class IAdresa extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	
	@OneToOne(mappedBy = "adresa")
	private EOrganizacija organizacija;
	
	private GPartner partner;
	
	@OneToOne(mappedBy = "adresa")
	private HKontakt kontakt;
	
	private String naziv;
	private CMesto mesto;
	private String adresa;
	private String opis;
	private Boolean sediste;
	
	public IAdresa() {
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

	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "organizacija", referencedColumnName = "id", nullable = true)
	/*
	public EOrganizacija getOrganizacija() {
		return organizacija;
		}

	public void setOrganizacija(EOrganizacija organizacija) {
		this.organizacija = organizacija;
		}
*/
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "partner", nullable = true)
	public GPartner getPartner() {
		return partner;
		}

	public void setPartner(GPartner partner) {
		this.partner = partner;
		}

	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "kontakt", referencedColumnName = "id", nullable = true)
	/*
	public HKontakt getKontakt() {
		return kontakt;
		}

	public void setKontakt(HKontakt kontakt) {
		this.kontakt = kontakt;
		}
*/
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mesto", nullable = true)
	public CMesto getMesto() {
		return mesto;
		}

	public void setMesto(CMesto mesto) {
		this.mesto = mesto;
		}

	@Column(name = "adresa", nullable = false)
	public String getAdresa() {
		return adresa;
		}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
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

	public Boolean getSediste() {
		return sediste;
		}

	public void setSediste(Boolean sediste) {
		this.sediste = sediste;
		}
	
	/*
	public EOrganizacija getOrganizacija() {
		return organizacija;
		}

	public void setOrganizacija(EOrganizacija organizacija) {
		this.organizacija = organizacija;
		}
	
	public HKontakt getKontakt() {
		return kontakt;
		}

	public void setKontakt(HKontakt kontakt) {
		this.kontakt = kontakt;
		}
	*/
	}
