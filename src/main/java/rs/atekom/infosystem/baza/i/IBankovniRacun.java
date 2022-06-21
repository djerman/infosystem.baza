package rs.atekom.infosystem.baza.i;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.g.GPartner;

@Entity
@Table(name = "i_bankovniracun", uniqueConstraints = @UniqueConstraint(columnNames = {"pretplatnik", "banka", "brojRacuna"}))
public class IBankovniRacun extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private GPartner banka;
	private GPartner partner;
	private String brojRacuna;

	public IBankovniRacun() {
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
	@JoinColumn(name = "banka", nullable = false)
	public GPartner getBanka() {
		return banka;
	}

	public void setBanka(GPartner banka) {
		this.banka = banka;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "partner", nullable = true)
	public GPartner getPartner() {
		return partner;
		}

	public void setPartner(GPartner partner) {
		this.partner = partner;
		}

	@Column(name = "brojRacuna", nullable = false)
	public String getBrojRacuna() {
		return brojRacuna;
		}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
		}
	
	}
