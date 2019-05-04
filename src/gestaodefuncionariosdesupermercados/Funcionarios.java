/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodefuncionariosdesupermercados;

/**
 *
 * @author Francisco Cordeiro
 */

public abstract class Funcionarios implements GestaoTodos{
    
    public Funcionarios(String nome, String estatuto, String ncontribuinte, String telemovel, String iban, double salario, double  horas) {
        this.nome = nome; 
        this.estatuto = estatuto;
        this.ncontribuinte = ncontribuinte;
        this.telemovel = telemovel;
        this.iban = iban;
        this.salario= salario;
        this.horas=horas;
    }
    
    public Funcionarios() {
        this("","","","","",0.00,0.00);
    }
    
    public abstract double bonusPorHora();
    @Override
    public abstract String toString();

    private String nome;
    private String estatuto;
    private String ncontribuinte;
    private String telemovel;
    private String iban;
    private double salario;
    private double horas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(String estatuto) {
        this.estatuto = estatuto;
    }

    @Override
    public String getNcontribuinte() {
        return ncontribuinte;
    }

    public void setNcontribuinte(String ncontribuinte) {
        this.ncontribuinte = ncontribuinte;
    }

    @Override
    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    @Override
    public String getIBAN() {
        return iban;
    }

    public void setIBAN(String iban) {
        this.iban = iban;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getHoras() {
        return horas;
    }
    
    public void setHoras(double horas) {
        this.horas = horas;
    }
    
}
