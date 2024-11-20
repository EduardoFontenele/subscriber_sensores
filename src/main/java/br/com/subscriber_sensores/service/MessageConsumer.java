package br.com.subscriber_sensores.service;

public interface MessageConsumer {
    void consume(String message);
}
