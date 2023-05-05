package com.example.bai_1.service;

public class CurrencyConversionService implements ICurrencyConversionService{
    @Override
    public double calculate(double money) {
        return money*23000;
    }
}
