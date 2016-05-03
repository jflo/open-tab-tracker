package com.twoewe.model;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ClueRepo extends CrudRepository<Clue, Long>{

	//percentage of time per client for this week
	//select client_name, (count(client_name) * 100 / (select count(*) from Clue)) as work from Clue where WEEK(accessed_at) = WEEK(SYSDATE())group By client_name;
}
