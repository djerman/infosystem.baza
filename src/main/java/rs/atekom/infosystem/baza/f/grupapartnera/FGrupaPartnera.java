package rs.atekom.infosystem.baza.f.grupapartnera;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.e.konto.EKonto;

@Entity
@Table(name = "f_grupapartnera", uniqueConstraints = @UniqueConstraint(columnNames = {"pretplatnik", "sifra"}))
public class FGrupaPartnera extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private String sifra;
	private String naziv;
	private String opis;
	private EKonto prihod;
	private EKonto rashod;

	public FGrupaPartnera() {
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

	@Column(name = "sifra", nullable = false)
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
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "prihod")
	public EKonto getPrihod() {
		return prihod;
	}

	public void setPrihod(EKonto prihod) {
		this.prihod = prihod;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rashod")
	public EKonto getRashod() {
		return rashod;
	}

	public void setRashod(EKonto rashod) {
		this.rashod = rashod;
	}
	
	}
