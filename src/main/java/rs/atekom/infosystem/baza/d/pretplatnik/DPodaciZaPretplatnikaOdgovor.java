package rs.atekom.infosystem.baza.d.pretplatnik;

import java.io.Serializable;
import java.util.List;
import rs.atekom.infosystem.baza.a.agencija.AAgencija;
import rs.atekom.infosystem.baza.c.CMesto;

public class DPodaciZaPretplatnikaOdgovor implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<AAgencija> agencije;
	private List<CMesto> mesta;
	
	public DPodaciZaPretplatnikaOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public List<AAgencija> getAgencije() {
		return agencije;
		}

	public void setAgencije(List<AAgencija> agencije) {
		this.agencije = agencije;
		}

	public List<CMesto> getMesta() {
		return mesta;
		}

	public void setMesta(List<CMesto> mesta) {
		this.mesta = mesta;
		}
	
	}
