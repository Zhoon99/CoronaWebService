package kr.mmgg.CoronaWebService.service;

import kr.mmgg.CoronaWebService.domain.DomesticStatus;
import kr.mmgg.CoronaWebService.repository.CoronaStatusRepository;
import kr.mmgg.CoronaWebService.repository.CovidGraphRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoronaStatusConfig {

    public final CoronaStatusRepository coronaStatusRepository;
    public final CovidGraphRepository covidGraphRepository;

    public CoronaStatusConfig(CoronaStatusRepository coronaStatusRepository, CovidGraphRepository covidGraphRepository) {
        this.coronaStatusRepository = coronaStatusRepository;
        this.covidGraphRepository = covidGraphRepository;
    }

    @Bean
    public CoronaStatusService coronaStatusService(){
        return new CoronaStatusServiceImpl(coronaStatusRepository, covidGraphRepository);
    }
}
