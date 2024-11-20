package br.com.subscriber_sensores.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class SensorDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double waterLevel;
    private double waterTemperature;
    private double airHumidity;
    private double flowRate;
    private double barometricPressure;
    private String sensorStatus;
    private Instant timestamp;
    private double latitude;
    private double longitude;
}
