/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrizesagenda;

/**
 *
 * @author PC
 */
public class AgendaContatos {
    String [][] contatos = new String [5][2]; // 5 contatos, cada um com nome e telefone
    
    public void adicionarContato(int linha, String nome, String telefone) {
    contatos[linha][0] = nome;
    contatos[linha][1] = telefone;
}

    public void exibirContatos() {
    for (int i = 0; i < contatos.length; i++) {
            System.out.println(contatos[i][0] + " - " + contatos[i][1]);
        }
    }
    
    public void buscarTelefone(String nome) {
    for (int i = 0; i < contatos.length; i++) {
        if (contatos[i][0].equals(nome)) {
            System.out.println(contatos[i][1]); // mostra só o telefone
            return; // sai do método depois de achar
        }
    }
}

}


