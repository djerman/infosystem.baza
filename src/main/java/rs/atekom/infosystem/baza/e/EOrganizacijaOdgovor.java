package rs.atekom.infosystem.baza.e;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class EOrganizacijaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private EOrganizacija organizacija;
	private List<EOrganizacija> lista;
	
	public EOrganizacijaOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public EOrganizacija getOrganizacija() {
		return organizacija;
		}

	public void setOrganizacija(EOrganizacija organizacija) {
		this.organizacija = organizacija;
		}

	public List<EOrganizacija> getLista() {
		return lista;
		}

	public void setLista(List<EOrganizacija> lista) {
		this.lista = lista;
		}
	
	}
