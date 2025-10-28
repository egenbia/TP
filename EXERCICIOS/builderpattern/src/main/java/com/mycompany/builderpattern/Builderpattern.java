/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.builderpattern;

/**
 *
 * @author PC
 */
public class Builderpattern {

    public static void main(String[] args) {
        Carro carro = new Carro.Builder()
    .setModelo("Civic")
    .setAno(2022)
    .setCor("Prata")
    .setMotor("2.0")
    .build();
carro.exibirInfo();
// Saída esperada:
// Modelo: Civic
// Ano: 2022
// Cor: Prata
// Motor: 2.0

    }
}
