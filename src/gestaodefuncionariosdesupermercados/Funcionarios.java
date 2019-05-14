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

public class Funcionarios {
    
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
        nome = ""; 
        estatuto = "";
        ncontribuinte = "";
        telemovel ="";
        iban = "";
        salario= 0.0;
        horas=0.0;
    }
    
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

    public String getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(String estatuto) {
        this.estatuto = estatuto;
    }

    public String getNcontribuinte() {
        return ncontribuinte;
    }

    public void setNcontribuinte(String ncontribuinte) {
        this.ncontribuinte = ncontribuinte;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    public String getIBAN() {
        return iban;
    }

    public void setIBAN(String iban) {
        this.iban = iban;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getHoras() {
        return horas;
    }
    
    public void setHoras(double horas) {
        this.horas = horas;
    }
    
    public double bonusPorHora() {
        double bonusHora = 0.00;
        double salarioTotal = 0.00;
        bonusHora = 5.0 *getHoras() ;
        salarioTotal = getSalario() + bonusHora;
        return salarioTotal;
    }
    
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Nome: ").append(getNome()).append("\n");
        output.append("Eatatuto: ").append(getEstatuto()).append("\n");
        output.append("Numero de contribuinte: ").append(getNcontribuinte()).append("\n");
        output.append("Telemóvel: ").append(getTelemovel()).append("\n");
        output.append("IBAN: ").append(getIBAN()).append("\n");
        output.append("Salário : ").append(getSalario()).append("€\n");
        output.append("Horas Extra: ").append(getHoras()).append("\n");
        output.append("Salário com bonus: ").append(bonusPorHora()).append("€\n");
        output.append("------------").append("\n");
        return output.toString();
    }
  
}
