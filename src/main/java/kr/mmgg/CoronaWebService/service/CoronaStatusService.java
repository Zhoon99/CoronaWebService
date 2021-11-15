package kr.mmgg.CoronaWebService.service;

import kr.mmgg.CoronaWebService.domain.CovidGraph;
import kr.mmgg.CoronaWebService.domain.DomesticStatus;

import java.util.List;
import java.util.Map;

public interface CoronaStatusService {

    List<DomesticStatus> getDomesticList();

    Map<String, List<CovidGraph>> getDomesticGraph();

    void updateDomesticList();

    void updateDomesticGraph();
}
