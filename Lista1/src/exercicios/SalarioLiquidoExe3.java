package exercicios;

import javax.swing.*;

/**
 * @author Cristiano Fromagio
 * @version 1.00 2016/8/18
 *
 * 3) Criar um programa para cálculo do salário líquido em que três valores devem ser informados pelo usuário em
 * janelas de entrada: a quantidade de horas trabalhadas, o salário hora e o número de dependentes.
 * O programa deve mostrar em janela de saída as informações contidas no lado esquerdo da tabela seguinte:
 *
 *  Informação Cálculos
 *  Salário bruto Horas trabalhadas * salário hora + (50 * número de dependentes)
 *
 *  Desconto INSS Se salário bruto <= 1000 INSS=salário bruto * 8.5/100
 *  Se salário bruto > 1000 INSS=salário bruto * 9/100
 *
 *  Desconto IR Se salário bruto <= 500 IR=0
 *  Se salário bruto > 500 e <= 1000 IR=salário bruto*5/100
 *  Se salário bruto > 1000 IR=salário bruto*7/100
 *
 *  Salário líquido = Salário bruto - INSS - IR
 */

public class SalarioLiquidoExe3 {

    public static void main(String[] args) {

        Integer horas_trabalhadas, num_dependentes;
        Double salario_hora, salario_bruto, inss, ir, salario_liquido;

        horas_trabalhadas = num_dependentes = 0;
        salario_hora = salario_bruto = inss = ir = salario_liquido = 0.0;

        try {

            horas_trabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
            salario_hora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário hora: "));
            num_dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes: "));

        } catch (Exception e) {

            System.out.println("Deu ruim > " + e.toString());

        } finally {

            salario_bruto = horas_trabalhadas * salario_hora + (50 * num_dependentes);

            if (salario_bruto <= 1000) {
                inss = salario_bruto * 8.5 / 100;
            } else {
                inss = salario_bruto * 9 / 100;
            }

            if (salario_bruto <= 500) {
                ir = 0.0;
            } else if (salario_bruto > 500 && salario_bruto <= 1000) {
                ir = salario_bruto * 5 / 100;
            } else {
                ir = salario_bruto * 7 / 100;
            }

            salario_liquido = salario_bruto - inss - ir;

            String resultado = "";
            resultado += "Salário bruto: " + salario_bruto + "\n";
            resultado += "Desconto INSS: " + inss + "\n";
            resultado += "Desconto IR: " + ir + "\n";
            resultado += "Salário líquido: " + salario_liquido;

            JOptionPane.showMessageDialog(null, resultado);

        }

    }

}
