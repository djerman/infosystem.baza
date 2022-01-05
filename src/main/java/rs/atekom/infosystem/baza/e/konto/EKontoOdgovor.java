package rs.atekom.infosystem.baza.e.konto;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class EKontoOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private List<EKonto> lista;
	private EKonto konto;
	
	public EKontoOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public EKontoOdgovor(List<EKonto> lista) {
		this.lista = lista;
		}

	public List<EKonto> getLista() {
		return lista;
		}

	public void setLista(List<EKonto> lista) {
		this.lista = lista;
		}

	public EKonto getKonto() {
		return konto;
		}

	public void setKonto(EKonto konto) {
		this.konto = konto;
		}
	
	}
