package com.startupintel.startup_intelligence_api.service;



import org.springframework.stereotype.Service;

import com.startupintel.startup_intelligence_api.dto.FundingHistoryDTO;
import com.startupintel.startup_intelligence_api.model.StartupFundingHistory;
import com.startupintel.startup_intelligence_api.repository.StartupFundingHistoryRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FundingHistoryService {

    private final StartupFundingHistoryRepository repository;

    public FundingHistoryService(
            StartupFundingHistoryRepository repository
    ) {
        this.repository = repository;
    }

    public List<FundingHistoryDTO>
    getFundingHistory(String startupName) {

        List<StartupFundingHistory> history =
                repository.findByStartupNameIgnoreCaseOrderByFundingDateAsc(
                        startupName
                );

        return history.stream()
                .map(item ->
                        new FundingHistoryDTO(
                                item.getFundingStage(),
                                item.getFundingAmount(),
                                item.getInvestors(),
                                item.getFundingDate()
                        )
                )
                .collect(Collectors.toList());
    }
}