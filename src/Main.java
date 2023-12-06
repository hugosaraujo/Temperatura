import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius que deseja converter: ");
        double temperaturaEmCelsius = leitura.nextDouble();

        double temperaturaEmFahrenheit = ((temperaturaEmCelsius * 1.8) + 32);

        String textoTemperatura = """
                   Temperatura em Celsius: %.1f
                   Temperatura em Fahrenheit: %.1f
                """.formatted(temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(textoTemperatura);
    }
}