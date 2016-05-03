package com.twoewe.service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

@Component
public class InMemoryRegexMapper implements ClientMapper {

	private Map<Pattern, String> regexes = new HashMap<Pattern, String>();
	
	@Override
	public String map(String uri) {
		for(Pattern p : regexes.keySet()) {
			Matcher m = p.matcher(uri);
			if(m.matches()) {
				return regexes.get(p);
			}
		}
		return "UNKNOWN";
	}

	@Override
	public void addMapping(Pattern p, String clientName) {
		regexes.put(p, clientName);
		
	}

}
