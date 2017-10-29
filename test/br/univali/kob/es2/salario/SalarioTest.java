package br.univali.kob.es2.salario;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author biankatpas
 * @author evelynrissi
 */
public class SalarioTest
{
    
    public SalarioTest() 
    {
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
    }

   @Test
    public void testSalarioHorasMenor90()
    {
        System.out.println("Teste com horas trabalhadas menor que 90 %.");
        Salario instance = new Salario(1000, 140);
        double expResult = 875.0;
        double result = instance.calculaSalario();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSalarioHorasIgual90()
    {
        System.out.println("Teste com horas trabalhadas igual que 90 %.");
        Salario instance = new Salario(1000, 144);
        double expResult = 900.0;
        double result = instance.calculaSalario();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSalarioHorasMaior90()
    {
        System.out.println("Teste com horas trabalhadas maior que 90 % e menor que 100 %.");
        Salario instance = new Salario(1000, 152);
        double expResult = 1000.0;
        double result = instance.calculaSalario();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSalarioHorasNormais()
    {
        System.out.println("Teste com horas trabalhadas igual a 160.");
        Salario instance = new Salario(1000);
        double expResult = 1000.0;
        double result = instance.calculaSalario();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSalarioHorasExtras()
    {
        System.out.println("Teste com horas trabalhadas maior que 160.");
        Salario instance = new Salario(1000, 170);
        double expResult = 1093.75;
        double result = instance.calculaSalario();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSalarioZero()
    {
        System.out.println("Teste com salário igual a zero.");
        Salario instance = new Salario(0, 160);
        double expResult = -1.0;
        double result = instance.calculaSalario();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testHorasZero()
    {
        System.out.println("Teste com horas trabalhadas é igual a zero.");
        Salario instance = new Salario(1000, 0);
        double expResult = -1.0;
        double result = instance.calculaSalario();
        assertEquals(expResult, result, 0.0);
    }

}
