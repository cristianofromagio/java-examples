package exercicios;

import javax.swing.*;

/**
 * @author Cristiano Fromagio
 * @version 1.00 2016/8/16
 *
 * 1) Programa que calcule a média de salários de uma empresa, pedindo ao usuário a
 * grade de funcionários e os salários em JOptionPane e devolvendo a média.
 */


public class MediaSalarioExe1 {

    public static void main(String[] args) {

        Integer num_func;
        Double salario, soma_salarios, media_salarios;

        num_func = 0;
        salario = soma_salarios = media_salarios = 0.0;

        try {

            num_func = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de funcionários: "));

            for (int i = 1; i <= num_func; i++) {

                salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário #" + i + ": "));
                soma_salarios += salario;

            }

        } catch (Exception e) {

            System.out.println("Deu ruim > " + e.toString());

        } finally {

            media_salarios = soma_salarios / num_func;

            JOptionPane.showMessageDialog(null, "Média dos " + num_func + " funcionários: R$ " + media_salarios);

        }

    }


}