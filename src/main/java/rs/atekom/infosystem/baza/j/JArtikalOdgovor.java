package rs.atekom.infosystem.baza.j;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class JArtikalOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private JArtikal artikal;
	private List<JArtikal> artikli;
	
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
	
	}
