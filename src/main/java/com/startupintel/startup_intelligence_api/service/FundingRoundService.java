package com.startupintel.startup_intelligence_api.service;

import org.springframework.stereotype.Service;
import com.startupintel.startup_intelligence_api.repository.FundingRoundRepository;
import com.startupintel.startup_intelligence_api.dto.FundingRoundFeedDto;
import com.startupintel.startup_intelligence_api.model.FundingRound;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FundingRoundService {

    private final FundingRoundRepository repository;

    // Constructor Injection
    public FundingRoundService(FundingRoundRepository repository) {
        this.repository = repository;
    }

    public List<FundingRoundFeedDto> getLatestFundingFeed(boolean isAsc) {
    	List<Object[]> rawData ;
    	if(isAsc) {
    		rawData = repository.getLatestFundingOldToNew();
    	}else {
    		rawData = repository.getLatestFunding();    		
    	}
        
        // Map the raw database columns into clean DTO objects safely
        return rawData.stream().map(row -> new FundingRoundFeedDto(
            row[0] != null ? row[0].toString() : "",
            row[1] != null ? row[1].toString() : "",
            row[2] != null ? row[2].toString() : "",
            row[3] != null ? row[3].toString() : "",
            row[4] != null ? row[4].toString() : ""
        )).collect(Collectors.toList());
    }

	public List<Object []>  getTrendingSectors() {
		// TODO Auto-generated method stub
		return repository.getSectors();
	}

	public List<FundingRound> filterFunding(

			List<String> sectors,
			List<String> stages ){
			return repository.filterFunding(sectors,stages);
			}
}
