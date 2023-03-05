package edu.kriguer.secondweek;

import java.util.Arrays;

public class Ex4_ArrayInverso {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, -7, 8};
        int j = 0;

        System.out.println("O vetor a ser invertido é : " + Arrays.toString(array));

        for (int i = array.length - 1; i >= 0; i--) {
            array[j] = array[i];
            j++;
        }
        
        System.out.println("O vetor após ser invertido ficou: " + Arrays.toString(array));
    }
}
