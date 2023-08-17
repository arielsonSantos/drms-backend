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

import br.com.arielsonsantos.drms.entities.DumpsterType;
import br.com.arielsonsantos.drms.exceptions.EntityNotFoundException;
import br.com.arielsonsantos.drms.services.DumpsterTypeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/dumpster-type")
public class DumpsterTypeController {
	
	private final DumpsterTypeService dumpsterTypeService;
	
	protected DumpsterTypeController(DumpsterTypeService dumpsterTypeService) {
		this.dumpsterTypeService = dumpsterTypeService;
	}
	
	@GetMapping()
	public Iterable<DumpsterType> findAll() {
		return dumpsterTypeService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<DumpsterType> findById(@PathVariable Long id) {
		return dumpsterTypeService.findById(id);
	}
	
	@PostMapping()
	public ResponseEntity<DumpsterType> save(@RequestBody DumpsterType dumpsterType) {
		dumpsterTypeService.save(dumpsterType);
		return ResponseEntity.status(HttpStatus.CREATED).body(dumpsterType);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<DumpsterType> update(@PathVariable Long id, @RequestBody DumpsterType newDumpsterType) {
		final DumpsterType dumpsterType = dumpsterTypeService.findById(id).orElseThrow(() -> new EntityNotFoundException("Tipo de caçamba", id));
		
		dumpsterType.setDescription(newDumpsterType.getDescription());
		
		dumpsterTypeService.save(dumpsterType);
		return ResponseEntity.status(HttpStatus.CREATED).body(newDumpsterType);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Long id) {
		final DumpsterType dumpsterType = dumpsterTypeService.findById(id).orElseThrow(() -> new EntityNotFoundException("Tipo de caçamba", id));
		
		dumpsterTypeService.delete(dumpsterType);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
