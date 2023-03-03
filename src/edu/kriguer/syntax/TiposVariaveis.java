package edu.kriguer.syntax;

public class TiposVariaveis {
    public static void main(String[] args) {
        // String/cadeia de caracteres;
        String meuNome = "Kriguer Freitas";

        // double/não-inteiros, podendo ser float com a convenção F ao final;
        double salarioMinimo = 1320.00;

        short numeroCurto = 1;
        int numero = numeroCurto;
        // sem o (SHORT) vai ocasionar um erro pois o numero sendo int,
        // pode armazenar valores além da capacidade de short
        short numeroCurto2 = (short) numero;

        //Implementação de constantes
        int x = 5;
        x = 10; //Reatribuição permitida;
        System.out.println(x);

        final double PI = 3.14;
        // PI = 10.75; // Reatribuição negada pois pi é uma constante ou "final";
    }
}
