/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasalarios;

/**
 *
 * @author renat
 */
public class CalculadoraSalarios {

    public float Calcula(funcionario f) {
        float salario = 0;
        float salarioBase = f.getSalarioBase();
        if (f.getCargo().equals("DESENVOLVEDOR")) {
            salario = salarioBase - salarioBase * 0.2f;
            if (salario < 3000) {
                salario = salarioBase - salarioBase * 0.1f;
            }
        } else if (f.getCargo().equals("DBA")) {
            salario = salarioBase - salarioBase * 0.25f;
            if (salario < 2000) {
                salario = salarioBase - salarioBase * 0.15f;
            }
        } else if (f.getCargo().equals("TESTADOR")) {
            if (salarioBase < 2000) {
                salario = salarioBase - salarioBase * 0.15f;
            } else {
                salario = salarioBase - salarioBase * 0.25f;

            }
        } else if (f.getCargo().equals("GERENTE")) {
            salario = salarioBase - salarioBase * 0.3f;
            if (salario < 5000) {
                salario = salarioBase - salarioBase * 0.2f;
            }
        }

        return salario;
    }

}
