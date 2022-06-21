package rs.atekom.infosystem.baza.j;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;
import rs.atekom.infosystem.baza.a.jedinicamere.AJedinicaMere;
import rs.atekom.infosystem.baza.a.poreskatarifa.APoreskaTarifa;
import rs.atekom.infosystem.baza.i.grupaartikala.IGrupaArtikala;

public class JArtikalOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private JArtikal artikal;
	private List<JArtikal> artikli;
	private List<AJedinicaMere> jedinice;
	private List<APoreskaTarifa> tarife;
	private List<IGrupaArtikala> grupe;
	
	public JArtikalOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public JArtikal getArtikal() {
		return artikal;
		}

	public void setArtikal(JArtikal artikal) {
		this.artikal = artikal;
		}

	public List<JArtikal> getArtikli() {
		return artikli;
		}

	public void setArtikli(List<JArtikal> artikli) {
		this.artikli = artikli;
		}

	public List<AJedinicaMere> getJedinice() {
		return jedinice;
		}

	public void setJedinice(List<AJedinicaMere> jedinice) {
		this.jedinice = jedinice;
		}

	public List<APoreskaTarifa> getTarife() {
		return tarife;
		}

	public void setTarife(List<APoreskaTarifa> tarife) {
		this.tarife = tarife;
		}

	public List<IGrupaArtikala> getGrupe() {
		return grupe;
		}

	public void setGrupe(List<IGrupaArtikala> grupe) {
		this.grupe = grupe;
		}
	
	}
