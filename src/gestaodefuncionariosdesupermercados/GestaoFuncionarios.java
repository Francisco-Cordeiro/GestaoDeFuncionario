/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaodefuncionariosdesupermercados;

import java.util.ArrayList;

/**
 *
 * @author Francisco Cordeiro
 */
public class GestaoFuncionarios {
    
   

    public GestaoFuncionarios() {
        
        tDiretor = new ArrayList<>();
        tSubDiretores = new ArrayList<>();
        tFuncionarios = new ArrayList<>();
        tTodos = new ArrayList<>();
    }

    private ArrayList<Funcionarios> tFuncionarios;
    private ArrayList<Diretor> tDiretor;
    private ArrayList<SubDiretor> tSubDiretores;
    private ArrayList<GestaoTodos> tTodos;

    public void inserirDiretor(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, double salario, double horas) {
        tDiretor.add(new Diretor(nome, estatuto, ncontribuinte, telemovel, nib, salario, horas) {
            @Override
            public int bonusPorHora() {
                double bonusHora = 0;
                double salarioTotal = 0;
                bonusHora = 15.0 * horas;
                salarioTotal = salario + bonusHora;
                return (int) (double) salarioTotal;

            }

            @Override
            public String toString() {
                StringBuilder output = new StringBuilder();
                output.append("Nome: ").append(this.getNome()).append("\n");
                output.append("Eatatuto: " + this.getEstatuto() + "\n");
                output.append("Numero de contribuinte: " + this.getNcontribuinte() + "\n");
                output.append("Telemóvel: " + this.getTelemovel() + "\n");
                output.append("NIB: " + this.getNib() + "\n");
                output.append("Salário: " + this.bonusPorHora() + "\n");
                output.append("Horas Extra: ").append(this.getHoras()).append("\n");;
                return output.toString();
            }
        });
    }

    public void inserirSubDiretor(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, double salario, double horas) {
        tSubDiretores.add(new SubDiretor(nome, estatuto, ncontribuinte, telemovel, nib, salario, horas) {
            @Override
            public int bonusPorHora() {
                double bonusHora = 0.0;
                double salarioTotal = 0.0;
                bonusHora = 10.0 * horas;
                salarioTotal = salario + bonusHora;
                return (int) (double) salarioTotal;
            }

            @Override
            public String toString() {
                StringBuilder output = new StringBuilder();
                output.append("Nome: ").append(this.getNome()).append("\n");
                output.append("Eatatuto: " + this.getEstatuto() + "\n");
                output.append("Numero de contribuinte: " + this.getNcontribuinte() + "\n");
                output.append("Telemóvel: " + this.getTelemovel() + "\n");
                output.append("NIB: " + this.getNib() + "\n");
                output.append("Salário: " + this.bonusPorHora() + "\n");
                output.append("Horas Extra: ").append(this.getHoras()).append("\n");;
                return output.toString();
            }
        });
    }

    public void inserirFuncionario(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, double salario, double horas) {
        tFuncionarios.add(new Funcionarios(nome, estatuto, ncontribuinte, telemovel, nib, salario, horas) {
            @Override
            public int bonusPorHora() {
                double bonusHora = 0.0;
                double salarioTotal = 0.0;
                bonusHora = 5.0 * horas;
                salarioTotal = salario + bonusHora;
                return (int) (double) salarioTotal;
            }

            @Override
            public String toString() {
                StringBuilder output = new StringBuilder();
                output.append("Nome: ").append(this.getNome()).append("\n");
                output.append("Eatatuto: " + this.getEstatuto() + "\n");
                output.append("Numero de contribuinte: " + this.getNcontribuinte() + "\n");
                output.append("Telemóvel: " + this.getTelemovel() + "\n");
                output.append("NIB: " + this.getNib() + "\n");
                output.append("Salário: " + this.bonusPorHora() + "\n");
                output.append("Horas Extra: ").append(this.getHoras()).append("\n");;
                return output.toString();
            }
        });
    }


    public String verDiretor() {
        String output = "";
        for (int i = 0; i < tDiretor.size(); i++) {

            output = tDiretor.get(i).toString();
        }
        return output;
    }

    public String verSubDiretor() {
        String output = "";
        for (int i = 0; i < tSubDiretores.size(); i++) {

            output = tSubDiretores.get(i).toString();
        }
        return output;
    }
    
    public String verFuncionario() {
        String output = "";
        for (int i = 0; i < tFuncionarios.size(); i++) {

            output = tFuncionarios.get(i).toString();
        }
        return output;
    }

    //pesquisa por nome 
    public String pesquisaNome(String nomep){
        String output = "Nome NÃO encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getNome().equals(nomep)){
                output = f.toString();
            }
        }
        return output;
    }
    
    public String pesquisarSalario(double salariop){
        String output = "Salário NÃO encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getSalario()==salariop){
                output = f.toString();
            }
        }
        return output;
    }
   
    //pesquisa por estatuto
    public String pesquisarEstatuto(String estatutop){
        String output = "Estatuto NÃO encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getEstatuto().equals(estatutop)){
                output = f.toString();
            }
        }
        return output;
    }

    
     public String pesquisarNcontribuinte(String ncontribuintep){
        String output = "Número de contribuinte NÃO encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getNcontribuinte().equals(ncontribuintep)){
                output = f.toString();
            }
        }
        return output;
     }
     
    //pesquisa por nib
    public String pesquisarNib(String nibp){
         String output = "Nib NÃO encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getNib().equals(nibp)){
                output = f.toString();
            }
        }
        return output;
    }
    
    //pesquisa por telemovel
     public String pesquisarTelemovel(String telemovelp){
        String output = "Aluno NÃO encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getTelemovel().equals(telemovelp)){
                output = f.toString();
            }
        }
        return output;
    }
     
    public String pesquisarHoras(double horasp){
        String output = "Aluno NÃO encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getHoras()== horasp){
                output = f.toString();
            }
        }
        return output;
    }
    
    public ArrayList<Funcionarios> gettFuncionarios() {
        return tFuncionarios;
    }

    public void settFuncionarios(ArrayList<Funcionarios> tFuncionarios) {
        this.tFuncionarios = tFuncionarios;
    }

    public ArrayList<Diretor> gettDiretor() {
        return tDiretor;
    }

    public void settDiretor(ArrayList<Diretor> tDiretor) {
        this.tDiretor = tDiretor;
    }

    public ArrayList<SubDiretor> gettSubDiretors() {
        return tSubDiretores;
    }

    public void settSubDiretors(ArrayList<SubDiretor> tSubDiretors) {
        this.tSubDiretores = tSubDiretors;
    }

    public ArrayList<GestaoTodos> gettTodos() {
        return tTodos;
    }

    public void settTodos(ArrayList<GestaoTodos> tTodos) {
        this.tTodos = tTodos;
    }

}
