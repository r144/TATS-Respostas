/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD;

import calculadorasalarios.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author renato
 */
public class calcSalarioTest {
    CalculadoraSalarios calculadora;
    funcionario f;
    public calcSalarioTest() {
        
    }
    @Before
    public void InstanciaFuncionario(){
        f = new funcionario();
        f.setCargo("DESENVOLVEDOR");
        f.setEmail("ronaldo@gmail.com");
        f.setNome("ronaldo");
        calculadora = new CalculadoraSalarios();
    }
    @Test
     public void testDesenvolvedor() {
         f.setCargo("DESENVOLVEDOR");
         f.setSalarioBase(5000f);
         float salario = calculadora.Calcula(f);
         assertEquals(4000, salario,0.0f);
     }
}
