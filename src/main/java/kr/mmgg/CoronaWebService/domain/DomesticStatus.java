package kr.mmgg.CoronaWebService.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class DomesticStatus {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long city_code;
    private String city_name;
    private String state_dt;
    private String state_time;
    private Long decide_cnt;
    private Long clear_cnt;
    private Long exam_cnt;
    private Long death_cnt;
    private Long care_cnt;
    private Long result_neg_cnt;
    private Long acc_exam_cnt;
    private Long acc_exam_comp_cnt;
    private Long acc_def_rate;
}
