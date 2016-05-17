package com.visionarios.concurso.vista;

import java.util.Scanner;

/**
 *
 * @author Dam
 */
public class Ejercicio1 {

    public Ejercicio1() {
        System.out.println("Introduce numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        
        if (noEsPolidivisible(numero)) {
            System.out.println("No lo es");
        } else {
            System.out.println("Es polidivisible");
        }
        
    }
    
    public int contarLongitud(int num){
        int resultado = 1;
        while(num/10 != 0){
            num = num/10;
            resultado++;
        }
        return resultado;
    }
    
    public Boolean noEsPolidivisible(int numero) {
        Boolean noEsDivisible = false;
        for (int i = contarLongitud(numero); i > 0; i--) {
            if (numero % i == 0) {
                numero /= 10;
            } else {
                noEsDivisible = true;
            }
        }
        return noEsDivisible;
    }
}
