package com.startupintel.startup_intelligence_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startupintel.startup_intelligence_api.model.Feedback;
import com.startupintel.startup_intelligence_api.service.FeedbackService;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "http://localhost:5173")
public class FeedbackController {

	@Autowired
	FeedbackService service;

	@PostMapping
	public ResponseEntity<?> submitFeedback(
			@RequestBody Feedback feedback
	) {
		return ResponseEntity.ok(
				service.saveFeedback(feedback)
		);
	}
}