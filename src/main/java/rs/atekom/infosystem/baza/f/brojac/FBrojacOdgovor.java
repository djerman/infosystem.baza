package rs.atekom.infosystem.baza.f.brojac;

import java.io.Serializable;
import java.util.List;

public class FBrojacOdgovor implements Serializable{

	private static final long serialVersionUID = 1L;
	private FBrojac brojac;
	private List<FBrojac> lista;
	
	public FBrojacOdgovor() {
		// TODO Auto-generated constructor stub
	}

	public FBrojac getBrojac() {
		return brojac;
	}

	public void setBrojac(FBrojac brojac) {
		this.brojac = brojac;
	}

	public List<FBrojac> getLista() {
		return lista;
	}

	public void setLista(List<FBrojac> lista) {
		this.lista = lista;
	}

}
