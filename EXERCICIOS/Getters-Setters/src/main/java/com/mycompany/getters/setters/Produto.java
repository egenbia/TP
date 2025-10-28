/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getters.setters;

/**
 *
 * @author PC
 */
public class Produto {
    String nome;
    double preco;
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public void exibirInfo(){
    System.out.println("produto: " + nome);
    System.out.println("preco: " + preco);
    }
}
