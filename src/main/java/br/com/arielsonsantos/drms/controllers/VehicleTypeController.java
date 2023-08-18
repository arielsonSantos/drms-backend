package br.com.arielsonsantos.drms.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.arielsonsantos.drms.entities.VehicleType;
import br.com.arielsonsantos.drms.services.VehicleTypeService;

@RestController
@RequestMapping("/vehicle-type")
public class VehicleTypeController extends DRMSController<VehicleType> {

	protected VehicleTypeController(final VehicleTypeService vehicleTypeService) {
		entityName = "Tipo de veículo";
		service = vehicleTypeService;
	}

	@Override
	public VehicleType merge(final VehicleType vehicleType, final VehicleType newVehicleType) {
		vehicleType.setDescription(newVehicleType.getDescription());
		return vehicleType;
	}
}
