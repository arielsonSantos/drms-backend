package br.com.arielsonsantos.drms.services;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.Vehicle;
import br.com.arielsonsantos.drms.enums.VehicleStatus;
import br.com.arielsonsantos.drms.repositories.VehicleRepository;

@Service
public class VehicleService extends DRMSService<Vehicle> {

	public VehicleService(final VehicleRepository vehicleRepository) {
		super(vehicleRepository);
	}

	@Override
	public Vehicle save(final Vehicle vehicle) {
		vehicle.setStatus(VehicleStatus.FREE);
		return super.save(vehicle);
	}

	@Override
	public Vehicle merge(final Vehicle vehicle, final Vehicle newVehicle) {
		vehicle.setLicensePlate(newVehicle.getLicensePlate());
		vehicle.setModel(newVehicle.getModel());
		vehicle.setModelYear(newVehicle.getModelYear());
		vehicle.setManufacturer(newVehicle.getManufacturer());
		vehicle.setColor(newVehicle.getColor());
		vehicle.setType(newVehicle.getType());
		return vehicle;
	}
}
