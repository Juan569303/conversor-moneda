package main;

import modules.GetApi;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String base = "";
        int option = 0;
        GetApi getApi = new GetApi();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Elige una opcion por favor");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    base = "USD";
                    break;
                case 2:
                    base ="COP";
                    break;
                case 3:
                    base = "BRL";
                    break;
                case 4:
                    base = "ARS";
                    break;
                case 5:
                    System.out.println("Saliendo.......");
                    break;
                default:
                    break;
            }
            if (option != 7){
                getApi.getValues(base);
            }
        }while (option != 7);



    }
}
