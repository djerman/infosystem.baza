package rs.atekom.infosystem.baza.a.poreskatarifa;

import java.io.Serializable;
import java.util.List;

public class APoreskaTarifaOdgovor implements Serializable{

	private static final long serialVersionUID = 1L;
	private APoreskaTarifa tarifa;
	private List<APoreskaTarifa> lista;
	
	public APoreskaTarifaOdgovor() {
		// TODO Auto-generated constructor stub
		}

	public APoreskaTarifaOdgovor(List<APoreskaTarifa> lista) {
		this.lista = lista;
		}
	
	public APoreskaTarifaOdgovor(APoreskaTarifa tarifa) {
		this.tarifa = tarifa;
		};
	
	public APoreskaTarifa getTarifa() {
		return tarifa;
		}

	public void setTarifa(APoreskaTarifa tarifa) {
		this.tarifa = tarifa;
		}

	public List<APoreskaTarifa> getLista() {
		return lista;
		}

	public void setLista(List<APoreskaTarifa> lista) {
		this.lista = lista;
		}
	
	}
