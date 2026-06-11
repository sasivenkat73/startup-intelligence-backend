package com.startupintel.startup_intelligence_api.dto;

public class FundingRoundFeedDto {
    private String startupName;
    private String fundingAmount;
    private String fundingStage;
    private String investors;
    private String sector;

    // Constructor matching your SQL SELECT order
    public FundingRoundFeedDto(String startupName, String fundingAmount, String fundingStage, String investors, String sector) {
        this.startupName = startupName;
        this.fundingAmount = fundingAmount;
        this.fundingStage = fundingStage;
        this.investors = investors;
        this.sector = sector;
    }

    // Getters and Setters
    public String getStartupName() { return startupName; }
    public void setStartupName(String startupName) { this.startupName = startupName; }

    public String getFundingAmount() { return fundingAmount; }
    public void setFundingAmount(String fundingAmount) { this.fundingAmount = fundingAmount; }

    public String getFundingStage() { return fundingStage; }
    public void setFundingStage(String fundingStage) { this.fundingStage = fundingStage; }

    public String getInvestors() { return investors; }
    public void setInvestors(String investors) { this.investors = investors; }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }
}
