package br.com.subscriber_sensores.service;

import br.com.subscriber_sensores.config.RabbitMQConfig;
import br.com.subscriber_sensores.dto.SensorDataDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RabbitMQConsumer implements MessageConsumer {
    private final ObjectMapper objectMapper;
    private final SensorDataService service;

    @Override
    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void consume(String message) {;
        var waterSensorDataObject = convertStringToObject(message);
        service.saveNewData(waterSensorDataObject);
    }

    private SensorDataDTO convertStringToObject(String message) {
        try {
            return objectMapper.readValue(message, SensorDataDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
