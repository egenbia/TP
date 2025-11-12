/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciadornotas;

import javax.swing.JOptionPane;

public class GerenciadorNotas {

    public static void main(String[] args) {
        Aluno aluno = null;
        boolean rodando = true;

        while (rodando) {
            String menu = "Menu \n"
                        + "1 - Cadastrar Aluno\n"
                        + "2 - Lançamento de Notas \n"
                        + "3 - Cálculo de Média \n"
                        + "4 - Avaliação de Desempenho \n";

            String opc = JOptionPane.showInputDialog(null, menu, "Gerenciador de Notas", JOptionPane.QUESTION_MESSAGE);

            if (opc == null) {
                break;
            }

            switch (opc.trim()) {
                case "1":
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome completo do aluno:", "Cadastro de Aluno", JOptionPane.QUESTION_MESSAGE);
                    if (nome != null && !nome.trim().isEmpty()) {
                        aluno = new Aluno(nome.trim());
                        JOptionPane.showMessageDialog(null, "Aluno cadastrado: " + aluno.getNome(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } 
                    break;

                case "2":
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, "Cadastre um aluno primeiro.", "Atenção", JOptionPane.WARNING_MESSAGE);
                        break;
                    }

                    aluno.limparNotas();
                    int contador = 1;
                    while (contador <= 3) {
                        String entrada = JOptionPane.showInputDialog(null, "Digite a nota " + contador + " (0 a 10):", "Lançamento de Notas", JOptionPane.QUESTION_MESSAGE);
                        if (entrada == null) {
                            int confirm = JOptionPane.showConfirmDialog(null, "Cancelar lançamento de notas?", "Confirmar", JOptionPane.YES_NO_OPTION);
                            if (confirm == JOptionPane.YES_OPTION) {
                                aluno.limparNotas();
                                break;
                            } else {
                                continue;
                            }
                        }
                        entrada = entrada.trim();
                        try {
                            double nota = Double.parseDouble(entrada);
                            if (nota < 0.0 || nota > 10.0) {
                                JOptionPane.showMessageDialog(null, "Nota deve estar entre 0 e 10.", "Valor inválido", JOptionPane.ERROR_MESSAGE);
                                continue;
                            }
                            aluno.adicionarNota(nota);
                            contador++;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número (ex: 7.5).", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    if (aluno.getNotas().size() == 3) {
                        JOptionPane.showMessageDialog(null, "Três notas lançadas com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case "3":
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, "Cadastre um aluno primeiro.", "Atenção", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    if (aluno.getNotas().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma nota lançada. Use a opção 2 para lançar 3 notas.", "Atenção", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    double media = aluno.calcularMedia();
                    JOptionPane.showMessageDialog(null, String.format("Aluno: %s\nMédia: %.2f", aluno.getNome(), media), "Cálculo de Média", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "4":
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, "Cadastre um aluno primeiro.", "Atenção", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    if (aluno.getNotas().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhuma nota lançada. Use a opção 2 para lançar 3 notas.", "Atenção", JOptionPane.WARNING_MESSAGE);
                        break;
                    }
                    String status = aluno.avaliarDesempenho();
                    double mediaAtual = aluno.calcularMedia();
                    String msg = String.format("Aluno: %s\nNotas: %s\nMédia: %.2f\nStatus: %s",
                                                aluno.getNome(),
                                                aluno.getNotas().toString(),
                                                mediaAtual,
                                                status);
                    JOptionPane.showMessageDialog(null, msg, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Escolha uma opção válida do menu.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        System.exit(0);
    }
}
