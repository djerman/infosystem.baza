package rs.atekom.infosystem.baza.a.poreskatarifa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;

@Entity
@Table(name = "a_poreskatarifa", uniqueConstraints = @UniqueConstraint(columnNames = {"sifra", "naziv"}))
public class APoreskaTarifa extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private Integer sifra;
	private String naziv;
	private String sr;
	private String en;
	private String de;
	private double stopa;
	private Date datumOd;
	private Date datumDo;
	
	public APoreskaTarifa() {
		// TODO Auto-generated constructor stub
		}
	
	@Column(name = "sifra", unique = true, nullable = false)
	public Integer getSifra() {
		return sifra;
		}

	public void setSifra(Integer sifra) {
		this.sifra = sifra;
		}
	
	@Column(name = "naziv", unique = true, nullable = false)
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

	@Column(name = "stopa", nullable = false, precision = 22, scale = 0)
	public double getStopa() {
		return this.stopa;
		}

	public void setStopa(double stopa) {
		this.stopa = stopa;
		}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datumOd", nullable = false, length = 10)
	public Date getDatumOd() {
		return this.datumOd;
		}

	public void setDatumOd(Date datumOd) {
		this.datumOd = datumOd;
		}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "datumDo", nullable = false, length = 10)
	public Date getDatumDo() {
		return this.datumDo;
		}

	public void setDatumDo(Date datumDo) {
		this.datumDo = datumDo;
		}
	
	}
