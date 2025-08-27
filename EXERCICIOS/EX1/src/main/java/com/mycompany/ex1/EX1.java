/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class EX1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*
        //Exemplo 1
        double novosalario, salario, percentual;;
        System.out.println("digite o seu salario atual");
         salario = entrada.nextDouble();
        System.out.println("digite o percentual de reajuste (%)");
         percentual = entrada.nextDouble();
        
        novosalario=salario+(salario * percentual)/100;
         System.out.println("o novo salario eh: " + novosalario);*/
        
        /* //Exemplo 2
        double valorpago, nlitros;;
        System.out.println("digite o numero de litros");
         nlitros = entrada.nextDouble();
        
        valorpago = nlitros * 5.39;
         System.out.println("o nvalor a ser pago eh: " + valorpago);*/
        
        //Exemplo 3
        //char descricaop;
        int qtdcomprada, precounit, total;
        
        //System.out.println("digite a descricao do produto");
        //descricaop = entrada.nextChar();
        System.out.println("digite a quantidade comprada");
        qtdcomprada = entrada.nextInt();
        System.out.println("digite o preco unitario");
        precounit = entrada.nextInt();
        
        total = qtdcomprada * precounit;
        
        System.out.println("o valor a ser pago eh: " + total);
        
        
        
    }
}
