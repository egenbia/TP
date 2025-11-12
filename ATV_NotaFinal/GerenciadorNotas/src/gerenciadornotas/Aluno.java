/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadornotas;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas;

    public Aluno(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public ArrayList<Double> getNotas() {
        return new ArrayList<>(notas);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) return Double.NaN;
        double soma = 0.0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.size();
    }

    public String avaliarDesempenho() {
        double media = calcularMedia();
        if (Double.isNaN(media)) {
            return "Sem notas lançadas.";
        }
        if (media < 6.0) {
            return "Reprovado";
        } else if (media > 9.0) {
            return "Ótimo Aproveitamento";
        } else { // >=6.0 e <=9.0
            return "Aprovado";
        }
    }

    public void limparNotas() {
        notas.clear();
    }
}
