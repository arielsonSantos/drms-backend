package br.com.arielsonsantos.drms.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arielsonsantos.drms.entities.DumpsterType;
import br.com.arielsonsantos.drms.services.DumpsterTypeService;

@RestController
@RequestMapping("/dumpster-type")
public class DumpsterTypeController extends DRMSController<DumpsterType> {

	protected DumpsterTypeController(final DumpsterTypeService dumpsterTypeService) {
		entityName = "Tipo de caçamba";
		service = dumpsterTypeService;
	}
}