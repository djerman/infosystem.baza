package rs.atekom.infosystem.baza.d.kontoklasa;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class DKontoKlasaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private List<DKontoKlasa> lista;
	private DKontoKlasa klasa;
	
	public DKontoKlasaOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public DKontoKlasaOdgovor(List<DKontoKlasa> lista) {
		this.lista = lista;
		}

	public List<DKontoKlasa> getLista() {
		return lista;
		}

	public void setLista(List<DKontoKlasa> lista) {
		this.lista = lista;
		}

	public DKontoKlasa getKlasa() {
		return klasa;
		}

	public void setKlasa(DKontoKlasa klasa) {
		this.klasa = klasa;
		}
	
	}
