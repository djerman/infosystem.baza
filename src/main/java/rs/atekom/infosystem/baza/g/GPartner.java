package rs.atekom.infosystem.baza.g;

import java.math.BigDecimal;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;
import rs.atekom.infosystem.baza.e.konto.EKonto;
import rs.atekom.infosystem.baza.f.grupapartnera.FGrupaPartnera;
import rs.atekom.infosystem.baza.f.preduzece.FPreduzece;

@Entity
@Table(name = "g_partner", uniqueConstraints = @UniqueConstraint(columnNames = {"pretplatnik", "sifra"}))
public class GPartner extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private FGrupaPartnera grupaPartnera;
	private String sifra;
	private Boolean kupac;
	private EKonto kupacKonto;
	private Boolean dobavljac;
	private EKonto dobavljacKonto;
	private BigDecimal kupacRabat;
	private BigDecimal dobavljacRabat;
	private FPreduzece preduzece;
	private String jezik;
	
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kupacKonto", nullable = true)
	public EKonto getKupacKonto() {
		return kupacKonto;
		}

	public void setKupacKonto(EKonto kupacKonto) {
		this.kupacKonto = kupacKonto;
		}

	public Boolean getDobavljac() {
		return dobavljac;
		}

	public void setDobavljac(Boolean dobavljac) {
		this.dobavljac = dobavljac;
		}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dobavljacKonto", nullable = true)
	public EKonto getDobavljacKonto() {
		return dobavljacKonto;
		}

	public void setDobavljacKonto(EKonto dobavljacKonto) {
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

	public String getJezik() {
		return jezik;
		}

	public void setJezik(String jezik) {
		this.jezik = jezik;
		}
	
	}
