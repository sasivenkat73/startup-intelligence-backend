package com.startupintel.startup_intelligence_api.repository;

import com.startupintel.startup_intelligence_api.model.StartupFundingHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StartupFundingHistoryRepository
        extends JpaRepository<StartupFundingHistory, Long> {

    List<StartupFundingHistory> findByStartupNameIgnoreCaseOrderByFundingDateAsc(String startupName);
}