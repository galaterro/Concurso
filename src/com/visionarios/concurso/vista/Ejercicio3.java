/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.visionarios.concurso.vista;

import com.visionarios.concurso.utils.Lector;
import com.visionarios.concurso.utils.ManejoStrings;
import java.util.ArrayList;

/**
 *
 * @author Dam
 */
public class Ejercicio3 {

    public Ejercicio3() {
        Lector lector = new Lector();
        ArrayList<String> casos = lector.generarCasos(4);
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduzca el primer numero: ");
//        String entradaUsuario = sc.nextLine();

        String stringNumeros[][] = null;
        int numeros[][] = null;
        
        
        // 20 2
        // 30 4
        // 40 4 2
        for (int i = 0; i < casos.size(); i++) {
            
//            for (int j = 0; j < ManejoStrings.quitarEspacios(casos.get(i)).length; j++) {
//                numeros[i][j] = Integer.parseInt(ManejoStrings.quitarEspacios(casos.get(j)));
//            }
        }

//        String arrayStrings[] = ManejoStrings.quitarEspacios(entradaUsuario);
//        ArrayList<Integer> numeros = new ArrayList<>();
//        
//        for (int i = 0; i < arrayStrings.length; i++) {
//            numeros.add(Integer.parseInt(arrayStrings[i]));
//        }
//        if (numeros.get(0) > numeros.get(1)) {
//            System.out.println(dividirFactoriales(numeros.get(0), numeros.get(1)));
//        } else {
//            System.out.println("Zopenco");
//        }

    }

    public int dividirFactoriales(int num1, int num2) {
        return resultadoFactorial(num1) / resultadoFactorial(num2);
    }

    public int resultadoFactorial(int numero) {
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}