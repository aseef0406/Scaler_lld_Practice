package com.aseef.behavioural.observer;

public class SendingEmail implements BitCoinPriceObserver{
    @Override
    public void doAction() {
        System.out.println("Sent a Email");
    }
}
