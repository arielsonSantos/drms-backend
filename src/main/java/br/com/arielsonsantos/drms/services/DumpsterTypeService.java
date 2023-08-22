package br.com.arielsonsantos.drms.services;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.DumpsterType;
import br.com.arielsonsantos.drms.repositories.DumpsterTypeRepository;

@Service
public class DumpsterTypeService extends DRMSService<DumpsterType> {

	public DumpsterTypeService(final DumpsterTypeRepository dumpsterTypeRepository) {
		super(dumpsterTypeRepository);
	}

	@Override
	public DumpsterType merge(final DumpsterType dumpsterType, final DumpsterType newDumpsterType) {
		dumpsterType.setDescription(newDumpsterType.getDescription());
		return dumpsterType;
	}
}