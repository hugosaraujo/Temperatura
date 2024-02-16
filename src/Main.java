import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String optionsMenu = """
                (1) Converter de Celsius para Fahrenheit;
                (2) Converter de Fahrenheit para Celsius;
                (0) Fechar a aplicação;
                """;

        System.out.println(optionsMenu);

        System.out.print("Selecione a opção: ");
        int selectedOption = scan.nextInt();
        double temperatureInCelsius;
        double temperatureInFahrenheit;

        switch(selectedOption){
            case 1:
                System.out.println("Você selecionou a opção 1");
                System.out.print("Informe a temperatura em Celsius que deseja converter: ");
                temperatureInCelsius = scan.nextDouble();

                temperatureInFahrenheit = ((temperatureInCelsius * 1.8) + 32);

                String fahrenheitTemperatureText = """
                   Temperatura em Celsius: %.1fº
                   Temperatura em Fahrenheit: %.1fº
                """.formatted(temperatureInCelsius, temperatureInFahrenheit);

                System.out.println(fahrenheitTemperatureText);
                break;
            case 2:
                System.out.println("Você selecionou a opção 2");
                System.out.print("Informe a temperatura em Celsius que deseja converter: ");
                temperatureInFahrenheit = scan.nextDouble();

                temperatureInCelsius = ((temperatureInFahrenheit - 32) / 1.8);

                String celsiusTemperatureText = """
                   Temperatura em Fahrenheit: %.1fº
                   Temperatura em Celsius: %.1fª
                """.formatted(temperatureInFahrenheit, temperatureInCelsius);

                System.out.println(celsiusTemperatureText);
                break;
            case 0:
                System.out.println("Você selecionou a opção 0");
                System.out.println("Fechando a aplicação...");
                break;
            default:
                System.out.println("Essa não é uma opção válida");
                break;
        }
    }
}