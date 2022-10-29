package rs.atekom.infosystem.baza.f.objekat;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.e.konto.EKonto;
import rs.atekom.infosystem.baza.e.organizacija.EOrganizacija;
import rs.atekom.infosystem.baza.e.tipdokumenta.ETipDokumenta;

@Entity
@Table(name = "f_objekat")
public class FObjekat extends OsnovnaSema{
	
	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private EOrganizacija organizacija;
	private String naziv;
	private EKonto konto;
	private ETipDokumenta dokument;
	private String opis;

	public FObjekat() {
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
	@JoinColumn(name = "organizacija", nullable = false)
	public EOrganizacija getOrganizacija() {
		return organizacija;
	}

	public void setOrganizacija(EOrganizacija organizacija) {
		this.organizacija = organizacija;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "konto", nullable = false)
	public EKonto getKonto() {
		return konto;
	}

	public void setKonto(EKonto konto) {
		this.konto = konto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dokument", nullable = true)
	public ETipDokumenta getDokument() {
		return dokument;
	}

	public void setDokument(ETipDokumenta dokument) {
		this.dokument = dokument;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}
	
}
