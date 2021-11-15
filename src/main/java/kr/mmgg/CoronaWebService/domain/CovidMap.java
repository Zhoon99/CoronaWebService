package kr.mmgg.CoronaWebService.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class CovidMap {

    @Id @GeneratedValue
    private Long city_code;
    private Date date;
    private String city_name;
    private Long confirmed_p;
}
