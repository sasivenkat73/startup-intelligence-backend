package com.startupintel.startup_intelligence_api.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startupintel.startup_intelligence_api.dto.StatsResponse;
import com.startupintel.startup_intelligence_api.repository.FundingRoundRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class StatsController {

	
	private final FundingRoundRepository fundingRoundRepository;
	
	public StatsController(FundingRoundRepository fundingRoundRepository) {
		this.fundingRoundRepository = fundingRoundRepository;
	}
	
	@GetMapping("/stats")
	public StatsResponse getStats() {
		long count = fundingRoundRepository.count();
		long startups = fundingRoundRepository.countDistinctByStartupNameIsNotNull();
		
		return new StatsResponse(count, startups);
	}
	
}
