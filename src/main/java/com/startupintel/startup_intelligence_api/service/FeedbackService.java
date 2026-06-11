package com.startupintel.startup_intelligence_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startupintel.startup_intelligence_api.model.Feedback;
import com.startupintel.startup_intelligence_api.repository.FeedbackRepository;

@Service

public class FeedbackService {

	@Autowired
	private FeedbackRepository repository;
	
	public FeedbackService(FeedbackRepository repository) {
		this.repository = repository;
	}

	public Feedback saveFeedback(Feedback feedback) {
		return repository.save(feedback);
	}
}