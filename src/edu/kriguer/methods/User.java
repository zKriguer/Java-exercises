package edu.kriguer.methods;

public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está: " + (smartTv.status ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + (smartTv.canal != 0 ? smartTv.canal : "A tv está desligada"));
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("A TV está: " + (smartTv.status ? "Ligada" : "Desligada") + " Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("A TV está: " + (smartTv.status ? "Ligada" : "Desligada") + " Volume atual: " + smartTv.volume);

        System.out.println("================================================================");
        smartTv.mudarCanal(34);

        System.out.println("A TV está: " + (smartTv.status ? "Ligada" : "Desligada"));
        System.out.println("Canal atual: " + (smartTv.canal != 0 ? smartTv.canal : "A tv está desligada"));
        System.out.println("Volume atual: " + smartTv.volume);

    }
}
