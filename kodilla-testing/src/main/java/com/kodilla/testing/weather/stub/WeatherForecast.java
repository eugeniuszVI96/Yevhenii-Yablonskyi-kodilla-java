package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public Double calculateAverageTemperature() {

        double result = 0;
        if (temperatures.getTemperatures().size() == 0) {
            return null;
        }
        else {
            for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
                result = result + temperature.getValue();
            }
            return result / temperatures.getTemperatures().size();
        }
    }

    public Double calculateMedianTemperatures() {

        double median = 0;
        List<Double> temperaturesList = new ArrayList<>(temperatures.getTemperatures().values());
        if (temperaturesList.size() == 0) {
            return null;
        }
        else {
            Collections.sort(temperaturesList);

            int halfSize = temperaturesList.size() / 2;
            if (temperaturesList.size() % 2 == 0) {
                median = (temperaturesList.get(halfSize) + temperaturesList.get(halfSize - 1)) / 2;
            } else {
                median = temperaturesList.get(halfSize);
            }
            return median;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WeatherForecast that = (WeatherForecast) o;

        return temperatures.equals(that.temperatures);
    }

    @Override
    public int hashCode() {
        return temperatures.hashCode();
    }

    @Override
    public String toString() {
        return "WeatherForecast{" +
                "temperatures=" + temperatures +
                '}';
    }
}