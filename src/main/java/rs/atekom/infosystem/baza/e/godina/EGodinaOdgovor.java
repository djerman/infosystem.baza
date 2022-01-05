package rs.atekom.infosystem.baza.e.godina;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class EGodinaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private EGodina godina;
	private List<EGodina> lista;
	
	public EGodinaOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public EGodina getGodina() {
		return godina;
		}

	public void setGodina(EGodina godina) {
		this.godina = godina;
		}

	public List<EGodina> getLista() {
		return lista;
		}

	public void setLista(List<EGodina> lista) {
		this.lista = lista;
		}
	
	}
