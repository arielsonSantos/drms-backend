package br.com.arielsonsantos.drms.services;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.arielsonsantos.drms.entities.DRMSEntity;

public abstract class DRMSService<Entity extends DRMSEntity> {
	
	private CrudRepository<Entity, Long> repository;

	public DRMSService(CrudRepository<Entity, Long> repository) {
		this.repository = repository;
	}

	public Iterable<Entity> findAll() {
		return repository.findAll();
	}

	public Entity save(Entity entity) {
		return repository.save(entity);
	}

	public Optional<Entity> findById(Long id) {
		return repository.findById(id);
	}

	public void delete(Entity entity) {
		repository.delete(entity);
	}
}
