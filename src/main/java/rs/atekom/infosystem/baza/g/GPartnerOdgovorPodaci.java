package rs.atekom.infosystem.baza.g;

import java.io.Serializable;
import java.util.List;

import rs.atekom.infosystem.baza.f.FPreduzece;
import rs.atekom.infosystem.baza.i.IAdresa;

public class GPartnerOdgovorPodaci implements Serializable{

	private static final long serialVersionUID = 1L;
	private GPartner partner;
	private FPreduzece preduzece;
	private IAdresa sediste;
	private List<IAdresa> adrese;
	
	public GPartnerOdgovorPodaci() {
		// TODO Auto-generated constructor stub
		}
	
	public GPartnerOdgovorPodaci(GPartner partner, IAdresa sediste, List<IAdresa> adrese) {
		this.partner = partner;
		this.sediste = sediste;
		this.adrese = adrese;
		}
	
	public GPartnerOdgovorPodaci(FPreduzece preduzece, IAdresa sediste, List<IAdresa> adrese) {
		this.preduzece = preduzece;
		this.sediste = sediste;
		this.adrese = adrese;
		}

	public GPartner getPartner() {
		return partner;
		}

	public void setPartner(GPartner partner) {
		this.partner = partner;
		}

	public FPreduzece getPreduzece() {
		return preduzece;
		}

	public void setPreduzece(FPreduzece preduzece) {
		this.preduzece = preduzece;
		}

	public IAdresa getSediste() {
		return sediste;
		}

	public void setSediste(IAdresa sediste) {
		this.sediste = sediste;
		}

	public List<IAdresa> getAdrese() {
		return adrese;
		}

	public void setAdrese(List<IAdresa> adrese) {
		this.adrese = adrese;
		}
	
	}
