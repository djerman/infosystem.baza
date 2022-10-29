package rs.atekom.infosystem.baza.f.objekat;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class FObjekatOdgovor extends RestOdgovoriStrane {

	private static final long serialVersionUID = 1L;
	private FObjekat objekat;
	private List<FObjekat> lista;
	
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

}
