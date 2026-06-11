package com.startupintel.startup_intelligence_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startupintel.startup_intelligence_api.model.StartupProfile;
import com.startupintel.startup_intelligence_api.repository.StartupProfileRepository;

@Service
public class StartupProfileService {

	@Autowired
	StartupProfileRepository repository;
	public StartupProfile getProfile(String startupName) {

		return repository
				.findByStartupName(startupName)
				.orElse(null);
	}

}