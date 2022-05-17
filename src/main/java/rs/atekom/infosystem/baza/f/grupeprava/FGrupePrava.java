package rs.atekom.infosystem.baza.f.grupeprava;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import rs.atekom.infosystem.baza.a.prava.APrava;
import rs.atekom.infosystem.baza.e.grupaprava.EGrupaPrava;

@Entity
@Table(name = "f_grupeprava")
public class FGrupePrava implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private EGrupaPrava grupaPrava;
	private APrava pravo;
	
	public FGrupePrava() {
		// TODO Auto-generated constructor stub
		}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
		}

	public void setId(Long id) {
		this.id = id;
		}

	public EGrupaPrava getGrupaPrava() {
		return grupaPrava;
		}

	public void setGrupaPrava(EGrupaPrava grupaPrava) {
		this.grupaPrava = grupaPrava;
		}

	public APrava getPravo() {
		return pravo;
		}

	public void setPravo(APrava pravo) {
		this.pravo = pravo;
		}
	
	}
