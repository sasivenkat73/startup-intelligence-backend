package com.startupintel.startup_intelligence_api.controller;

import com.startupintel.startup_intelligence_api.dto.FundingRoundFeedDto;
import com.startupintel.startup_intelligence_api.model.FundingRound;
import com.startupintel.startup_intelligence_api.repository.FundingRoundRepository;
import com.startupintel.startup_intelligence_api.service.FundingRoundService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class FundingRoundController {

	private final FundingRoundRepository repository;
	private final FundingRoundService service;

	public FundingRoundController(FundingRoundRepository repository, FundingRoundService service

	) {
		this.repository = repository;
		this.service = service;
	}

	@GetMapping("/funding")
	public List<FundingRound> getAllFundingRounds() {
		return repository.findAll();
	}

	@GetMapping("/latest")
	public ResponseEntity<List<FundingRoundFeedDto>> getFundingFeed(
			@RequestParam(value = "sortOrder", defaultValue = "true") boolean sortOrder) {
		// Pass the boolean into your service layer to handle the sorting logic
		List<FundingRoundFeedDto> feed = service.getLatestFundingFeed(sortOrder);
		return ResponseEntity.ok(feed);
	}

	@GetMapping("/oldtonew")
	public ResponseEntity<List<FundingRoundFeedDto>> oldestFunding(
			@RequestParam(value = "sortOrder", defaultValue = "false") boolean sortOrder) {
		List<FundingRoundFeedDto> feed = service.getLatestFundingFeed(sortOrder);
		return ResponseEntity.ok(feed);
	}

	@GetMapping("/sectors")
	public ResponseEntity<?> getSectors() {
		return ResponseEntity.ok(service.getTrendingSectors());
	}

	@GetMapping("/filter")
	public ResponseEntity<?> filterFunding(
			@RequestParam(required = false) List<String> sectors, @RequestParam(required = false) List<String> stages
	) {
		return ResponseEntity.ok(
				service.filterFunding(sectors, stages)
		);
	}

}
