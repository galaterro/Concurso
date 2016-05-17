package com.visionarios.concurso.utils;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Visionarios
 */
public class Lector {
    
    private static ArrayList<String> entradas = null;
    private static Scanner sc = null;
    
    public ArrayList<String> generarCasos(int numeroCasos) {
        entradas = new ArrayList<>();
        String entradaUsuario = null;
        
        for (int i = 0; i < numeroCasos; i++) {
            System.out.println("Introduce el caso " + (i + 1) + ": ");
            entradaUsuario = sc.nextLine();
            entradas.add(entradaUsuario);
        }
        
        return entradas;
    }
    
    public Lector() {
        this.sc = new Scanner(System.in);
    }
}
