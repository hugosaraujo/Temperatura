package conversordetemperatura.models;

public class Fahrenheit implements StandardTemperatureConverter {
    private double temperature;

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    @Override
    public String temperatureConverter() {
        double temperatureConverted = ((temperature - 32) / 1.8);

        return"""
                   Temperatura em Fahrenheit: %.2fº
                   Temperatura em Celsius: %.2fº
                """.formatted(temperature, temperatureConverted);
    }
}
