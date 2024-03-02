import conversordetemperatura.models.Celsius;
import conversordetemperatura.models.Fahrenheit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Separar em duas funções distintas o conversor de temperatura da parte que mostra isso ao usuário.

        Scanner scan = new Scanner(System.in);
        Celsius celsius = new Celsius();
        Fahrenheit fahrenheit = new Fahrenheit();

        int selectedOption = -1;
        while(selectedOption != 0){
            String optionsMenu = """
                (1) Converter de Celsius para Fahrenheit;
                (2) Converter de Fahrenheit para Celsius;
                (0) Fechar a aplicação;
                """;

            System.out.println(optionsMenu);

            System.out.print("Selecione a opção: ");
            selectedOption = scan.nextInt();
            double temperature;

            switch(selectedOption){
                case 1:
                    System.out.println("Você selecionou a opção 1");
                    System.out.print("Informe a temperatura em Celsius que deseja converter: ");
                    temperature = scan.nextDouble();
                    celsius.setTemperature(temperature);
                    System.out.println(celsius.temperatureConverter());
                    break;
                case 2:
                    System.out.println("Você selecionou a opção 2");
                    System.out.print("Informe a temperatura em Celsius que deseja converter: ");
                    temperature = scan.nextDouble();
                    fahrenheit.setTemperature(temperature);
                    System.out.println(fahrenheit.temperatureConverter());
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
}