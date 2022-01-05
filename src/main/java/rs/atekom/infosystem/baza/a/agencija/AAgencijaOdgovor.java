package rs.atekom.infosystem.baza.a.agencija;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class AAgencijaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private AAgencija agencija;
	private List<AAgencija> lista;
	
	public AAgencijaOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public AAgencija getAgencija() {
		return agencija;
		}

	public void setAgencija(AAgencija agencija) {
		this.agencija = agencija;
		}

	public List<AAgencija> getLista() {
		return lista;
		}

	public void setLista(List<AAgencija> lista) {
		this.lista = lista;
		}
	
	}
