package kr.mmgg.CoronaWebService.service;

import kr.mmgg.CoronaWebService.domain.CovidGraph;
import kr.mmgg.CoronaWebService.domain.CovidMap;
import kr.mmgg.CoronaWebService.domain.DomesticStatus;
import kr.mmgg.CoronaWebService.repository.CoronaStatusRepository;
import kr.mmgg.CoronaWebService.repository.CovidGraphRepository;
import kr.mmgg.CoronaWebService.repository.CovidMapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
public class CoronaStatusServiceImpl implements CoronaStatusService {

    public final CovidMapRepository covidMapRepository;
    public final CovidGraphRepository covidGraphRepository;

    public CoronaStatusServiceImpl(CovidMapRepository covidMapRepository, CovidGraphRepository covidGraphRepository) {
        this.covidMapRepository = covidMapRepository;
        this.covidGraphRepository = covidGraphRepository;
    }

    /**
     * 전체 목록 조회
     */
    @Override
    public List<CovidMap> getDomesticList() {
        return covidMapRepository.findAll();
    }

    @Override
    public Map<String, List<CovidGraph>> getDomesticGraph() {
        Map<String, List<CovidGraph>> graphValues = new HashMap<String, List<CovidGraph>>();
        //graphValues.put("graphDate", covidGraphRepository.findByDate());
        //graphValues.put("graphConfirmed", covidGraphRepository.fingByConfirmed_p());
        return graphValues;
    }

    @Override
    public void updateDomesticList() {

    }

    @Override
    public void updateDomesticGraph() {

    }


}