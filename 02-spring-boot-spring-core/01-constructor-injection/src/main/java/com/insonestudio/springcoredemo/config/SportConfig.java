package com.insonestudio.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.insonestudio.springcoredemo.common.Coach;
import com.insonestudio.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
	
	@Bean("aquatic")
	public Coach swimCoach() {
		return new SwimCoach();
	}

}
