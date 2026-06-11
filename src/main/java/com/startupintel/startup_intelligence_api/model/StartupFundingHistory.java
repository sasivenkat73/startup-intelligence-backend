package com.startupintel.startup_intelligence_api.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "startup_funding_history")
public class StartupFundingHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "startup_name")
    private String startupName;

    @Column(name = "funding_stage")
    private String fundingStage;

    @Column(name = "funding_amount")
    private String fundingAmount;

    private String investors;

    @Column(name = "funding_date")
    private LocalDate fundingDate;

    @Column(name = "source_url")
    private String sourceUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public StartupFundingHistory() {
    }

    public Long getId() {
        return id;
    }

    public String getStartupName() {
        return startupName;
    }

    public void setStartupName(String startupName) {
        this.startupName = startupName;
    }

    public String getFundingStage() {
        return fundingStage;
    }

    public void setFundingStage(String fundingStage) {
        this.fundingStage = fundingStage;
    }

    public String getFundingAmount() {
        return fundingAmount;
    }

    public void setFundingAmount(String fundingAmount) {
        this.fundingAmount = fundingAmount;
    }

    public String getInvestors() {
        return investors;
    }

    public void setInvestors(String investors) {
        this.investors = investors;
    }

    public LocalDate getFundingDate() {
        return fundingDate;
    }

    public void setFundingDate(LocalDate fundingDate) {
        this.fundingDate = fundingDate;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}