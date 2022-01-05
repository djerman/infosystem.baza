package rs.atekom.infosystem.baza.c;

import java.util.List;
import rs.atekom.infosystem.baza.RestOdgovoriStrane;

public class CMestoOdgovor extends RestOdgovoriStrane{

	private static final long serialVersionUID = 1L;
	private CMesto mesto;
	private List<CMesto> lista;
	
	public CMestoOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public CMesto getMesto() {
		return mesto;
		}

	public void setMesto(CMesto mesto) {
		this.mesto = mesto;
		}

	public List<CMesto> getLista() {
		return lista;
		}

	public void setLista(List<CMesto> lista) {
		this.lista = lista;
		}
	
	}
