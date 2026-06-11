package com.startupintel.startup_intelligence_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startupintel.startup_intelligence_api.model.StartupProfile;

@Repository

public interface StartupProfileRepository extends JpaRepository<StartupProfile, Long> {
	
	Optional<StartupProfile> findByStartupName(String startupName);
}