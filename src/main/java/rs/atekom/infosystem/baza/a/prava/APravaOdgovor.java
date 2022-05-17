package rs.atekom.infosystem.baza.a.prava;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class APravaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private APrava pravo;
	private List<APrava> lista;
	
	public APravaOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public APravaOdgovor(APrava pravo) {
		this.pravo = pravo;
		}
	
	public APravaOdgovor(List<APrava> lista) {
		this.lista = lista;
		}

	public APrava getPravo() {
		return pravo;
		}

	public void setPravo(APrava pravo) {
		this.pravo = pravo;
		}

	public List<APrava> getLista() {
		return lista;
		}

	public void setLista(List<APrava> lista) {
		this.lista = lista;
		}
	
	}
