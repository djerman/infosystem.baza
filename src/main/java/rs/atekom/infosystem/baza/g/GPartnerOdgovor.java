package rs.atekom.infosystem.baza.g;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;
import rs.atekom.infosystem.baza.c.CMesto;
import rs.atekom.infosystem.baza.e.konto.EKonto;
import rs.atekom.infosystem.baza.f.grupapartnera.FGrupaPartnera;

public class GPartnerOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private GPartner partner;
	private List<GPartner> lista;
	private List<GPartnerOdgovorPodaci> listaSaPodacima;
	private List<FGrupaPartnera> grupe;
	private List<CMesto> mesta;
	private List<EKonto> konta;
	
	public GPartnerOdgovor() {
		// TODO Auto-generated constructor stub
		}
	
	public GPartnerOdgovor(List<GPartner> lista) {
		this.lista = lista;
		}
	
	public GPartnerOdgovor(GPartner partner) {
		this.partner = partner;
		}

	public GPartner getPartner() {
		return partner;
		}

	public void setPartner(GPartner partner) {
		this.partner = partner;
		}

	public List<GPartner> getLista() {
		return lista;
		}

	public void setLista(List<GPartner> lista) {
		this.lista = lista;
		}

	public List<GPartnerOdgovorPodaci> getListaSaPodacima() {
		return listaSaPodacima;
		}

	public void setListaSaPodacima(List<GPartnerOdgovorPodaci> listaSaPodacima) {
		this.listaSaPodacima = listaSaPodacima;
		}

	public List<FGrupaPartnera> getGrupe() {
		return grupe;
		}

	public void setGrupe(List<FGrupaPartnera> grupe) {
		this.grupe = grupe;
		}

	public List<CMesto> getMesta() {
		return mesta;
		}

	public void setMesta(List<CMesto> mesta) {
		this.mesta = mesta;
		}

	public List<EKonto> getKonta() {
		return konta;
	}

	public void setKonta(List<EKonto> konta) {
		this.konta = konta;
	}
	
	}
