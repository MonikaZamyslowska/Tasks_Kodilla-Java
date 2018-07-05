package com.kodilla.good.patterns.challenges;

public class OrderMain {
    public static void main(String[] arg) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retriever();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new BookOrderRepository(),
                new BookInformationService());
        orderProcessor.process(orderRequest);
    }
}
