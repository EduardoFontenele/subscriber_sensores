package br.com.subscriber_sensores.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class SensorDataDTO {
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

