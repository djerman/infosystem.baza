package rs.atekom.infosystem.baza.a.jedinicamere;

import java.io.Serializable;
import java.util.List;

public class AJedinicaMereOdgovor implements Serializable{

	private static final long serialVersionUID = 1L;
	private AJedinicaMere jedinica;
	private List<AJedinicaMere> lista;
	
	public AJedinicaMereOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public AJedinicaMereOdgovor(List<AJedinicaMere> lista) {
		this.lista = lista;
		}

	public AJedinicaMere getJedinica() {
		return jedinica;
		}

	public void setJedinica(AJedinicaMere jedinica) {
		this.jedinica = jedinica;
		}

	public List<AJedinicaMere> getLista() {
		return lista;
		}

	public void setLista(List<AJedinicaMere> lista) {
		this.lista = lista;
		}
	
	}
