package com.startupintel.startup_intelligence_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startupintel.startup_intelligence_api.service.StartupProfileService;

@RestController
@RequestMapping("/api/startups")
@CrossOrigin(origins = "http://localhost:5173")
public class StartupProfileController {

	@Autowired
	StartupProfileService service;

	@GetMapping("/profile/{name}")
	public ResponseEntity<?> getProfile(
			@PathVariable String name
	) {
		return ResponseEntity.ok(
				service.getProfile(name)
		);

	}

}