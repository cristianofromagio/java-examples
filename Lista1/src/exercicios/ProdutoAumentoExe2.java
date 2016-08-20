package exercicios;

import javax.swing.*;

/**
 * @author Cristiano Fromagio
 * @version 1.00 2016/8/16
 *
 * 2) Criar um programa que receba por janela JoptionPane o valor de um produto e um
 * código de aumento, segundo a tabela: 
 * Código % aumento 
 * 1 10 
 * 3 25 
 * 4 30 
 * 8 50
 */

public class ProdutoAumentoExe2 {

    public static void main(String[] args) {

        Integer cod;
        Double valor, aumento, novo_valor;
        cod = 0;
        valor = novo_valor = aumento = 0.0;

        String msg = "Informe o código do aumento: \n";
        msg += "Código - % aumento\n";
        msg += "1 - 10%\n";
        msg += "3 - 25%\n";
        msg += "4 - 30%\n";
        msg += "8 - 50%";

        try {

            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto em reais: "));

            cod = Integer.parseInt(JOptionPane.showInputDialog(msg));

            switch (cod) {
                case 1:
                    aumento = valor * 0.1;
                    novo_valor = valor + aumento;
                    break;
                case 3:
                    aumento = valor * 0.25;
                    novo_valor = valor + aumento;
                    break;
                case 4:
                    aumento = valor * 0.3;
                    novo_valor = valor + aumento;
                    break;
                case 8:
                    aumento = valor * 0.5;
                    novo_valor = valor + aumento;
                    break;
                default:
                    novo_valor = aumento = null;
                    break;
            }

        } catch (Exception e) {

            System.out.println("Deu ruim > " + e.toString());

        } finally {

            String resultado = "";

            if (aumento != null && valor != null) {

                resultado += "Valor do produto: " + valor + "\n";
                resultado += "Valor do aumento: " + aumento + "\n";
                resultado += "Valor do produto com aumento: " + novo_valor;

            } else {
                resultado = "Opção de aumento inválida";
            }

            JOptionPane.showMessageDialog(null, resultado);

        }

    }

}
