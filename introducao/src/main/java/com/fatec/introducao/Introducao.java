/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fatec.introducao;// como um caminho de pão, mosta os caminhos

import java.util.Scanner;//perimite solicitar informações ao usuário
//formatDate - var/func - camelCase
//pessoa - class - camelCase
//format_date - snake case
//pessoa_util - snake case

/**
 *
 * @author fatec-dsm2
 */
public class Introducao {;

    public static void main(String[] args) { //main é a thread(caminho, linha de processamento alocados no cpu) principal
        // essa é uma variável do tipo int
   
        //int ressoma, ressub, resmult,resdiv;
            
        //operadores aritmesticos
        // soma +
        //subtração - 
        //multiplicação *
        //divisão /
        //resto de divisão %
        /*n1=1;
        n2=2;*/
        
        
       /* int num1,num2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("digite o num1");
        num1 = entrada.nextInt();
        System.out.println("digite o num2");
        num2 = entrada.nextInt();
        
        ressoma = num1 + num2;
        ressub = num1 - num2;
        resmult = num1 * num2;
        resdiv = num1 / num2;
        
        System.out.println("o resultado da soma e: " + ressoma); // print para o compilador
        System.out.println("o resultado da soma e: " + ressub);
        System.out.println("o resultado da soma e: " + resmult);
        System.out.println("o resultado da soma e: " + resdiv); */
       
       //MÉDIA
   int media1, media2, n1, n2, n3, n4, n5, n6, soma;
   Scanner entrada = new Scanner(System.in);
   
        System.out.println("digite a nota 1");
        n1 = entrada.nextInt();
        System.out.println("digite a nota 2");
        n2 = entrada.nextInt();
        System.out.println("digite a nota 3");
        n3 = entrada.nextInt();
        System.out.println("digite a nota 4");
        n4 = entrada.nextInt();
        System.out.println("digite a nota 5");
        n5 = entrada.nextInt();
        System.out.println("digite a nota 6");
        n6 = entrada.nextInt();
        
        media1 = (n1 + n2 + n3) / 3; // 10 + 8 + 9
        media2 = (n4 + n5 + n6) / 3; // 7 + 5 + 6
        soma = media1 + media2; // 15
        
        System.out.println("o resultado da soma das duas medias e : " + soma);
             
    }
}

/**
 * declarar constante ou variável no java:
 * double: 3.14 - ocupa 3 litros de agua
 * byte: 3.14 - ocupa 3 mls de agua
 */



