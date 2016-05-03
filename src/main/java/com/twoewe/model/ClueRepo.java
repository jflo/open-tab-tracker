package com.twoewe.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ClueRepo extends CrudRepository<Clue, Long>{

	//percentage of time per client for this week
	//select client_name, (count(client_name) * 100 / (select count(*) from Clue)) as work from Clue where WEEK(accessed_at) = WEEK(SYSDATE())group By client_name;


	@Query(value = "select users_email AS usersEmail, client_name AS clientName, WEEK(accessed_at) AS weekNumber, (count(client_name) * 100 / (select count(*) from Clue)) AS percentTimeSpent from Clue where WEEK(accessed_at) = WEEK(SYSDATE())group By users_email, client_name", nativeQuery = true)
	public List<ClueSummary> thisWeeksReport();
	
	
}
