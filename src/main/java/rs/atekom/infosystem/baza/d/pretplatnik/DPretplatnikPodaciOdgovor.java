package rs.atekom.infosystem.baza.d.pretplatnik;

import java.io.Serializable;
import rs.atekom.infosystem.baza.e.EOrganizacija;

public class DPretplatnikPodaciOdgovor implements Serializable{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private EOrganizacija organizacija;
	
	public DPretplatnikPodaciOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public DPretplatnik getPretplatnik() {
		return pretplatnik;
		}

	public void setPretplatnik(DPretplatnik pretplatnik) {
		this.pretplatnik = pretplatnik;
		}

	public EOrganizacija getOrganizacija() {
		return organizacija;
		}

	public void setOrganizacija(EOrganizacija organizacija) {
		this.organizacija = organizacija;
		}
	
	}
