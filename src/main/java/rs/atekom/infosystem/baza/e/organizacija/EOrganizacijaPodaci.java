package rs.atekom.infosystem.baza.e.organizacija;

import java.io.Serializable;

import rs.atekom.infosystem.baza.i.IAdresa;

public class EOrganizacijaPodaci implements Serializable{

	private static final long serialVersionUID = 1L;
	private EOrganizacija organizacija;
	private IAdresa sediste;

	public EOrganizacijaPodaci() {
		// TODO Auto-generated constructor stub
	}

	public EOrganizacija getOrganizacija() {
		return organizacija;
	}

	public void setOrganizacija(EOrganizacija organizacija) {
		this.organizacija = organizacija;
	}

	public IAdresa getSediste() {
		return sediste;
	}

	public void setSediste(IAdresa sediste) {
		this.sediste = sediste;
	}
	
}
