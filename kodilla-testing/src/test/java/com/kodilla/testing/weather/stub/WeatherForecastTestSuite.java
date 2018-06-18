package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub() {
        // Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);
        // When
        int quantityOfSensor = weatherForecast.calculateForecast().size();
        // Then
        Assert.assertEquals(5, quantityOfSensor);
    }
}
