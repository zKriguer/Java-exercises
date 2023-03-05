package edu.kriguer.secondweek;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {

        int nota;

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma nota entre 0 e 10");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Insira uma nota válida: ");
            nota = scan.nextInt();
        }

        System.out.println("Obrigado pela sua avaliação!");

    }
}
