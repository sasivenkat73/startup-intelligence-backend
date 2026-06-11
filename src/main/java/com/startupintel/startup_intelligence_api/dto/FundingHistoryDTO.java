package com.startupintel.startup_intelligence_api.dto;

import java.time.LocalDate;

public class FundingHistoryDTO {

	private String fundingStage;

	private String fundingAmount;

	private String investors;

	private LocalDate fundingDate;

	public FundingHistoryDTO() {
	}

	public FundingHistoryDTO(String fundingStage, String fundingAmount, String investors, LocalDate fundingDate) {

		this.fundingStage = fundingStage;
		this.fundingAmount = fundingAmount;
		this.investors = investors;
		this.fundingDate = fundingDate;
	}

	public String getFundingStage() {
		return fundingStage;
	}

	public String getFundingAmount() {
		return fundingAmount;
	}

	public String getInvestors() {
		return investors;
	}

	public LocalDate getFundingDate() {
		return fundingDate;
	}
}