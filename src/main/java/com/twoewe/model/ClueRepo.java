package com.twoewe.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ClueRepo extends CrudRepository<Clue, Long>{

	//percentage of time per client for this week
	//select client_name, (count(client_name) * 100 / (select count(*) from Clue)) as work from Clue where WEEK(accessed_at) = WEEK(SYSDATE())group By client_name;


	@Query(value = "select *, (count(*) / (select count(*) from Clue c2 where c2.users_email = ?1 and c2.client_name = client_name))  from Clue where users_email = ?1 GROUP BY client_name", nativeQuery = true)
	public List<ClueSummary> thisWeeksReportFor(String email);
	
	
}
