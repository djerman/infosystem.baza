package rs.atekom.infosystem.baza.e.tipdokumenta;

import javax.persistence.Entity;
import javax.persistence.Table;
import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;

@Entity
@Table(name = "e_tipdokumenta")
public class ETipDokumenta extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private String sifra;
	private String naziv;
	private Integer dokument;
	private String nalog;
	private String sr;
	private String en;
	private String de;
	
	public ETipDokumenta() {
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

	public String getNaziv() {
		return naziv;
		}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
		}

	public Integer getDokument() {
		return dokument;
		}

	public void setDokument(Integer dokument) {
		this.dokument = dokument;
		}

	public String getNalog() {
		return nalog;
		}

	public void setNalog(String nalog) {
		this.nalog = nalog;
		}

	public String getSr() {
		return sr;
		}

	public void setSr(String sr) {
		this.sr = sr;
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
	
	}
