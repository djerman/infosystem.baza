package rs.atekom.infosystem.baza.f.objekat;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;
import rs.atekom.infosystem.baza.c.CMesto;
import rs.atekom.infosystem.baza.e.konto.EKonto;
import rs.atekom.infosystem.baza.e.organizacija.EOrganizacija;

public class FObjekatOdgovor extends RestOdgovoriStrane {

	private static final long serialVersionUID = 1L;
	private FObjekat objekat;
	private List<FObjekat> lista;
	private List<EOrganizacija> organizacije;
	private List<EKonto> konta;
	private List<CMesto> mesta;
	
	public FObjekatOdgovor() {
		// TODO Auto-generated constructor stub
	}

	public FObjekat getObjekat() {
		return objekat;
	}

	public void setObjekat(FObjekat objekat) {
		this.objekat = objekat;
	}

	public List<FObjekat> getLista() {
		return lista;
	}

	public void setLista(List<FObjekat> lista) {
		this.lista = lista;
	}

	public List<EOrganizacija> getOrganizacije() {
		return organizacije;
	}

	public void setOrganizacije(List<EOrganizacija> organizacije) {
		this.organizacije = organizacije;
	}

	public List<EKonto> getKonta() {
		return konta;
	}

	public void setKonta(List<EKonto> konta) {
		this.konta = konta;
	}

	public List<CMesto> getMesta() {
		return mesta;
	}

	public void setMesta(List<CMesto> mesta) {
		this.mesta = mesta;
	}

}
