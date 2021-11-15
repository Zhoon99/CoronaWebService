package kr.mmgg.CoronaWebService.controller;

import kr.mmgg.CoronaWebService.domain.DomesticStatus;
import kr.mmgg.CoronaWebService.repository.CoronaStatusRepository;
import kr.mmgg.CoronaWebService.service.CoronaStatusService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CoronaStatusController {

    private final CoronaStatusService coronaStatusService;

    public CoronaStatusController(CoronaStatusService coronaStatusService) {
        this.coronaStatusService = coronaStatusService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("d_status_list", coronaStatusService.getDomesticList());
        return "index";
    }
}
