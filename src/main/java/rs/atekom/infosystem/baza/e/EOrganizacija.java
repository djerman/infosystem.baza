package rs.atekom.infosystem.baza.e;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.i.IAdresa;

@Entity
@Table(name = "e_organizacija")
public class EOrganizacija extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private String naziv;
	private String opis;
	private Boolean sediste;
	private IAdresa adresa;
	
	public EOrganizacija() {
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adresa", referencedColumnName = "id", nullable = true)
    public IAdresa getAdresa() {
        return adresa;
        }
    
	public void setAdresa(IAdresa adresa) {
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

	@Column(name = "sediste", nullable = false)
	public Boolean getSediste() {
		return sediste;
		}

	public void setSediste(Boolean sediste) {
		this.sediste = sediste;
		}
	
	}
