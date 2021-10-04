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

        //Adding list of questions according to category
        List<Pregunta> preguntasFacil = new ArrayList<>();
        List<Pregunta> preguntasDificil = new ArrayList<>();

        // Adding new elements to the ArrayList
        preguntasFacil.add(new Pregunta());
        preguntasFacil.add(new Pregunta());
        preguntasFacil.add(new Pregunta());
        preguntasFacil.add(new Pregunta());
        preguntasFacil.add(new Pregunta());

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

        //Decorating
        System.out.println("\n        BIENVENIDO         \n");
        System.out.println("        ***********         ");
        System.out.println("         RONDA # 1         ");
        System.out.println("        ***********         \n");

        //Printing a random question
        System.out.println(preguntasFacil.toArray()[rand]);

        //Requesting user data

        System.out.println("Elija su respuesta: ");
        String resUser = sc.nextLine();

        Pregunta rta = new Pregunta();

        System.out.println("la respuesta es " + rta.getRespuestaCorrecta());


//        Pregunta rta = new Pregunta(resUser);
//        System.out.println(rta.getrespuestaCorrecta());

    }
}

//        if (resUser == rta.respuestaCorrecta) {
//
//            System.out.println("usted ha ganado 50 puntos");
//        } else{
//                System.out.println("Juego terminado");
//            }
//        }
//    }




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