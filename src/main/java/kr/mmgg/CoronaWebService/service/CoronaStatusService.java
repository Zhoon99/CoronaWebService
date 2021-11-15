package kr.mmgg.CoronaWebService.service;

import kr.mmgg.CoronaWebService.domain.DomesticStatus;

import java.util.List;

public interface CoronaStatusService {

    List<DomesticStatus> getDomesticList();

    List<DomesticStatus> getDomesticGraph();

    void updateDomesticList();

    void updateDomesticGraph();
}
