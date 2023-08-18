package br.com.arielsonsantos.drms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DumpsterType implements DRMSEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	
	public DumpsterType() {
	}
	
	public DumpsterType(final String description) {
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}
}
