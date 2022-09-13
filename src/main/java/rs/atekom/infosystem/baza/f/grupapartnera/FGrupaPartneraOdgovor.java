package rs.atekom.infosystem.baza.f.grupapartnera;


import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;
import rs.atekom.infosystem.baza.e.konto.EKonto;

public class FGrupaPartneraOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private FGrupaPartnera grupa;
	private List<FGrupaPartnera> lista;
	private List<EKonto> konta;
	
	public FGrupaPartneraOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public FGrupaPartneraOdgovor(List<FGrupaPartnera> lista) {
		this.lista = lista;
		}
	
	public FGrupaPartneraOdgovor(FGrupaPartnera grupa) {
		this.grupa = grupa;
		}

	public FGrupaPartnera getGrupa() {
		return grupa;
		}

	public void setGrupa(FGrupaPartnera grupa) {
		this.grupa = grupa;
		}

	public List<FGrupaPartnera> getLista() {
		return lista;
		}

	public void setLista(List<FGrupaPartnera> lista) {
		this.lista = lista;
		}

	public List<EKonto> getKonta() {
		return konta;
	}

	public void setKonta(List<EKonto> konta) {
		this.konta = konta;
	}
	
	}
