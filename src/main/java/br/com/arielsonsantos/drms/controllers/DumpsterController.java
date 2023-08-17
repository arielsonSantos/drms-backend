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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arielsonsantos.drms.entities.Dumpster;
import br.com.arielsonsantos.drms.exceptions.EntityNotFoundException;
import br.com.arielsonsantos.drms.services.DumpsterService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/dumpster")
public class DumpsterController {
	
	private final DumpsterService dumpsterService;
	
	protected DumpsterController(DumpsterService dumpsterService) {
		this.dumpsterService = dumpsterService;
	}
	
	@GetMapping()
	public Iterable<Dumpster> findAll() {
		return dumpsterService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Dumpster> findById(@PathVariable Long id) {
		return dumpsterService.findById(id);
	}
	
	@PostMapping()
	public ResponseEntity<Dumpster> save(@RequestBody Dumpster dumpster) {
		dumpsterService.save(dumpster);
		return ResponseEntity.status(HttpStatus.CREATED).body(dumpster);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Dumpster> update(@PathVariable Long id, @RequestBody Dumpster newDumpster) {
		final Dumpster dumpster = dumpsterService.findById(id).orElseThrow(() -> new EntityNotFoundException("Caçamba", id));
	
		dumpster.setIdentifier(newDumpster.getIdentifier());
		dumpster.setType(newDumpster.getType());
		
		dumpsterService.save(dumpster);
		return ResponseEntity.status(HttpStatus.CREATED).body(newDumpster);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Long id) {
		final Dumpster dumpster = dumpsterService.findById(id).orElseThrow(() -> new EntityNotFoundException("Caçamba", id));
		
		dumpsterService.delete(dumpster);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
