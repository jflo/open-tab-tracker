package com.twoewe;

import java.util.regex.Pattern;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.twoewe.service.ClientMapper;
import com.twoewe.service.InMemoryRegexMapper;

@Configuration
public class AppConfig {

	@Bean
	public ClientMapper clientMapper() {
		ClientMapper retval = new InMemoryRegexMapper();
		Pattern google = Pattern.compile("^.*google.*$");
		retval.addMapping(google, "GOOGLE");
		return retval;
	}
}
