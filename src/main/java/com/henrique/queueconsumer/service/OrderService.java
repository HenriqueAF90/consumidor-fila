package com.henrique.queueconsumer.service;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sqs.SqsClient;
import software.amazon.awssdk.services.sqs.model.SendMessageRequest;

@Service
public class OrderService {

    private final SqsClient sqsClient;

    public OrderService(SqsClient sqsClient) {
        this.sqsClient = sqsClient;
    }

    public void sendOrder(String mensage){
        String queueUrl = "http://localhost:4566/000000000000/order-queue";
        SendMessageRequest request = SendMessageRequest.builder()
                .queueUrl(queueUrl)
                .messageBody(mensage)
                .build();
        sqsClient.sendMessage(request);
    }
}

