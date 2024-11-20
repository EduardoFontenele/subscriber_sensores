package br.com.subscriber_sensores.controller;

import br.com.subscriber_sensores.dto.SensorDataDTO;
import br.com.subscriber_sensores.service.SensorDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class WaterDataController {
    private final SensorDataService service;

    @GetMapping("/api/v1/sensor-data")
    public List<SensorDataDTO> getAllData() {
        return service.getData();
    }
}
