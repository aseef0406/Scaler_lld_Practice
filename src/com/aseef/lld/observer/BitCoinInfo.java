package com.aseef.behavioural.observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BitCoinInfo {
    private String name;
    private int price;

    List<BitCoinPriceObserver> bitCoinPriceObserverList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        System.out.println(this.name+"'s Price is updated: $"+this.price);
        for(BitCoinPriceObserver observer:bitCoinPriceObserverList){
            observer.doAction();
        }
    }

    public void removeBitCoinPriceObserver(BitCoinPriceObserver observer) {
         bitCoinPriceObserverList.remove(observer);
    }

    public void addBitCoinPriceObserver(BitCoinPriceObserver observer) {
        this.bitCoinPriceObserverList.add(observer);
    }

}
