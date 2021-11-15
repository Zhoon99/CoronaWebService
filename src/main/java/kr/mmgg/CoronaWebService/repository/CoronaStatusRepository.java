package kr.mmgg.CoronaWebService.repository;

import kr.mmgg.CoronaWebService.domain.DomesticStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoronaStatusRepository extends JpaRepository<DomesticStatus, Long>{
}