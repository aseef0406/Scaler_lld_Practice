package com.aseef.behavioural.observer;

public class SendingTweet implements BitCoinPriceObserver{
    @Override
    public void doAction() {
        System.out.println("Sent a Tweet");
    }
}
