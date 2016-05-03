package com.twoewe.service;

import java.util.regex.Pattern;

public interface ClientMapper {

	public String map(String uri);
	public void addMapping(Pattern p, String clientName);
}
