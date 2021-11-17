package kr.mmgg.CoronaWebService.repository;

import kr.mmgg.CoronaWebService.domain.CovidMap;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CovidMapRepository extends JpaRepository<CovidMap, Long> {
}
