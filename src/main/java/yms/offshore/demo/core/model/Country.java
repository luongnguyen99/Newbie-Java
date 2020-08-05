package yms.offshore.demo.core.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    private Long id;

    public String name;
    
    public int population;
    
    public Country() {
    	
    };
    
    public Country(Long id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

    
  
}
