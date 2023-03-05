package edu.kriguer.secondweek;

import java.util.Scanner;

public class Ex3_MaiorNumeroEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        int value = 0;
        int maior = 0;
        int soma = 0;

        do {
            System.out.println("Insira o " + (count + 1) + "º Número");
            value = scan.nextInt();

            if (value > maior) {
                maior = value;
            }
            ;
            count++;

            soma = soma + value;


        } while (count < 5);

        System.out.println("A média dos números inseridos é de: " + (soma / 5));
        System.out.println("O maior valor inserido é: " + maior);

    }
}
