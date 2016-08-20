package exercicios;

import javax.swing.*;

/**
 * @author Cristiano Fromagio
 * @version 1.00 2016/8/18
 *
 * 5) Implementar programa que realize uma das 4 operaçoes (+), (-), (/) e (*) entre duas variáveis,
 * através da escolha do usuário.
 */
public class OperacoesAritmeticasExe5 {

    public static void main (String[] args) {

        String aritmetica = "";
        Integer opcao = 0;
        Double var1, var2, resultado;

        var1 = var2 = resultado = 0.0;

        var1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
        var2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));

        String menu = "";
        menu += "Escolha uma operação aritmética: \n";
        menu += "1 - Adição (+) \n";
        menu += "2 - Subtração (-) \n";
        menu += "3 - Divisão (/) \n";
        menu += "4 - Multiplicação (*)";

        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        switch (opcao) {
            case 1:
                resultado = var1 + var2;
                aritmetica = "adição";
                break;
            case 2:
                resultado = var1 - var2;
                aritmetica = "subtração";
                break;
            case 3:
                resultado = var1 / var2;
                aritmetica = "divisão";
                break;
            case 4:
                resultado = var1 * var2;
                aritmetica = "multiplicação";
                break;
            default:
                resultado = null;
                break;
        }

        if (resultado != null) {

            String msg = "O resultado da " + aritmetica + " é: " + resultado;
            JOptionPane.showMessageDialog(null, msg);

        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida");
        }

    }

}
