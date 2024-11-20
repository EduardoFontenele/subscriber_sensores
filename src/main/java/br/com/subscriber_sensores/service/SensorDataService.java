package br.com.subscriber_sensores.service;

import br.com.subscriber_sensores.dto.SensorDataDTO;
import br.com.subscriber_sensores.mapper.SensorDataMapper;
import br.com.subscriber_sensores.repository.SensorDataRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class SensorDataService {
    private final SensorDataRepository repository;
    private final SensorDataMapper mapper;

    public void saveNewData(SensorDataDTO sensorDataDTO) {
        var sensorDataEntity = mapper.toEntity(sensorDataDTO);

        try {
            repository.save(sensorDataEntity);
        } catch (Exception ex) {
            log.error(ex.getMessage());
        }
    }

    public List<SensorDataDTO> getData() {
        var allData = repository.findAll();

        return allData.stream()
                .map(mapper::toDto)
                .toList();
    }
}
