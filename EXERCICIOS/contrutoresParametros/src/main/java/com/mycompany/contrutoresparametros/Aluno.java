/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contrutoresparametros;

/**
 *
 * @author PC
 */
public class Aluno {
    String nome;
    String matricula;
    
    public Aluno (String nome, String matricula) {
    this.nome=nome;
    this.matricula=matricula;
}
    
    public void exibirDados(){
        System.out.println(nome);
        System.out.println(matricula);
    }
}
