package edu.kriguer.secondweek;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeDeNumeros;
        int value = 0;
        int numerosImpares = 0, numerosPares = 0;

        System.out.println("Quantos números deseja inserir? ");
        quantidadeDeNumeros = scan.nextInt();


        for (int contador = 0; contador < quantidadeDeNumeros; contador++) {

            System.out.println("Insira o " + (contador + 1) + "º Número");
            value = scan.nextInt();
            if (value % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        System.out.println("A quantidade de números pares inserida foi de: " + numerosPares + "\n" + "A quantidade de números impares inserida foi de: " + numerosImpares);

    }
}
