package br.com.arielsonsantos.drms.services;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.Dumpster;
import br.com.arielsonsantos.drms.repositories.DumpsterRepository;

@Service
public class DumpsterService extends DRMSService<Dumpster> {

	public DumpsterService(DumpsterRepository dumpsterRepository) {
		super(dumpsterRepository);
	}
}