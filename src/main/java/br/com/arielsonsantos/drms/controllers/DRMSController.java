package br.com.arielsonsantos.drms.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.arielsonsantos.drms.entities.DRMSEntity;
import br.com.arielsonsantos.drms.exceptions.EntityNotFoundException;
import br.com.arielsonsantos.drms.services.DRMSService;

@CrossOrigin(origins = "*")
public abstract class DRMSController<Entity extends DRMSEntity> {

	protected String entityName;
	protected DRMSService<Entity> service;

	public abstract Entity merge(final Entity entity, final Entity newEntity);

	@GetMapping()
	public Iterable<Entity> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Entity> findById(@PathVariable final Long id) {
		return service.findById(id);
	}

	@PostMapping()
	public ResponseEntity<Entity> save(@RequestBody final Entity entity) {
		service.save(entity);
		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Entity> update(@PathVariable final Long id, @RequestBody final Entity newEntity) {
		final Entity entity = service.findById(id).orElseThrow(() -> new EntityNotFoundException(entityName, id));

		merge(entity, newEntity);
		service.save(entity);

		return ResponseEntity.status(HttpStatus.CREATED).body(entity);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Long> deleteById(@PathVariable final Long id) {
		final Entity entity = service.findById(id).orElseThrow(() -> new EntityNotFoundException(entityName, id));

		service.delete(entity);

		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(id);
	}
}
