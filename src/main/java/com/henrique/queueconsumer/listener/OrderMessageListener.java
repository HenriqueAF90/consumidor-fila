package com.henrique.queueconsumer.listener;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class OrderMessageListener {

    @SqsListener("order-queue")
    public void listen(String message) {
        System.out.println("📩 Mensagem recebida da fila: " + message);
    }
}
