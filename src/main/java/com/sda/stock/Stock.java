package com.sda.stock;

public class Stock {
    private String simbol;
    private String stoc;
    private double closingPrice;
    private double currentPrice;

    public Stock(String simbol, String stoc) {
        this.simbol = simbol;
        this.stoc = stoc;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return (this.currentPrice-this.closingPrice)/this.closingPrice;
    }
}
