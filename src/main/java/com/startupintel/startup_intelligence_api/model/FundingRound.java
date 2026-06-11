package com.startupintel.startup_intelligence_api.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "funding_rounds")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class FundingRound {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String startupName;

    private String fundingAmount;

    private String fundingStage;

    @Column(columnDefinition = "TEXT")
    private String investors;

    @Column(columnDefinition = "TEXT")
    private String articleUrl;

    private String articleTime;
}