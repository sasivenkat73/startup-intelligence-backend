package com.startupintel.startup_intelligence_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.startupintel.startup_intelligence_api.model.FundingRound;
import java.util.List;

public interface FundingRoundRepository extends JpaRepository<FundingRound, Long> {

	long countDistinctByStartupNameIsNotNull();

	// ADD THIS NEW NATIVE QUERY
	@Query(value = """
			SELECT
			    startup_name,
			    funding_amount,
			    funding_stage,
			    investors,
			    sector
			FROM funding_rounds
			ORDER BY article_time DESC
			""", nativeQuery = true)
	List<Object[]> getLatestFunding();

	@Query(value = """
			select startup_name, funding_amount, funding_stage, investors, sector from funding_rounds order by article_time asc
			""", nativeQuery = true)
	List<Object[]> getLatestFundingOldToNew();

	@Query(value = """
			select sector, count(*) as total from funding_rounds group by sector order by total desc
			""", nativeQuery = true)
	List<Object[]> getSectors();

	@Query(value = """

			SELECT *

			FROM funding_rounds

			WHERE

			(
			COALESCE(:sectors,NULL) IS NULL
			OR sector IN (:sectors)
			)

			AND

			(
			COALESCE(:stages,NULL) IS NULL
			OR funding_stage IN (:stages)
			)

			ORDER BY article_time DESC

			""",

			nativeQuery = true)

	List<FundingRound> filterFunding(

			@Param("sectors") List<String> sectors,

			@Param("stages") List<String> stages

	);

}
