package br.com.arielsonsantos.drms.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.arielsonsantos.drms.entities.Dumpster;

public interface DumpsterRepository extends CrudRepository<Dumpster, Long> {

}
