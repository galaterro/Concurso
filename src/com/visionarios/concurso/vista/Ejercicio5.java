package com.visionarios.concurso.vista;

import java.util.Scanner;

/**
 *
 * @author Visionarios
 */
public class Ejercicio5 {

    public Ejercicio5() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero para conocer si es un numero REVERSIBLE");

        int numero = sc.nextInt();
        
        int reverso=0;
        
        if (numero > 9 && numero % 10 != 0) {
            System.out.println(contarLongitud(numero));
            System.out.println(invertirNumero(numero));
            System.out.println(sonTodosImpar(numero, invertirNumero(numero)));
            System.out.println(numero + invertirNumero(numero));
            
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
    
    public int invertirNumero(int num){
        int resultado=0;
        
        for (int i = contarLongitud(num); i > 0; i--) {
           resultado += (num % 10) * ((exponente(10, i - 1)));
           num = num / 10;
        }
        return resultado;
    }
    
    
    public int exponente(int base, int exp){
        int resultado=1;
        for (int i = 0;   i < exp; i++) {
            resultado *=base;
        }
        return resultado;
    }
    
    public Boolean sonTodosImpar(int numero, int reverso){
        int resultado=numero+reverso;
        Boolean sonTodosImpares = true;
        for (int i = 0; i < contarLongitud(resultado); i++) {
            
            if(resultado%2==0){
                sonTodosImpares = false;
                return sonTodosImpares;
            }
            resultado /= 10;
        }
        
        return sonTodosImpares;
    }
}
