package rs.atekom.infosystem.baza.i.grupaartikala;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;
import rs.atekom.infosystem.baza.e.konto.EKonto;

public class IGrupaArtikalaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private IGrupaArtikala grupa;
	private List<IGrupaArtikala> lista;
	private List<EKonto> konta;
	
	public IGrupaArtikalaOdgovor(IGrupaArtikala grupa) {
		this.grupa = grupa;
		}
	
	public IGrupaArtikalaOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public IGrupaArtikalaOdgovor(List<IGrupaArtikala> lista) {
		this.lista = lista;
		}

	public IGrupaArtikala getGrupa() {
		return grupa;
		}

	public void setGrupa(IGrupaArtikala grupa) {
		this.grupa = grupa;
		}

	public List<IGrupaArtikala> getLista() {
		return lista;
		}

	public void setLista(List<IGrupaArtikala> lista) {
		this.lista = lista;
		}

	public List<EKonto> getKonta() {
		return konta;
	}

	public void setKonta(List<EKonto> konta) {
		this.konta = konta;
	}
	
	}
