/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizesagenda;

/**
 *
 * @author PC
 */
public class MatrizesAgenda {

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
agenda.adicionarContato(0, "Ana", "9999-1111");
agenda.adicionarContato(1, "Bruno", "8888-2222");
agenda.adicionarContato(2, "Carla", "7777-3333");
agenda.exibirContatos();
// Saída esperada:
// Ana - 9999-1111
// Bruno - 8888-2222
// Carla - 7777-3333

agenda.buscarTelefone("Bruno");
// Saída esperada:
// Telefone de Bruno: 8888-2222

    }
}
