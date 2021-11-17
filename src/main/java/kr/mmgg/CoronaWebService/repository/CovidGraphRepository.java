package kr.mmgg.CoronaWebService.repository;

import kr.mmgg.CoronaWebService.domain.CovidGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface CovidGraphRepository extends JpaRepository<CovidGraph, Long> {

    List<CovidGraph> findByDate(String string);

    //List<CovidGraph> fingByConfirmed_p(String string);
}
