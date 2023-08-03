package br.com.arielsonsantos.drms.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arielsonsantos.drms.entities.Dumpster;
import br.com.arielsonsantos.drms.services.DumpsterService;

@RestController
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
	public Optional<Dumpster> findAll(@PathVariable Long id) {
		return dumpsterService.findById(id);
	}
	
	@PostMapping()
	public Dumpster save(@RequestBody Dumpster dumpster) {
		return dumpsterService.save(dumpster);
	}

}
