package edu.kriguer.methods;

public class SmartTv {
    boolean status = false;
    int canal;
    int volume = 30;

    public void ligar() {
        System.out.println("Usuário ligou a TV");
        status = true;
        canal = 1;
    }

    public void desligar() {
        System.out.println("Usuário desligou a TV");
        status = false;
        canal = 0;
    }

    public void aumentarVolume() {
        System.out.println("Usuário aumentou o volume");
        volume++;
    }

    public void diminuirVolume() {
        System.out.println("Usuário diminuiu o volume");
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        System.out.println("Mudando canal de: " + canal + " para: " + novoCanal);
        canal = novoCanal;
    }
}
