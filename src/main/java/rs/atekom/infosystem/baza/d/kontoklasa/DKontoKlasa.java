package rs.atekom.infosystem.baza.d.kontoklasa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import rs.atekom.infosystem.baza.OsnovnaSema;

@Entity
@Table(name = "d_kontoklasa", uniqueConstraints = @UniqueConstraint(columnNames = {"sifra", "naziv"}))
public class DKontoKlasa extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	@Size(min = 1, max = 1)
	@Column(nullable = false, unique = true)
	private String sifra;
	@Column(nullable = false, unique = true)
	private String naziv;
	private String sr;
	private String en;
	private String de;
	
	public DKontoKlasa() {
		// TODO Auto-generated constructor stub
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
		if(sr == null) {
			this.sr = naziv;
			}else {
				this.sr = sr;
				}
		}

	public String getEn() {
		return en;
		}

	public void setEn(String en) {
		if(en == null) {
			this.en = naziv;
			}else {
				this.en = en;
				}
		}

	public String getDe() {
		return de;
		}

	public void setDe(String de) {
		if(de == null) {
			this.de = naziv;
			}else {
				this.de = de;
				}
		}
	
	}
