package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<Integer, Double>();

        // dummy data
        stubResult.put(0, 0.25);
        stubResult.put(1, 26.2);
        stubResult.put(2, 18.3);
        stubResult.put(3, 32.4);
        stubResult.put(4, 26.1);

        return stubResult;
    }
}
