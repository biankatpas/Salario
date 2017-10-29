
package br.univali.kob.es2.salario;

/**
 *
 * @author biankatpas
 * @author evelynrissi
 */
public class Salario 
{

    private double salarioReg = 0;
    private double salarioHora = 0;
    private double horasTrab = 160;

    public Salario(double salarioReg)
    {       
        this.salarioReg = salarioReg;
        this.salarioHora = this.salarioReg / 160;
    }

    public Salario(double salarioReg, double horasTrab)
    {
        this.horasTrab = horasTrab;
        this.salarioReg = salarioReg;
        this.salarioHora = this.salarioReg / 160;
    }

    public double calculaSalario() 
    {

        if(this.horasTrab <= 0 || this.salarioReg <= 0)
        {
            return -1;
        }
        
        if (this.horasTrab <= (160 * 0.9))
        {
            return this.salarioHora * this.horasTrab;
        } 
        else if (this.horasTrab > 160)
        {
            double horaExtra = (this.horasTrab - 160) * this.salarioHora + ((this.horasTrab - 160) * this.salarioHora) * 0.5;
            return this.salarioReg + horaExtra;
        } 
        else 
        {
            return this.salarioReg;
        }
    }
}

