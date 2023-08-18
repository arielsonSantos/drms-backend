package br.com.arielsonsantos.drms.services;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.DumpsterType;
import br.com.arielsonsantos.drms.repositories.DumpsterTypeRepository;

@Service
public class DumpsterTypeService extends DRMSService<DumpsterType> {

	public DumpsterTypeService(DumpsterTypeRepository dumpsterTypeRepository) {
		super(dumpsterTypeRepository);
	}
}