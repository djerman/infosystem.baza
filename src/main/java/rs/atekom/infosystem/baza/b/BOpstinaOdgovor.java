package rs.atekom.infosystem.baza.b;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class BOpstinaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private BOpstina opstina;
	private List<BOpstina> lista;
	
	public BOpstinaOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public BOpstina getOpstina() {
		return opstina;
		}

	public void setOpstina(BOpstina opstina) {
		this.opstina = opstina;
		}

	public List<BOpstina> getLista() {
		return lista;
		}

	public void setLista(List<BOpstina> lista) {
		this.lista = lista;
		}
	
	}
