/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metedos.parametros;

/**
 *
 * @author PC
 */
public class Calculadora {

    public void somar(int a, int b){
        int soma = a + b;
        System.out.println("Soma: " + soma);
    }
    
    public void subtrair(int a, int b){
        int subtrair = a - b;
        System.out.println("Subtracao: " + subtrair);
    }
    
    public void multiplicar(int a, int b){
        int multiplicar = a * b;
        System.out.println("Multiplicacao: " + multiplicar);
    }
    
    public void dividir(int a, int b){
        int dividir = a / b;
        System.out.println("Divisao: " + dividir);
    }
    
}
