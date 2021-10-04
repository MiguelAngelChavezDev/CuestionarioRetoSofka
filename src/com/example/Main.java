package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ronda # 1 Nivel Facil
        Pregunta[] preguntasFacil1;
        preguntasFacil1 = new Pregunta[5];
        preguntasFacil1[0] = new Pregunta("¿Cuál es la fórmula química del agua?\n\n", "a) H2O\n", "b) CO2\n", "c) HO2\n", "d) CH2\n", "1");
        preguntasFacil1[1] = new Pregunta("¿Qué es un gecko?\n\n", "a) Un Instrumento Musical\n", "b) Un Reptil\n", "c) Un Astro\n", "d) Un Artrópodo\n", "b");
        preguntasFacil1[2] = new Pregunta("¿Cuál órgano celular se encarga de producir energía en la célula?\n\n", "a) Ribosoma\n", "b) Libosoma\n", "c) Mitocondria\n", "d) Aparato de Golgi\n", "c");
        preguntasFacil1[3] = new Pregunta("¿Quién escribió Cien años de soledad?\n\n", "a) Rafael Pombo\n", "b) Jorge Isaacs\n", "c) José Asunción Silva\n", "d) Gabriel García Márquez\n", "d");
        preguntasFacil1[4] = new Pregunta("¿El conjunto de instrucciones ordenadas para ejecutar tareas ¿Se le llama?\n\n", "a) Algoritmo\n", "b) Autómata\n", "c) Ordenador\n", "d) Código\n", "a");

        //Declaring some variables and range of random questions
        int max = 4;
        int min = 0;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range);

        //Requesting user data
        System.out.println("Ingrese el nombre del concursante: ");
        String name = sc.nextLine();
        User user1 = new User(name);
        System.out.println(user1.name);
        Premios premioUsuario = new Premios();

        //Decorating
        System.out.println("\n        BIENVENIDO         \n");
        System.out.println("        ***********         ");
        System.out.println("         RONDA # 1         ");
        System.out.println("        ***********         \n");

        //Printing a random question
        Pregunta preguntaActual = preguntasFacil1[rand];
        System.out.println(preguntaActual);

        //Requesting user data
        System.out.println("Elija su respuesta: ");
        String resUser = sc.nextLine();

        //Conditionals
        if (resUser.length() == 1) {
            if (preguntaActual.getRespuestaCorrecta().equals(resUser)) {
                System.out.println("RESPUESTA CORRECTA");
                System.out.println("HAZ AVANZADO A LA SIGUIENTE RONDA");
                premioUsuario.acumulado = premioUsuario.premioNivel1;
                System.out.println("TU PUNTAJE ACUMULADO ES DE " + premioUsuario.acumulado);
            } else {
                System.out.println("JUEGO TERMINADO");
                premioUsuario.acumulado = 0;
                System.exit(0);
            }
        } else {
            System.out.println("Debe ingresar solamente letras a, b, c, d");
        }
    }
}