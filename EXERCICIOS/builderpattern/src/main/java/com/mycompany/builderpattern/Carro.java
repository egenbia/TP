/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.builderpattern;

/**
 *
 * @author PC
 */
public class Carro {
    String modelo;
    String cor; 
    String motor;
    int ano;
    
    // Construtor privado
    private Carro(Builder builder) {
        this.modelo = builder.modelo;
        this.ano = builder.ano;
        this.cor = builder.cor;
        this.motor = builder.motor;
    }

    // Getters
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public String getCor() { return cor; }
    public String getMotor() { return motor; }

    // Classe interna Builder
    public static class Builder {
        private String modelo;
        private int ano;
        private String cor;
        private String motor;

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }
        public Builder setAno(int ano) {
            this.ano = ano;
            return this;
        }
        public Builder setCor(String cor) {
            this.cor = cor;
            return this;
        }
        public Builder setMotor(String motor) {
            this.motor = motor;
            return this;
        }
        public Carro build() {
            return new Carro(this);
        }
    }
    
    public void exibirInfo(){
        System.out.println(this.getModelo());     
        System.out.println(this.getAno());     
        System.out.println(this.getCor());
        System.out.println(this.getMotor());
    } 
}
