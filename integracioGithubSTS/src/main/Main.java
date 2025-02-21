package main;

import entities.ObjectA;
import entities.ObjectB;
import entities.ObjectC;

public class Main {
    public static void main(String[] args) {
        ObjectA objA = new ObjectA(1, "Pepito", "Grillo");
        ObjectB objB = new ObjectB(2, "Alfredo", 30);
        ObjectC objC = new ObjectC(3, "Ana", "Valencia");

        System.out.println(objA);
        System.out.println(objB);
        System.out.println(objC);

        // Nuevo objeto agregado
        ObjectC objC2 = new ObjectC(4, "Antonia", "Almería");
        System.out.println(objC2);
        
        ObjectB objB2 = new ObjectB(2, "Loren", 46);
        System.out.println(objB2);
    }
}
