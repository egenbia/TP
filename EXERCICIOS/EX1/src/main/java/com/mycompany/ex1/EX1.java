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
        
        /*//Exemplo 3
        String descricaop;
        int qtdcomprada;
        double precounit, total;
        
        System.out.println("digite a descricao do produto");
        descricaop = entrada.nextLine();
        System.out.println("digite a quantidade comprada");
        qtdcomprada = entrada.nextInt();
        System.out.println("digite o preco unitario");
        precounit = entrada.nextDouble();
        
        total = qtdcomprada * precounit;
        
        System.out.println("O produto eh: " + descricaop + " e o valor a ser pago eh :" + total);*/
        
        //Exemplo 4 
        /* double A, B, area, perimetro;
        
        System.out.println("digite a medida do lado A");
        A = entrada.nextDouble();
        System.out.println("digite a medida do lado B");
        B = entrada.nextDouble();
        
        area = A*B;
        perimetro = (2*A) + (2*B);
        
        System.out.println("A medida da area eh : " + area + "cm" + " e a medida do perimetro eh :" + perimetro + "cm"); */
              
        /*int  qtdMoveis, salarioTotal;
        System.out.println("Digite a quantidade de moveis vendidos:");
        qtdMoveis = entrada.nextInt();
        salarioTotal = (qtdMoveis * 50) + 1000;
        System.out.println("Foram vendidos " + qtdMoveis + " moveis, entao o salario total do funcionario sera de: R$" + salarioTotal);*/
        
        int tempo, taxa;
        double valorParcela, valorAtraso;
    System.out.println("Digite o valor da parcela: "); 
    valorParcela = entrada.nextDouble();
    System.out.println("Digite a taxa de juros: ");
    taxa = entrada.nextInt();
    System.out.println("Digite o tempo em meses: ");
    tempo = entrada.nextInt();
    valorAtraso = valorParcela + (valorParcela * (taxa / 100) * tempo);
    System.out.println("O valor da parcela em atraso será: R$" + valorAtraso);
        
    }
}
