package com.startupintel.startup_intelligence_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "startup_profiles")
public class StartupProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "startup_name")
    private String startupName;

    @Column(name = "website")
    private String website;

    @Column(name = "about_text", columnDefinition = "TEXT")
    private String aboutText;

    @Column(name = "ai_summary", columnDefinition = "TEXT")
    private String aiSummary;
    
    @Column(name="founders")
    private String founders;

    @Column(name="revenue")
    private String revenue;

    @Column(name="sector")
    private String sector;

    @Column(name="current_investment")
    private String currentInvestment;

    @Column(name="investors")
    private String investors;

    @Column(name="problem_statement")
    private String problemStatement;

    @Column(name="solution")
    private String solution;

    @Column(name="market_share")
    private String marketShare;

    @Column(name="parent_company")
    private String parentCompany;

    @Column(name="business_model")
    private String businessModel;

    @Column(name="lead_investors")
    private String leadInvestors;

    // Constructors

    public String getFounders() {
		return founders;
	}

	public void setFounders(String founders) {
		this.founders = founders;
	}

	public String getRevenue() {
		return revenue;
	}

	public void setRevenue(String revenue) {
		this.revenue = revenue;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCurrentInvestment() {
		return currentInvestment;
	}

	public void setCurrentInvestment(String currentInvestment) {
		this.currentInvestment = currentInvestment;
	}

	public String getInvestors() {
		return investors;
	}

	public void setInvestors(String investors) {
		this.investors = investors;
	}

	public String getProblemStatement() {
		return problemStatement;
	}

	public void setProblemStatement(String problemStatement) {
		this.problemStatement = problemStatement;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public String getMarketShare() {
		return marketShare;
	}

	public void setMarketShare(String marketShare) {
		this.marketShare = marketShare;
	}

	public String getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(String parentCompany) {
		this.parentCompany = parentCompany;
	}

	public String getBusinessModel() {
		return businessModel;
	}

	public void setBusinessModel(String businessModel) {
		this.businessModel = businessModel;
	}

	public String getLeadInvestors() {
		return leadInvestors;
	}

	public void setLeadInvestors(String leadInvestors) {
		this.leadInvestors = leadInvestors;
	}

	public StartupProfile() {
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartupName() {
        return startupName;
    }

    public void setStartupName(String startupName) {
        this.startupName = startupName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAboutText() {
        return aboutText;
    }

    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

    public String getAiSummary() {
        return aiSummary;
    }

    public void setAiSummary(String aiSummary) {
        this.aiSummary = aiSummary;
    }
}