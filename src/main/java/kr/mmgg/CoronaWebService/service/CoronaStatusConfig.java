package kr.mmgg.CoronaWebService.service;

import kr.mmgg.CoronaWebService.domain.DomesticStatus;
import kr.mmgg.CoronaWebService.repository.CoronaStatusRepository;
import kr.mmgg.CoronaWebService.repository.CovidGraphRepository;
import kr.mmgg.CoronaWebService.repository.CovidMapRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoronaStatusConfig {

    public final CovidMapRepository covidMapRepository;
    public final CovidGraphRepository covidGraphRepository;

    public CoronaStatusConfig(CovidMapRepository covidMapRepository, CovidGraphRepository covidGraphRepository) {
        this.covidMapRepository = covidMapRepository;
        this.covidGraphRepository = covidGraphRepository;
    }

    @Bean
    public CoronaStatusService coronaStatusService(){
        return new CoronaStatusServiceImpl(covidMapRepository, covidGraphRepository);
    }
}