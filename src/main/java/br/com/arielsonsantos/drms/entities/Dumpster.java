package br.com.arielsonsantos.drms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import br.com.arielsonsantos.drms.enums.DumpsterStatus;

@Entity
public class Dumpster implements DRMSEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String identifier;
	private @ManyToOne DumpsterType type;
	private DumpsterStatus status;

	public Dumpster() {
	}

	public Dumpster(final String identifier, final DumpsterType type, final DumpsterStatus status) {
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

	public void setIdentifier(final String identifier) {
		this.identifier = identifier;
	}

	public DumpsterType getType() {
		return type;
	}

	public void setType(final DumpsterType type) {
		this.type = type;
	}

	public DumpsterStatus getStatus() {
		return status;
	}

	public void setStatus(final DumpsterStatus status) {
		this.status = status;
	}
}
