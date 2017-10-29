package br.univali.kob.es2.salario;

/**
 *
 * @author biankatpas
 * @author evelynrissi
 */
public class App {
    
    public static void main(String[] args) 
    {
        Salario salario = new Salario(0,160);
        System.out.println(salario.calculaSalario());
    }
}