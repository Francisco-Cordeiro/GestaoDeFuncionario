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
    
    //construtor
    public GestaoFuncionarios() {
        tTodos = new ArrayList<>();
    }
    
    //variasveis
    private ArrayList<GestaoTodos> tTodos;

    
    public void inserirTodos(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, double salario, double horas) {
        tTodos.add(new Diretor(nome, estatuto, ncontribuinte, telemovel, nib, salario, horas) {
            @Override
            public int bonusPorHora() {
                double bonusHora = 0;
                double salarioTotal = 0;
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

    public void inserirTodos1(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, double salario, double horas) {
        tTodos.add(new SubDiretor(nome, estatuto, ncontribuinte, telemovel, nib, salario, horas) {
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

    public void inserirTodos2(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, double salario, double horas) {
        tTodos.add(new Funcionarios(nome, estatuto, ncontribuinte, telemovel, nib, salario, horas) {
            @Override
            public int bonusPorHora() {
                double bonusHora = 0.0;
                double salarioTotal = 0.0;
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


    public String verTodos() {
        String output = "";
        for (int i=0; i<tTodos.size(); i++) {
            output = tTodos.get(i).toString();
        }
        return output;
    }

    //pesquisa por nome 
    public String pesquisaNome(String nomep){
        String output = "Nome não encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getNome().equals(nomep)){
                output = f.toString();
            }
        }
        return output;
    }
    
    //pesquisa por estatuto
    public String pesquisarEstatuto(String estatutop){
        String output = "Estatuto não encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getEstatuto().equals(estatutop)){
                output = f.toString();
            }
        }
        return output;
    }

    //pesquisa por número de contribuinte
    public String pesquisarNcontribuinte(String ncontribuintep){
        String output = "Número de contribuinte não encontrado!\n";
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
         String output = "Nib não encontrado!\n";
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
        String output = "Número de telemóvel não encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getTelemovel().equals(telemovelp)){
                output = f.toString();
            }
        }
        return output;
    }
    
     //pesquisa por salário
    public String pesquisarSalario(double salariop){
        String output = "Salário não encontrado!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getSalario()==salariop){
                output = f.toString();
            }
        }
        return output;
    }
     
    //pesquisa por horas feitas
    public String pesquisarHoras(double horasp){
        String output = "Horas extras não feitas!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getHoras()== horasp){
                output = f.toString();
            }
        }
        return output;
    }
    
    public String pesquisaSalariosEntreQuotas(double salariomin, double salariomax){
        String output = "Salários não encontrados!";
        for(int i =0; i< tTodos.size();i++){
            GestaoTodos f = tTodos.get(i);
            if((f.getSalario()>salariomin)&&(f.getSalario()<salariomax)){
                output = f.toString();   
            }
        }
        return output;
    }
    
    //gets e sets do array
    public ArrayList<GestaoTodos> gettTodos() {
        return tTodos;
    }

    public void settTodos(ArrayList<GestaoTodos> tTodos) {
        this.tTodos = tTodos;
    }
    
}
