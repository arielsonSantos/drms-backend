package br.com.arielsonsantos.drms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.arielsonsantos.drms.enums.DumpsterStatus;

@Entity
public class Dumpster {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
	private String identifier;
	private @ManyToOne DumpsterType type;
	private DumpsterStatus status;

	protected Dumpster() {
	}
	
	public Dumpster(String identifier, DumpsterType type, DumpsterStatus status) {
		this.identifier = identifier;
		this.type = type;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public DumpsterType getType() {
		return type;
	}

	public void setType(DumpsterType type) {
		this.type = type;
	}

	public DumpsterStatus getStatus() {
		return status;
	}

	public void setStatus(DumpsterStatus status) {
		this.status = status;
	}
}
