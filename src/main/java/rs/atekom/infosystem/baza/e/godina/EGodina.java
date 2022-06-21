package rs.atekom.infosystem.baza.e.godina;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import rs.atekom.infosystem.baza.OsnovnaSema;
import rs.atekom.infosystem.baza.d.pretplatnik.DPretplatnik;

@Entity
@Table(name = "e_godina", uniqueConstraints = @UniqueConstraint(columnNames = {"pretplatnik", "godina"}))
public class EGodina extends OsnovnaSema{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private Integer godina;
	private Boolean aktivan;
	
	public EGodina() {
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

	public Integer getGodina() {
		return godina;
		}

	public void setGodina(Integer godina) {
		this.godina = godina;
		}

	public Boolean getAktivan() {
		return aktivan;
		}

	public void setAktivan(Boolean aktivan) {
		this.aktivan = aktivan;
		}
	
	}
