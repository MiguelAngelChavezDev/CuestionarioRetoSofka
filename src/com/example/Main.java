package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ronda # 1 Nivel Facil
        Pregunta[] preguntasFacil1;
        preguntasFacil1 = new Pregunta[5];
        preguntasFacil1[0] = new Pregunta("¿Cuál es la fórmula química del agua?\n\n", "a) H2O\n", "b) CO2\n", "c) HO2\n", "d) CH2\n", "a");
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
        System.out.println("       _____________        ");
        System.out.println("       BIENVENIDO " + user1.name);
        System.out.println("       _____________        \n");
        System.out.println("        ***********         ");
        System.out.println("         RONDA # 1         ");
        System.out.println("       PUNTOS = 1000         ");
        System.out.println("        ***********         \n");

        //Printing a random question
        Pregunta preguntaActual = preguntasFacil1[rand];
        System.out.println(preguntaActual);

        //Choice to leave the game
        System.out.println("Si desea retirarse del juego presione 1 ");
        System.out.println("Si desea continuar pulse 2 ");
        int fin = sc.nextInt();
        int opcion = fin;

            switch (opcion) {
                case 1:
                    System.out.println("JUEGO FINALIZADO");
                    System.out.println("SU PUNTAJE ACUMULADO ES = " + premioUsuario.acumulado);
                    premioUsuario.acumulado = 0;
                    System.exit(0);
                    break;
                case 2:
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Elija una opcion valida");
                    break;
            }

        //Requesting user data
        System.out.println("Elija su respuesta: ");
        String resUser = sc.nextLine();

        //Conditionals
        if (resUser.length() == 1) {
            if (preguntaActual.getRespuestaCorrecta().equals(resUser)) {
                    System.out.println("\n¡RESPUESTA CORRECTA!");
                    System.out.println("HAZ AVANZADO A LA SIGUIENTE RONDA");
                    premioUsuario.acumulado = premioUsuario.premioNivel1;
                    System.out.println("TU PUNTAJE ACUMULADO ES = " + premioUsuario.acumulado);
            } else {
                System.out.println("JUEGO TERMINADO");
                System.out.println("SU PUNTAJE ACUMULADO ES = "+premioUsuario.acumulado);
                premioUsuario.acumulado = 0;
                System.exit(0);
            }
            } else {
                System.out.println("Debe ingresar solamente letras a, b, c, d");
            }

            System.out.println("\n        ***********         ");
            System.out.println("         RONDA # 2         ");
            System.out.println("       PUNTOS = 2000         ");
            System.out.println("        ***********         \n");

            //Ronda # 2 Nivel Basico
            Pregunta[] preguntasBasico1;
            preguntasBasico1 = new Pregunta[5];
            preguntasBasico1[0] = new Pregunta("¿Qué es Pangea?\n\n", "a) El país más antiguo del mundo\n", "b) La ciudad más grande del planeta\n", "c) Un supercontinente antiguo\n", "d) Un cuerpo celeste\n", "c");
            preguntasBasico1[1] = new Pregunta("¿Cuáles son culturas precolombinas de Colombia?\n\n", "a) Mayas y Aztecas\n", "b) Tiahuanaco e Incas\n", "c) Wayuu y Arawacos\n", "d) Taironas y Muiscas\n", "d");
            preguntasBasico1[2] = new Pregunta("¿En qué año llegó Cristóbal Colón a América?\n\n", "a) 1492\n", "b) 1499\n", "c) 1810\n", "d) 1914\n", "a");
            preguntasBasico1[3] = new Pregunta("¿En qué año murió John F. Kennedy?\n\n", "a) 1953\n", "b) 1981\n", "c) 1963\n", "d) 1972\n", "c\n");
            preguntasBasico1[4] = new Pregunta("¿Qué es acrofobia?\n\n", "a) Miedo a los arácnidos\n", "b) Miedo a las alturas\n", "c) Miedo a los arácnidos\n", "d) Miedo a espacios abiertos\n", "b");

            //Declaring some variables and range of random questions
            int max1 = 4;
            int min1 = 0;
            int range1 = max1 - min1 + 1;
            int rand1 = (int) (Math.random() * range1);

            //Printing a random question
            Pregunta preguntaActual1 = preguntasBasico1[rand1];
            System.out.println(preguntaActual1);

        //Choice to leave the game
        System.out.println("Si desea retirarse del juego presione 1 ");
        System.out.println("Si desea continuar pulse 2 ");
        int fin1 = sc.nextInt();
        int opcion1 = fin1;

        switch (opcion1) {
            case 1:
                System.out.println("JUEGO FINALIZADO");
                premioUsuario.acumulado = premioUsuario.premioNivel1;
                System.out.println("SU PUNTAJE ACUMULADO ES = " + premioUsuario.acumulado);
                System.exit(0);
                break;
            case 2:
                sc.nextLine();
                break;

            default:
                System.out.println("Elija una opcion valida");
                break;
        }

            //Requesting user data
            System.out.println("Elija su respuesta: ");
            String resUser1 = sc.nextLine();

            //Conditionals
            if (resUser1.length() == 1) {
                if (preguntaActual1.getRespuestaCorrecta().equals(resUser1)) {
                    System.out.println("\n¡RESPUESTA CORRECTA!");
                    System.out.println("HAZ AVANZADO A LA SIGUIENTE RONDA");
                    premioUsuario.acumulado = premioUsuario.premioNivel2 + premioUsuario.premioNivel1;
                    System.out.println("TU PUNTAJE ACUMULADO ES = " + premioUsuario.acumulado);
                } else {
                    System.out.println("JUEGO TERMINADO");
                    System.out.println("SU PUNTAJE ACUMULADO ES = "+premioUsuario.acumulado);
                    premioUsuario.acumulado = 0;
                    System.exit(0);
                }
            } else {
                System.out.println("Debe ingresar solamente letras a, b, c, d");
            }
        }
    }
