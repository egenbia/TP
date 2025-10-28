/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classesimples;

/**
 *
 * @author PC
 */
public class Livro {
    private String titulo;
    private String autor;
    
    public Livro (String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    }
    
        public void exibirInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        }
    }

