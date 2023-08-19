package br.com.arielsonsantos.drms.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.arielsonsantos.drms.entities.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

}
