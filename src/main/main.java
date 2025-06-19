package main;

import maths.Conversion;
import modules.GetApi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String base = "";
        String screenDivider = "*".repeat(50);
        double answer;
        double converted;
        int option = 0;
        Conversion conversion = new Conversion();


        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(screenDivider);
            System.out.println("\tBienvenido al conversor de monedas");
            System.out.println(screenDivider);
            System.out.println("   Elige una opción");
            System.out.println("1)Dólar => Peso argentino \n2)Peso argentino => Dólar \n3)Dólar => Real brasileño \n4)Real brasileño => Dólar \n5)Dólar => Peso colombiano  \n6)Peso colombiano => Dólar \n7)Salir ");
            option = scanner.nextInt();
            System.out.println(screenDivider);
            switch (option){
                case 1:
                    base = "USD";
                    System.out.println("¿Que cantidad desea convertir?");
                    answer = scanner.nextDouble();
                    System.out.println(conversion.UsdToArg(answer,base));
                    break;
                case 2:
                    base ="ARS";
                    System.out.println("¿Que cantidad desea convertir?");
                    answer = scanner.nextDouble();
                    System.out.println(conversion.ArgToUsd(answer,base));
                    break;
                case 3:
                    base = "USD";
                    System.out.println("¿Que cantidad desea convertir?");
                    answer = scanner.nextDouble();
                    System.out.println(conversion.UsdToBrl(answer,base));
                    break;
                case 4:
                    base = "BRL";
                    System.out.println("¿Que cantidad desea convertir?");
                    answer = scanner.nextDouble();
                    System.out.println(conversion.BrlToUsd(answer,base));
                    break;
                case 5:
                    base = "USD";
                    System.out.println("¿Que cantidad desea convertir?");
                    answer = scanner.nextDouble();
                    System.out.println(conversion.UsdToCop(answer,base));
                    break;
                case 6:
                    base = "COP";
                    System.out.println("¿Que cantidad desea convertir?");
                    answer = scanner.nextDouble();
                    System.out.println(conversion.CopToUsd(answer,base));
                    break;
                case 7:
                    System.out.println("Saliendo...........");
                    System.out.println(screenDivider);
                    break;
                default:
                    System.out.println("Elige una opción valida");
                    break;
            }
        }while (option != 7);



    }
}
