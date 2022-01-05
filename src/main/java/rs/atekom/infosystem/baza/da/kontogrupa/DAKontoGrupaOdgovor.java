package rs.atekom.infosystem.baza.da.kontogrupa;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class DAKontoGrupaOdgovor extends RestOdgovoriStrane {

	private static final long serialVersionUID = 1L;
	private List<DAKontoGrupa> lista;
	private DAKontoGrupa grupa;
	
	public DAKontoGrupaOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public DAKontoGrupaOdgovor(List<DAKontoGrupa> lista) {
		this.lista = lista;
		}

	public List<DAKontoGrupa> getLista() {
		return lista;
		}

	public void setLista(List<DAKontoGrupa> lista) {
		this.lista = lista;
		}

	public DAKontoGrupa getGrupa() {
		return grupa;
		}

	public void setGrupa(DAKontoGrupa grupa) {
		this.grupa = grupa;
		}
	
	}
