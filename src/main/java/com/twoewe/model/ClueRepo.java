package com.twoewe.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ClueRepo extends CrudRepository<Clue, Long>{

}
