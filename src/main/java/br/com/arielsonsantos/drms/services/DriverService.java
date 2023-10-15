package br.com.arielsonsantos.drms.services;

import org.springframework.stereotype.Service;

import br.com.arielsonsantos.drms.entities.Driver;
import br.com.arielsonsantos.drms.repositories.DriverRepository;

@Service
public class DriverService extends DRMSService<Driver> {

	public DriverService(final DriverRepository driverRepository) {
		super(driverRepository);
	}

	@Override
	public Driver merge(final Driver driver, final Driver newDriver) {
		driver.setName(newDriver.getName());
		return driver;
	}
}
