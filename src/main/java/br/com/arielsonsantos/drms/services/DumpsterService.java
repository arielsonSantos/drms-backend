package br.com.arielsonsantos.drms.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.Dumpster;
import br.com.arielsonsantos.drms.enums.DumpsterStatus;
import br.com.arielsonsantos.drms.repositories.DumpsterRepository;

@Service
public class DumpsterService {

	private DumpsterRepository dumpsterRepository;

	public DumpsterService(DumpsterRepository dumpsterRepository) {
		this.dumpsterRepository = dumpsterRepository;
	}
	
	public Iterable<Dumpster> findAll() {
		return dumpsterRepository.findAll();
	}

	public Dumpster save(Dumpster dumpster) {
		dumpster.setStatus(DumpsterStatus.FREE);
		return dumpsterRepository.save(dumpster);
	}

	public Optional<Dumpster> findById(Long id) {
		return dumpsterRepository.findById(id);
	}
}
