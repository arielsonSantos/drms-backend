package br.com.arielsonsantos.drms.services;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.VehicleType;
import br.com.arielsonsantos.drms.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService extends DRMSService<VehicleType> {

	public VehicleTypeService(final VehicleTypeRepository vehicleTypeRepository) {
		super(vehicleTypeRepository);
	}

	@Override
	public VehicleType merge(final VehicleType vehicleType, final VehicleType newVehicleType) {
		vehicleType.setDescription(newVehicleType.getDescription());
		return vehicleType;
	}
}
