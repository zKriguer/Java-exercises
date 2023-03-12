package edu.kriguer.filas;

public class Main {

    public static void main(String[] args) {
        Fila myQueue = new Fila();

        myQueue.enqueue(new No("primeiro"));
        myQueue.enqueue(new No("segundo"));
        myQueue.enqueue(new No("terceiro"));
        myQueue.enqueue(new No("quarto"));

        System.out.println(myQueue); // [No{objeto=quarto}]---->[No{objeto=terceiro}]---->[No{objeto=segundo}]---->[No{objeto=primeiro}]---->null

        System.out.println(myQueue.dequeue()); // No{object=primeiro} remove o primeiro e retorna;

        System.out.println(myQueue); // [No{objeto=quarto}]---->[No{objeto=terceiro}]---->[No{objeto=segundo}]---->null

        myQueue.enqueue(new No("Ultimo")); // adiciona a ultima posição da fila

        System.out.println(myQueue); // [No{objeto=Ultimo}]---->[No{objeto=quarto}]---->[No{objeto=terceiro}]---->[No{objeto=segundo}]---->null

        System.out.println(myQueue.first()); // No{object=segundo} retorna o primeiro mas não remove;
    }
}
