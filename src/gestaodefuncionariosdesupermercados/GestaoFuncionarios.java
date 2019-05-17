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
        this.fu = new Funcionarios();
        tFuncionarios = new ArrayList<>();
    }

    //variaveis
    private ArrayList<Funcionarios> tFuncionarios;
    Funcionarios fu;
    private double bonusHora = 0;
    private double salarioTotal = 0;
    
    public void inserirFuncionarios(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, double salario, double horas) {
        tFuncionarios.add(new Funcionarios(nome, estatuto, ncontribuinte, telemovel, nib, salario, horas));
    }
    
    public String verTodos() {
        String output = "";
        for (int i = 0; i < tFuncionarios.size(); i++) {
            output += tFuncionarios.get(i).toString();
        }
        return output;
    }
    
    public double bonusPorHora() {
        bonusHora = 5.0 *fu.getHoras();
        salarioTotal = fu.getSalario() + bonusHora;
        return salarioTotal;
    }
    //pesquisa por nome 
    public String pesquisaNome(String nomep) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tFuncionarios.size(); i++) {
            Funcionarios f = tFuncionarios.get(i);
            if (f.getNome().equalsIgnoreCase(nomep)) {
                output += f.getNome();
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
        for (int i = 0; i < tFuncionarios.size(); i++) {
            Funcionarios f = tFuncionarios.get(i);
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
        for (int i = 0; i < tFuncionarios.size(); i++) {
            Funcionarios f = tFuncionarios.get(i);
            if (f.getNcontribuinte().equals(ncontribuintep)) {
                output += f.getNome() + " : " + f.getNcontribuinte() + "\n";
                 existe = true;
            }
        }
        if (!existe) {
            output = "Número de contribuinte não encontrado!\n";
        }
        return output;
    }

    //pesquisa por nib
    public String pesquisarIban(String ibanp) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tFuncionarios.size(); i++) {
            Funcionarios f = tFuncionarios.get(i);
            if (f.getIBAN().equalsIgnoreCase(ibanp)) {
                output += f.getNome() + " : " + f.getIBAN() + "\n";
                existe = true;
            }
        }
        if (!existe) {
            output = "Nib não encontrado!\n";
        }
        return output;
    }

    //pesquisa por telemovel
    public String pesquisarTelemovel(String telemovelp) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tFuncionarios.size(); i++) {
            Funcionarios f = tFuncionarios.get(i);
            if (f.getTelemovel().equals(telemovelp)) {
                output += f.getNome() + " : " + f.getTelemovel() + "\n";
                 existe = true;
            }
        }
        if (!existe) {
            output = "Número de telemóvel não encontrado!\n";
        }
        return output;
    }

    //pesquisa por salário
    public String pesquisarSalario(double salariop) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tFuncionarios.size(); i++) {
            Funcionarios f = tFuncionarios.get(i);
            if (f.getSalario() == salariop) {
                output += f.getNome() + " : " + f.getSalario() + "\n";
                 existe = true;
            }
        }
        if (!existe) {
            output = "Salário não encontrado!\n";
        }
        return output;
    }

    //pesquisa por horas feitas
    public String pesquisarHoras(double horasp) {
        String output = "";
        boolean existe = false;
        for (int i = 0; i < tFuncionarios.size(); i++) {
            Funcionarios f = tFuncionarios.get(i);
            if (f.getHoras() == horasp) {
                output += f.getNome() + " : " + f.getHoras() + " horas " + "\n";
                 existe = true;
            }
        }
         if (!existe) {
            output = "Horas extras não feitas!\n";
        }
        return output;
    }

    public String pesquisaSalariosEntreDoisSalarios(double salariomin, double salariomax) {
        String output = "";
         boolean existe = false;
        for (int i = 0; i < tFuncionarios.size(); i++) {
            Funcionarios f = tFuncionarios.get(i);
            if ((f.getSalario() > salariomin) && (f.getSalario() < salariomax)) {
                output += f.getNome() + " : " + f.getSalario() + "\n";
                 existe = true;
            }
        }
        if (!existe) {
            output = "Salários não encontrado!\n";
        }
        return output;
    }

    //gets e sets do array

    public ArrayList<Funcionarios> gettFuncionarios() {
        return tFuncionarios;
    }

    public void settFuncionarios(ArrayList<Funcionarios> tFuncionarios) {
        this.tFuncionarios = tFuncionarios;
    }
    
}
