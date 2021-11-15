package kr.mmgg.CoronaWebService.service;

import kr.mmgg.CoronaWebService.domain.DomesticStatus;
import kr.mmgg.CoronaWebService.repository.CoronaStatusRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CoronaStatusServiceImpl implements CoronaStatusService {

    public final CoronaStatusRepository coronaStatusRepository;

    public CoronaStatusServiceImpl(CoronaStatusRepository coronaStatusRepository) {
        this.coronaStatusRepository = coronaStatusRepository;
    }

    /**
     * 전체 목록 조회
     */
    @Override
    public List<DomesticStatus> getDomesticList() {
        return coronaStatusRepository.findAll();
    }

    @Override
    public List<DomesticStatus> getDomesticGraph() {
        return null;
    }

    @Override
    public void updateDomesticList() {

    }

    @Override
    public void updateDomesticGraph() {

    }
}
