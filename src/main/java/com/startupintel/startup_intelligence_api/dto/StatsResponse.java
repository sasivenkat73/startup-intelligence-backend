package com.startupintel.startup_intelligence_api.dto;

public class StatsResponse {

    private Long totalFundingRoundsare;
    private Long totalStartups;

    public StatsResponse(
        Long totalFundingRoundsare,
        Long totalStartups
    ){
        this.totalFundingRoundsare=totalFundingRoundsare;
        this.totalStartups=totalStartups;
    }

    public Long getTotalFundingRounds(){
        return totalFundingRoundsare;
    }

    public Long getTotalStartups(){
        return totalStartups;
    }

}