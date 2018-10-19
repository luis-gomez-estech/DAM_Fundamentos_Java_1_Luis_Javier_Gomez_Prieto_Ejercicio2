package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner (System.in);

        System.out.println("Area del circulo: A=PI*r^2");
        System.out.println("Introduce el valor del radio");
        double radio = escaner.nextDouble(); // Uso double por si queremos instruducir decimales

        // Aqui calculo el area, para el numero PI, como no sabia como se escribe en java
        // lo he buscado por google, de ahi que haya puesto Math.PI

        double resultado = Math.PI*(Math.pow(radio,radio)); // Uso double para imprimir decimales

        // Aqui es el mismo calculo pero no he usado Math.pow sino radio*radio

        double resultado2 = Math.PI*(radio*radio);


        System.out.println("El área del circulo es " + resultado);
        System.out.println("El área del circulo es " + resultado2);



    }


}

