package rs.atekom.infosystem.baza.d.pretplatnik;

import java.io.Serializable;
import rs.atekom.infosystem.baza.e.organizacija.EOrganizacijaPodaci;

public class DPretplatnikPodaci implements Serializable{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private EOrganizacijaPodaci organizacijaPodaci;
	
	public DPretplatnikPodaci() {
		// TODO Auto-generated constructor stub
		}

	public DPretplatnik getPretplatnik() {
		return pretplatnik;
		}

	public void setPretplatnik(DPretplatnik pretplatnik) {
		this.pretplatnik = pretplatnik;
		}

	public EOrganizacijaPodaci getOrganizacijaPodaci() {
		return organizacijaPodaci;
	}

	public void setOrganizacijaPodaci(EOrganizacijaPodaci organizacija) {
		this.organizacijaPodaci = organizacija;
	}
	
	}
