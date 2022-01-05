package rs.atekom.infosystem.baza;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class OsnovnaSema implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private Boolean izbrisan;
	private Integer verzija;
	
	public OsnovnaSema() {
		// TODO Auto-generated constructor stub
		}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
		}

	public void setId(Long id) {
		this.id = id;
		}

	@Column(name = "izbrisan", nullable = false, columnDefinition = "int default 0")
	public Boolean getIzbrisan() {
		return izbrisan;
		}

	public void setIzbrisan(Boolean izbrisan) {
		this.izbrisan = izbrisan;
		}

	public Integer getVerzija() {
		return verzija;
		}

	public void setVerzija(Integer verzija) {
		this.verzija = verzija;
		}
	/*
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (id == null || obj == null || getClass() != obj.getClass())
            return false;
        Person that = (Person) obj;
        return id.equals(that.id);
        }
    
    @Override
    public int hashCode() {
    	return id == null ? 0 : id.hashCode();
    	}    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (id == null || obj == null || getClass() != obj.getClass())
            return false;
        Person that = (Person) obj;
        return id.equals(that.id);
    }
    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (id == null || obj == null || getClass() != obj.getClass())
            return false;
        Person that = (Person) obj;
        return id.equals(that.id);
    }
    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }*/
    
	}
