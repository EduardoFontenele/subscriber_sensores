package br.com.subscriber_sensores.mapper;

import br.com.subscriber_sensores.dto.SensorDataDTO;
import br.com.subscriber_sensores.entity.SensorDataEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SensorDataMapper {
    SensorDataEntity toEntity(SensorDataDTO sensorDataDTO);
    SensorDataDTO toDto(SensorDataEntity sensorDataDTO);
}
