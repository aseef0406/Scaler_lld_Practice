package com.aseef.behavioural.observer;

public class Client {
    public static void main(String[] args) {
        BitCoinInfo bitCoinInfo = new BitCoinInfo();
        bitCoinInfo.addBitCoinPriceObserver(new SendingEmail());
        bitCoinInfo.addBitCoinPriceObserver(new SendingText());
        bitCoinInfo.addBitCoinPriceObserver(new SendingTweet());
        bitCoinInfo.setName("BitCoin");
        bitCoinInfo.setPrice(100);

        bitCoinInfo.setPrice(150);
    }
}
