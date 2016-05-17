package com.visionarios.concurso.vista;

import com.visionarios.concurso.utils.ManejoStrings;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dam
 */
public class Ejercicio4 {
    public Ejercicio4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los números: ");
        String entradaUsuario = sc.nextLine();
        String arrayStrings[] = ManejoStrings.quitarEspacios(entradaUsuario);
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < arrayStrings.length; i++) {
            numeros.add(Integer.parseInt(arrayStrings[i]));
        }
        
        System.out.println(calcularCapacidad(numeros.get(0), numeros.get(1), numeros.get(2)));
    }
    
    public int calcularCapacidad(int cubos, int capacidad, int diferencia) {
        int resultado = 0;
        if (cubos > 0) {
            resultado = capacidad + calcularCapacidad(cubos - 1, capacidad - diferencia, diferencia);
        }
        return resultado;
    }
}
