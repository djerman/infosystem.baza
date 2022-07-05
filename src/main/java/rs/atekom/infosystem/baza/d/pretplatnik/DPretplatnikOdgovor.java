package rs.atekom.infosystem.baza.d.pretplatnik;


import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class DPretplatnikOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private DPretplatnik pretplatnik;
	private List<DPretplatnik> lista;
	private List<DPretplatnikPodaci> listaSaPodacima;
	
	public DPretplatnikOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public DPretplatnik getPretplatnik() {
		return pretplatnik;
		}

	public void setPretplatnik(DPretplatnik pretplatnik) {
		this.pretplatnik = pretplatnik;
		}

	public List<DPretplatnik> getLista() {
		return lista;
		}

	public void setLista(List<DPretplatnik> lista) {
		this.lista = lista;
		}

	public List<DPretplatnikPodaci> getListaSaPodacima() {
		return listaSaPodacima;
		}

	public void setListaSaPodacima(List<DPretplatnikPodaci> listaSaPodacima) {
		this.listaSaPodacima = listaSaPodacima;
		}
	
	}
