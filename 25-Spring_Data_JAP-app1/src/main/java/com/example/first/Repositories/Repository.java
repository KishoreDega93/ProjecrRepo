package com.example.first.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.first.Entity.Player;

//@Repository -->optional becz , our interface is special interface becz it extending properties from crudRepo
public interface Repository extends CrudRepository<Player, Integer> {

}
