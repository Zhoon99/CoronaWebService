package kr.mmgg.CoronaWebService.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class CovidData {

    private Date date;
    @Id
    private String confirmed_p;
    private String recov_p;
    private String death_p;
}
