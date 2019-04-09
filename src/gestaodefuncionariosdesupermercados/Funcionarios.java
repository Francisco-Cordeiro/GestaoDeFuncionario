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
    
    private String nome;
    private String estatuto;
    private String ncontribuinte;
    private String telemovel;
    private String nib;
    private double salario;
    
    public Funcionarios(String nome, String estatuto, String ncontribuinte, String telemovel, String nib, double salario) {
        this.nome = nome; 
        this.estatuto = estatuto;
        this.ncontribuinte = ncontribuinte;
        this.telemovel = telemovel;
        this.nib = nib;
        this.salario= salario;
    }
    
    public Funcionarios() {
        this.nome = " ";
        this.estatuto = " ";
        this.ncontribuinte = "";
        this.telemovel = "";
        this.nib = "";
        this.salario= 0;
    }

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

    public String getNib() {
        return nib;
    }

    public void setNib(String nib) {
        this.nib = nib;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
       String output = "";
        String linha = "--------------\n";
        output = linha+"Nome: "+nome+"\n"+
                "Estatuto: "+estatuto+"\n"+
                "Número de Contribuinte: "+ncontribuinte+"\n"+
                "Telemóvel:"+telemovel+"\n"+
                "NIB:"+nib+"\n"+
                "Salário:"+salario+"\n"+linha;
        return output;
    }

    
    
    
    
}
