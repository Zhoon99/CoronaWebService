package kr.mmgg.CoronaWebService.service;

import kr.mmgg.CoronaWebService.domain.CovidGraph;
import kr.mmgg.CoronaWebService.domain.DomesticStatus;
import kr.mmgg.CoronaWebService.repository.CoronaStatusRepository;
import kr.mmgg.CoronaWebService.repository.CovidGraphRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Transactional
public class CoronaStatusServiceImpl implements CoronaStatusService {

    public final CoronaStatusRepository coronaStatusRepository;
    public final CovidGraphRepository covidGraphRepository;

    public CoronaStatusServiceImpl(CoronaStatusRepository coronaStatusRepository, CovidGraphRepository covidGraphRepository) {
        this.coronaStatusRepository = coronaStatusRepository;
        this.covidGraphRepository = covidGraphRepository;
    }

    /**
     * 전체 목록 조회
     */
    @Override
    public List<DomesticStatus> getDomesticList() {
        return coronaStatusRepository.findAll();
    }

    @Override
    public Map<String, List<CovidGraph>> getDomesticGraph() {
        Map<String, List<CovidGraph>> graphValues = new HashMap<String, List<CovidGraph>>();
        graphValues.put("graphDate", covidGraphRepository.findByDate());
        graphValues.put("graphConfirmed", covidGraphRepository.fingByConfirmed_p());
        return graphValues;
    }

    @Override
    public void updateDomesticList() {

    }

    @Override
    public void updateDomesticGraph() {

    }


}
