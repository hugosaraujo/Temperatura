public class Main {
    public static void main(String[] args) {
        double temperaturaEmCelsius = 27.5;
        double temperaturaEmFahrenheit = ((temperaturaEmCelsius * 1.8) + 32);

        String textoTemperatura = """
                   Temperatura em Celsius: %.1f
                   Temperatura em Fahrenheit: %.1f
                """.formatted(temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(textoTemperatura);

    }
}
