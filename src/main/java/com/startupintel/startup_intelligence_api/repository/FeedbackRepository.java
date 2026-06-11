package com.startupintel.startup_intelligence_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.startupintel.startup_intelligence_api.model.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
	
}