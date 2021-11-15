package kr.mmgg.CoronaWebService.service;

import kr.mmgg.CoronaWebService.domain.DomesticStatus;
import kr.mmgg.CoronaWebService.repository.CoronaStatusRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoronaStatusConfig {

    private final CoronaStatusRepository coronaStatusRepository;

    public CoronaStatusConfig(CoronaStatusRepository coronaStatusRepository) {
        this.coronaStatusRepository = coronaStatusRepository;
    }

    @Bean
    public CoronaStatusService coronaStatusService(){
        return new CoronaStatusServiceImpl(coronaStatusRepository);
    }
}
