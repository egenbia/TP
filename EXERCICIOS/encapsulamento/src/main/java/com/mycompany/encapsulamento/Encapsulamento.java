/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulamento;

/**
 *
 * @author PC
 */
public class Encapsulamento {

    public static void main(String[] args) {
    ContaBancaria conta = new ContaBancaria("1234");
    conta.depositar(1000);
    conta.sacar(250);
    conta.exibirSaldo();

    }
}
