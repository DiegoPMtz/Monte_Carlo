package com.mycompany.monte_carlo;

import java.util.Scanner;

public class interfaz {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        operaciones ec1 = new operaciones(1,2,30);

        System.out.println("Ingresa el Argumento seguido de la potencia");
        String arg = read.next();
        String pot = read.next();

        System.out.println("Ingresa el valor de la variable independiente");
        int indep = read.nextInt();

        ec1.ecuacion(arg,pot,indep);

        System.out.println("Tu ecuacion es: f(x) = " + ec1.ecuacion);

        ec1.aleatorios();
        int j = 0;
        for (int i = 0; i < 10; i += 2) {
            ec1.X1(ec1.f[i],ec1.f[i + 1],j);
            ec1.Y(ec1.f[i + 1],ec1.m, j);
            j++;
        }

        for (int i = 0; i < 5; i++) {
            ec1.FX();
            System.out.print("f(x" + (i + 1) + ")= " + String.format("%.4f", ec1.fx[i]));
            if (ec1.y[i] <= ec1.fx[i]) {
                System.out.println("\tSI");
            } else {
                System.out.println("\tNO");
            }
        }

    }
}
