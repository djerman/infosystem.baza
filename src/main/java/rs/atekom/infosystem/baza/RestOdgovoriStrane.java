package rs.atekom.infosystem.baza;

import java.io.Serializable;

public class RestOdgovoriStrane implements Serializable{

	private static final long serialVersionUID = 1L;
	private int trenutnaStrana, ukupnoStrana;
	private long ukupnoZapisa;
	
	public RestOdgovoriStrane() {
		// TODO Auto-generated constructor stub
		}
	
	public RestOdgovoriStrane(int trenutnaStrana, long ukupnoZapisa, int ukupnoStrana) {
		this.trenutnaStrana = trenutnaStrana;
		this.ukupnoZapisa = ukupnoZapisa;
		this.ukupnoStrana = ukupnoStrana;
		}
	
	public int getTrenutnaStrana() {
		return trenutnaStrana;
		}

	public void setTrenutnaStrana(int trenutnaStrana) {
		this.trenutnaStrana = trenutnaStrana;
		}

	public long getUkupnoZapisa() {
		return ukupnoZapisa;
		}

	public void setUkupnoZapisa(long ukupnoZapisa) {
		this.ukupnoZapisa = ukupnoZapisa;
		}

	public int getUkupnoStrana() {
		return ukupnoStrana;
		}

	public void setUkupnoStrana(int ukupnoStrana) {
		this.ukupnoStrana = ukupnoStrana;
		}
	
	}
