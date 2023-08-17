package br.com.arielsonsantos.drms.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.DumpsterType;
import br.com.arielsonsantos.drms.repositories.DumpsterTypeRepository;

@Service
public class DumpsterTypeService {

	private DumpsterTypeRepository dumpsterTypeRepository;

	public DumpsterTypeService(DumpsterTypeRepository dumpsterTypeRepository) {
		this.dumpsterTypeRepository = dumpsterTypeRepository;
	}
	
	public Iterable<DumpsterType> findAll() {
		return dumpsterTypeRepository.findAll();
	}

	public DumpsterType save(DumpsterType dumpsterType) {
		return dumpsterTypeRepository.save(dumpsterType);
	}

	public Optional<DumpsterType> findById(Long id) {
		return dumpsterTypeRepository.findById(id);
	}
	
	public void delete(DumpsterType dumpsterType) {
		dumpsterTypeRepository.delete(dumpsterType);
	}
}
