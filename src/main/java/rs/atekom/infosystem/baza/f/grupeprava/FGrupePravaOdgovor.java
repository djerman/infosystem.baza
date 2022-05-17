package rs.atekom.infosystem.baza.f.grupeprava;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class FGrupePravaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private List<FGrupePrava> lista;
	private FGrupePrava grupePrava;
	
	public FGrupePravaOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public FGrupePravaOdgovor(List<FGrupePrava> lista) {
		this.lista = lista;
		}
	
	public FGrupePravaOdgovor(FGrupePrava grupePrava) {
		this.grupePrava = grupePrava;
		}

	public List<FGrupePrava> getLista() {
		return lista;
		}

	public void setLista(List<FGrupePrava> lista) {
		this.lista = lista;
		}

	public FGrupePrava getGrupePrava() {
		return grupePrava;
		}

	public void setGrupePrava(FGrupePrava grupePrava) {
		this.grupePrava = grupePrava;
		}
	
	}
