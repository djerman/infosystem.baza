package rs.atekom.infosystem.baza.e.tipdokumenta;

import java.util.List;

import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class ETipDokumentaOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private List<ETipDokumenta> lista;
	private ETipDokumenta tipDokumenta;
	
	public ETipDokumentaOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public ETipDokumentaOdgovor(List<ETipDokumenta> lista) {
		this.lista = lista;
		}
	
	public ETipDokumentaOdgovor(ETipDokumenta tipDokumenta) {
		this.tipDokumenta = tipDokumenta;
		}

	public List<ETipDokumenta> getLista() {
		return lista;
		}

	public void setLista(List<ETipDokumenta> lista) {
		this.lista = lista;
		}

	public ETipDokumenta getTipDokumenta() {
		return tipDokumenta;
		}

	public void setTipDokumenta(ETipDokumenta tipDokumenta) {
		this.tipDokumenta = tipDokumenta;
		}
	
	}
