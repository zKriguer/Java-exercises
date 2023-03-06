package edu.kriguer.refattribution;

public class Main {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;


        //EM TIPOS PRIMITIVOS É COPIADO UM VALOR E NAO SUA REFERENCIA DE MEMORIA
        System.out.println("intA = " + intA + " intB = " + intB); // intA = 1 intB = 1
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB); // intA = 1 intB = 1


        MyObject objA = new MyObject(1);
        MyObject objB = objA;

        //PORÉM PARA OBJETOS É COPIADO A REFERENCIA EM MEMÓRIA
        System.out.println("objA = " + objA + " objB = " + objB); // objA = MyObject{num=1} objB = MyObject{num=1}
        objA.setNum(2);
        System.out.println("objA = " + objA + " objB = " + objB); // objA = MyObject{num=2} objB = MyObject{num=2}
    }
}
