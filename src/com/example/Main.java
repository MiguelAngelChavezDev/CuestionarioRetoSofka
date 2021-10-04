package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        //Adding list of questions // Ronda 1 - Preguntas Facil
        List<Pregunta> preguntasFacil = new ArrayList<>();

        Pregunta[] preguntasFacil1;
        preguntasFacil1 = new Pregunta[1];
        preguntasFacil1[0] = new Pregunta("¿Cuál es la fórmula química del agua?\n\n", "a) H2O\n", "b) CO2\n", "c) HO2\n", "d) CH2\n", "a");

        System.out.println(preguntasFacil1[0].getRespuestaCorrecta());

        // Adding new elements to the ArrayList Preguntas Ronda 1
//        preguntasFacil.add(new Pregunta("¿Cuál es la fórmula química del agua?\n\n", "a) H2O\n", "b) CO2\n", "c) HO2\n", "d) CH2\n", "a"));
//        preguntasFacil.add(new Pregunta("¿Qué es un gecko?\n\n", "a) Un Instrumento Musical\n", "b) Un Reptil\n", "c) Un Astro\n", "d) Un Artrópodo\n", "b"));
//        preguntasFacil.add(new Pregunta("¿Cuál órgano celular se encarga de producir energía en la célula?\n\n", "a) Ribosoma\n", "b) Libosoma\n", "c) Mitocondria\n", "d) Aparato de Golgi\n", "c\n"));
//        preguntasFacil.add(new Pregunta("¿Quién escribió Cien años de soledad?\n\n", "a) Rafael Pombo\n", "b) Jorge Isaacs\n", "c) José Asunción Silva\n", "d) Gabriel García Márquez\n", "d\n"));
//        preguntasFacil.add(new Pregunta("¿El conjunto de instrucciones ordenadas para ejecutar tareas ¿Se le llama??\n\n", "a) Algoritmo\n", "b) Autómata\n", "c) Ordenador\n", "d) Código\n", "a\n"));

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

        if(resUser.length() == 1){
            if (resUser == preguntaActual.respuestaCorrecta) {

                premioUsuario.acumulado = premioUsuario.premioNivel1;
                System.out.println("Respuesta");
                System.out.println("usted ha ganado XX puntos");
                System.out.println("usted ha ganado XX puntos");
            } else {
                premioUsuario.acumulado = 0;
                System.out.println("Juego terminado");
            }
        }   else {
                System.out.println("Debe ingresar solamente letras a, b, c, d");
        }
        }

        //Ronda 2 - Preguntas Basico
        List<Pregunta> preguntasBasico = new ArrayList<>();

        preguntasBasico.add(new Pregunta("¿Cuál es la fórmula química del agua?\n\n", "a) H2O\n", "b) CO2\n", "c) HO2\n", "d) CH2\n", "a"));
        preguntasBasico.add(new Pregunta("¿Qué es un gecko?\n\n", "a) Un Instrumento Musical\n", "b) Un Reptil\n", "c) Un Astro\n", "d) Un Artrópodo\n", "b"));
        preguntasBasico.add(new Pregunta("¿Cuál órgano celular se encarga de producir energía en la célula?\n\n", "a) Ribosoma\n", "b) Libosoma\n", "c) Mitocondria\n", "d) Aparato de Golgi\n", "c\n"));
        preguntasBasico.add(new Pregunta("¿Quién escribió Cien años de soledad?\n\n", "a) Rafael Pombo\n", "b) Jorge Isaacs\n", "c) José Asunción Silva\n", "d) Gabriel García Márquez\n", "d\n"));
        preguntasBasico.add(new Pregunta("¿El conjunto de instrucciones ordenadas para ejecutar tareas ¿Se le llama??\n\n", "a) Algoritmo\n", "b) Autómata\n", "c) Ordenador\n", "d) Código\n", "a\n"));

}





















//        //PONER AQUI LAS CONDICIONES
//
//
//
//           //if(resUser == )
//
//
//
//
//        //Generando Objeto Premio usuario 1
//        Premios premioUsuario1 = new Premios();
//
//        premioUsuario1.acumulado = premioUsuario1.premioNivel1 + premioUsuario1.premioNivel2;
//
//        //System.out.println(premioUsuario1.acumulado);
//
//
//        //System.out.println(user1.name);
//
//        preguntasDificil.add(new Pregunta("Cuanto es 3+3", "4", "5", "6", "8", "c"));
//
//
//
//
//        }
//    }
//}