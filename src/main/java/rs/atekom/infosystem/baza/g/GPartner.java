package rs.atekom.infosystem.baza.g;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.f.FGrupaPartnera;
import rs.atekom.infosystem.baza.f.FPreduzece;

@Entity
@Table(name = "g_partner")
public class GPartner extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private FGrupaPartnera grupaPartnera;
	private String sifra;
	private Boolean kupac;
	private Long kupacKonto;
	private Boolean dobavljac;
	private Long dobavljacKonto;
	private BigDecimal kupacRabat;
	private BigDecimal dobavljacRabat;
	private FPreduzece preduzece;
	
	public GPartner() {
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
	@JoinColumn(name = "grupaPartnera")
	public FGrupaPartnera getGrupaPartnera() {
		return grupaPartnera;
		}

	public void setGrupaPartnera(FGrupaPartnera grupaPartnera) {
		this.grupaPartnera = grupaPartnera;
		}

	public String getSifra() {
		return sifra;
		}

	public void setSifra(String sifra) {
		this.sifra = sifra;
		}

	public Boolean getKupac() {
		return kupac;
		}

	public void setKupac(Boolean kupac) {
		this.kupac = kupac;
		}

	public Long getKupacKonto() {
		return kupacKonto;
		}

	public void setKupacKonto(Long kupacKonto) {
		this.kupacKonto = kupacKonto;
		}

	public Boolean getDobavljac() {
		return dobavljac;
		}

	public void setDobavljac(Boolean dobavljac) {
		this.dobavljac = dobavljac;
		}

	public Long getDobavljacKonto() {
		return dobavljacKonto;
		}

	public void setDobavljacKonto(Long dobavljacKonto) {
		this.dobavljacKonto = dobavljacKonto;
		}

	//inverse side - "look at the other side for the mapping" using the mappedBy attribute
    @OneToOne(cascade = CascadeType.ALL, optional = true)
    @JoinColumn(name = "preduzece", referencedColumnName = "id")
	public FPreduzece getPreduzece() {
		return preduzece;
		}

	public void setPreduzece(FPreduzece preduzece) {
		this.preduzece = preduzece;
		}

	public BigDecimal getKupacRabat() {
		return kupacRabat;
		}

	public void setKupacRabat(BigDecimal kupacRabat) {
		this.kupacRabat = kupacRabat;
		}

	public BigDecimal getDobavljacRabat() {
		return dobavljacRabat;
		}

	public void setDobavljacRabat(BigDecimal dobavljacRabat) {
		this.dobavljacRabat = dobavljacRabat;
		}
	
	}
