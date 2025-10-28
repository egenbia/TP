/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamento;

/**
 *
 * @author PC
 */
public class ContaBancaria {
    private String numero;
    private int saldo;
    
    public ContaBancaria(String numero){
        this.numero = numero;
        this.saldo = 0;
    }
       
    public String getNumero(){
        return this.numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
        public int getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
    
    public void exibirSaldo(){
    System.out.println("Saldo da conta " + this.numero + ":" + this.saldo);
    }
}
