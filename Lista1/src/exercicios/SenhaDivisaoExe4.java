package exercicios;

import javax.swing.*;

/**
 * @author Cristiano Fromagio
 * @version 1.00 2016/8/18
 *
 * 4) Desenvolver programa que peça ao usuário para cadastrar uma senha; na sequência, deve pedir ao usuário que digite
 * duas variáveis reais, e ira calcular a divisão da primeira pela segunda. O programa ira pedir ao usuario que digite
 * sua senha e estiver correta ela mostra o resultado da divisao. Senao da mensagem de erro e encerra o aplicativo.
 */

public class SenhaDivisaoExe4 {

    public static void main(String[] args) {

        String senha;
        Double num1, num2, divisao;

        senha = "";
        num1 = num2 = divisao = 0.0;

        do {
            senha = JOptionPane.showInputDialog("Digite uma senha para continuar: ");
        } while (senha.equals(""));

        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da divisão: "));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da divisão: "));

        if (senha.equals(JOptionPane.showInputDialog("Confirme a senha"))) {

            divisao = num1 / num2;
            String msg = "O resultado de " + num1 + " dividido por " + num2 + " é: " + divisao;

            JOptionPane.showMessageDialog(null, msg);

        } else {
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }

    }

}
