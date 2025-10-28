/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabuada.laco.repeticao;

/**
 *
 * @author PC
 */
public class Tabuada {
    private int numero;
    private int i;
    
    
    public void imprimirTabuada(int numero){
        for(i=0;i<11;i++){
        int tab = numero * i;
        System.out.println(numero + "x" + i + "=" + tab);
    }
}
}
