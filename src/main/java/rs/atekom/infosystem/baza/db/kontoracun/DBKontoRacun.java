package rs.atekom.infosystem.baza.db.kontoracun;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.da.kontogrupa.DAKontoGrupa;

@Entity
@Table(name = "db_kontoracun", uniqueConstraints = @UniqueConstraint(columnNames = {"grupa", "sifra", "naziv"}))
public class DBKontoRacun extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DAKontoGrupa grupa;
	@Size(min = 3, max = 3)
	@Column(nullable = false, unique = true)
	private String sifra;
	@Column(nullable = false, unique = true)
	private String naziv;
	private String sr;
	private String en;
	private String de;
	
	public DBKontoRacun() {
		// TODO Auto-generated constructor stub
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupa")
	public DAKontoGrupa getGrupa() {
		return grupa;
		}

	public void setGrupa(DAKontoGrupa grupa) {
		this.grupa = grupa;
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
