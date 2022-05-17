package rs.atekom.infosystem.baza.e.grupaprava;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class EGrupaPravaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private List<EGrupaPrava> lista;
	private EGrupaPrava grupaPrava;
	
	public EGrupaPravaOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public EGrupaPravaOdgovor(List<EGrupaPrava> lista) {
		this.lista = lista;
		}
	
	public EGrupaPravaOdgovor(EGrupaPrava grupaPrava) {
		this.grupaPrava = grupaPrava;
		}

	public List<EGrupaPrava> getLista() {
		return lista;
		}

	public void setLista(List<EGrupaPrava> lista) {
		this.lista = lista;
		}

	public EGrupaPrava getGrupaPrava() {
		return grupaPrava;
		}

	public void setGrupaPrava(EGrupaPrava grupaPrava) {
		this.grupaPrava = grupaPrava;
		}
	
	}
