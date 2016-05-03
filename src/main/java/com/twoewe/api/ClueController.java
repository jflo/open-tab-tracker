package com.twoewe.api;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.twoewe.model.Clue;
import com.twoewe.model.ClueRepo;
import com.twoewe.service.ClientMapper;

@Controller
@RequestMapping("/tablog")
public class ClueController {
	
	@Autowired
	private ClueRepo repo;
	
	@Autowired
	private ClientMapper mapper;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public void create(String email, String uri) {
		Clue newEntry = new Clue();
		newEntry.setUsersEmail(email);
		newEntry.setAccessedAt(new Date());
		newEntry.setUri(uri);
		newEntry.setClientName(mapper.map(uri));
		repo.save(newEntry);
	}
	
	

	public ClueRepo getRepo() {
		return repo;
	}

	public void setRepo(ClueRepo repo) {
		this.repo = repo;
	}

}