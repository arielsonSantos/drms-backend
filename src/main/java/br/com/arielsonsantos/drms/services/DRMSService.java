package br.com.arielsonsantos.drms.services;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.arielsonsantos.drms.entities.DRMSEntity;

public abstract class DRMSService<Entity extends DRMSEntity> {

	private final CrudRepository<Entity, Long> repository;

	public DRMSService(final CrudRepository<Entity, Long> repository) {
		this.repository = repository;
	}

	public Iterable<Entity> findAll() {
		return repository.findAll();
	}

	public Entity save(final Entity entity) {
		return repository.save(entity);
	}

	public Optional<Entity> findById(final Long id) {
		return repository.findById(id);
	}

	public void delete(final Entity entity) {
		repository.delete(entity);
	}
}
