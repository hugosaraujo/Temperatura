package conversordetemperatura.models;

public class Celsius implements StandardTemperatureConverter {
    private double temperature;

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    @Override
    public String temperatureConverter() {
        double temperatureConverted = ((temperature * 1.8) + 32);
       return """
                   Temperatura em Celsius: %.1fº
                   Temperatura em Fahrenheit: %.1fº
                """.formatted(temperature, temperatureConverted);
    }
}
