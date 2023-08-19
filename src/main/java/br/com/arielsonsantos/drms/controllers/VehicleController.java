package br.com.arielsonsantos.drms.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arielsonsantos.drms.entities.Vehicle;
import br.com.arielsonsantos.drms.services.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController extends DRMSController<Vehicle> {

	protected VehicleController(final VehicleService vehicleService) {
		entityName = "Veículo";
		service = vehicleService;
	}
}
