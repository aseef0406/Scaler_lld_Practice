package com.aseef.behavioural.observer;

public class SendingText implements BitCoinPriceObserver{
    @Override
    public void doAction() {
        System.out.println("Sent a Text Message");
    }
}
