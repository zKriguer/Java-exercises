package edu.kriguer.secondweek;

import java.util.Arrays;
import java.util.Random;

public class Ex5_ArrayMultidimensional {
    public static void main(String[] args) {
        Random randomNumber = new Random();

        int[][] vetor = new int[4][4];

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                vetor[i][j] = randomNumber.nextInt(9);
                System.out.println(vetor[i][j]);
            }
        }

        System.out.println("Vetor/Matriz :");
        for (int[] linha : vetor
        ) {
            for (int ElementoDaColuna :
                    linha
            ) {
                System.out.print(ElementoDaColuna + " ");
            }
            System.out.println();
        }
    }
}
