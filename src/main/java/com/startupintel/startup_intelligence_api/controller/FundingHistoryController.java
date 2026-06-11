package com.startupintel.startup_intelligence_api.controller;

import org.springframework.web.bind.annotation.*;

import com.startupintel.startup_intelligence_api.dto.FundingHistoryDTO;
import com.startupintel.startup_intelligence_api.service.FundingHistoryService;

import java.util.List;

@RestController
@RequestMapping("/api/funding-history")
@CrossOrigin(origins = "http://localhost:5173")
public class FundingHistoryController {

	private final FundingHistoryService service;

	public FundingHistoryController(FundingHistoryService service) {
		this.service = service;
	}

	@GetMapping("/{startupName}")
	public List<FundingHistoryDTO> getFundingHistory(@PathVariable String startupName) {

		return service.getFundingHistory(startupName);
	}
}
