package br.com.subscriber_sensores.repository;

import br.com.subscriber_sensores.entity.SensorDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDataRepository extends JpaRepository<SensorDataEntity, Long> {
}
