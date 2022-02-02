package com.kodilla.good.patterns.challenges.allegro;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Thank you for your order. The seller will soon prepare your pack for shipment");
    }
}
