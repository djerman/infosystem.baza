package rs.atekom.infosystem.baza.a.drzava;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;
import rs.atekom.infosystem.baza.b.BOpstina;
import rs.atekom.infosystem.baza.c.CMesto;

public class ADrzavaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private ADrzava drzava;
	private List<ADrzava> lista;
	private List<BOpstina> listaOpstina;
	private List<CMesto> listaMesta;

	public ADrzavaOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public ADrzava getDrzava() {
		return drzava;
		}

	public void setDrzava(ADrzava drzava) {
		this.drzava = drzava;
		}

	public List<ADrzava> getLista() {
		return lista;
		}

	public void setLista(List<ADrzava> lista) {
		this.lista = lista;
		}

	public List<BOpstina> getListaOpstina() {
		return listaOpstina;
		}

	public void setListaOpstina(List<BOpstina> listaOpstina) {
		this.listaOpstina = listaOpstina;
		}

	public List<CMesto> getListaMesta() {
		return listaMesta;
		}

	public void setListaMesta(List<CMesto> listaMesta) {
		this.listaMesta = listaMesta;
		}
	
	}
