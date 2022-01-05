package rs.atekom.infosystem.baza.db.kontoracun;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class DBKontoRacunOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private List<DBKontoRacun> lista;
	private DBKontoRacun racun;
	
	public DBKontoRacunOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public DBKontoRacunOdgovor(List<DBKontoRacun> lista) {
		this.lista = lista;
		}

	public List<DBKontoRacun> getLista() {
		return lista;
		}

	public void setLista(List<DBKontoRacun> lista) {
		this.lista = lista;
		}

	public DBKontoRacun getRacun() {
		return racun;
		}

	public void setRacun(DBKontoRacun racun) {
		this.racun = racun;
		}
	
	}
