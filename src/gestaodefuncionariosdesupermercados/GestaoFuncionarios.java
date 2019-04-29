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

    public void inserirFuncionarios(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, double salario, double horas) {
        tTodos.add(new Funcionarios(nome, estatuto, ncontribuinte, telemovel, nib, salario, horas) {
            public double bonusPorHoraF() {
                double bonusHora = 0.00;
                double salarioTotal = 0.00;
                bonusHora = 5.0 * horas;
                salarioTotal = salario + bonusHora;
                return salarioTotal;
            }
            
            @Override
            public String toString() {
                StringBuilder output = new StringBuilder();
                output.append("Nome: ").append(this.getNome()).append("\n");
                output.append("Eatatuto: " + this.getEstatuto() + "\n");
                output.append("Numero de contribuinte: " + this.getNcontribuinte() + "\n");
                output.append("Telemóvel: " + this.getTelemovel() + "\n");
                output.append("NIB: " + this.getNib() + "\n");
                output.append("Salário : ").append(this.getSalario()).append("€\n");
                output.append("Horas Extra: ").append(this.getHoras()).append("\n");
                output.append("Salário com bonus: ").append(this.bonusPorHoraF()).append("€\n");
                return output.toString();
            }
            
        });
    }

    public String verTodos() {
        String output = "";
        for (int i = 0; i < tTodos.size(); i++) {
            output = tTodos.get(i).toString();
        }
        return output;
    }

    //pesquisa por nome 
    public String pesquisaNome(String nomep) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getNome().equalsIgnoreCase(nomep)) {
                output = f.toString();
                existe = true;
            }
        }
        if (!existe) {
            output = "Nome não encontrado\n";
        }

        return output;
    }

    //pesquisa por estatuto
    public String pesquisarEstatuto(String estatutop) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getEstatuto().equalsIgnoreCase(estatutop)) {
                output += f.getNome() + " : " + f.getEstatuto() + "\n";
                existe = true;
            }
        }
        if (!existe) {
            output = "Estatuto não encontrado\n";
        }

        return output;
    }

    //pesquisa por número de contribuinte
    public String pesquisarNcontribuinte(String ncontribuintep) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getNcontribuinte().equals(ncontribuintep)) {
                output = f.getNome()+" : "+f.getNcontribuinte() + "\n";
            }
        }
        if (!existe){
            output = "Número de contribuinte não encontrado!\n";
        }
        return output;
    }

    //pesquisa por nib
    public String pesquisarIban(String ibanp) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getNib().equalsIgnoreCase(ibanp)) {
                output = f.getNome()+" : "+f.getNib() + "\n";
            }
        }
        if (!existe){
            output = "Nib não encontrado!\n";
        }
        return output;
    }

    //pesquisa por telemovel
    public String pesquisarTelemovel(String telemovelp) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getTelemovel().equals(telemovelp)) {
                output = f.getNome()+" : "+f.getTelemovel() + "\n";
            }
        }
        if (!existe){
            output = "Número de telemóvel não encontrado!\n";
        }
        return output;
    }

    //pesquisa por salário
    public String pesquisarSalario(double salariop) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getSalario() == salariop) {
                output = f.getNome()+" : "+f.getSalario()+"\n";
            }
        }
        if (!existe){
            output = "Salário não encontrado!\n";
        }
        return output;
    }

    //pesquisa por horas feitas
    public String pesquisarHoras(double horasp) {
        String output = "Horas extras não feitas!\n";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if (f.getHoras() == horasp) {
                output += f.getNome()+" : "+f.getHoras()+" horas "+ "\n";
            }
        }   
        
        return output;
    }

    public String pesquisaSalariosEntreDoisSalarios(double salariomin, double salariomax) {
        String output = "";
        for (int i = 0; i < tTodos.size(); i++) {
            GestaoTodos f = tTodos.get(i);
            if ((f.getSalario() > salariomin) && (f.getSalario() < salariomax)) {
                output += f.getNome()+" : "+f.getSalario() + "\n";
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
