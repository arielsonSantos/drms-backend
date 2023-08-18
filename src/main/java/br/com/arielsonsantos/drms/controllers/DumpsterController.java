package br.com.arielsonsantos.drms.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arielsonsantos.drms.entities.Dumpster;
import br.com.arielsonsantos.drms.services.DumpsterService;

@RestController
@RequestMapping("/dumpster")
public class DumpsterController extends DRMSController<Dumpster> {

	protected DumpsterController(final DumpsterService dumpsterService) {
		entityName = "Caçamba";
		service = dumpsterService;
	}

	@Override
	public Dumpster merge(final Dumpster dumpster, final Dumpster newDumpster) {
		dumpster.setIdentifier(newDumpster.getIdentifier());
		dumpster.setType(newDumpster.getType());
		dumpster.setStatus(newDumpster.getStatus());
		return dumpster;
	}
}