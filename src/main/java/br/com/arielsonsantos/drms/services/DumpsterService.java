package br.com.arielsonsantos.drms.services;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.Dumpster;
import br.com.arielsonsantos.drms.enums.DumpsterStatus;
import br.com.arielsonsantos.drms.repositories.DumpsterRepository;

@Service
public class DumpsterService extends DRMSService<Dumpster> {

	public DumpsterService(final DumpsterRepository dumpsterRepository) {
		super(dumpsterRepository);
	}

	@Override
	public Dumpster save(final Dumpster dumpster) {
		dumpster.setStatus(DumpsterStatus.FREE);
		return super.save(dumpster);
	}

	@Override
	public Dumpster merge(final Dumpster dumpster, final Dumpster newDumpster) {
		dumpster.setIdentifier(newDumpster.getIdentifier());
		dumpster.setType(newDumpster.getType());
		return dumpster;
	}
}