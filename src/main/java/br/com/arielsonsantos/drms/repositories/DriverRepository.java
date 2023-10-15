package br.com.arielsonsantos.drms.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.arielsonsantos.drms.entities.Driver;

public interface DriverRepository extends CrudRepository<Driver, Long> {

}
