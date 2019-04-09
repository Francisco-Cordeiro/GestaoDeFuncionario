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
        tFuncionarios = new ArrayList();
    }

    private ArrayList<Funcionarios> tFuncionarios;

    public void inserirFuncionario(String nome, String estatuto,
            String ncontribuinte, String telemovel, String nib, float salario) {
        tFuncionarios.add(new Funcionarios(nome, estatuto, ncontribuinte, telemovel, nib, salario));
    }

    public void inseriFuncionario(Funcionarios funcionario) {
        tFuncionarios.add(funcionario);
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
        String output ="NÃO encontrado!\n";
        for (int i = 0; i <tFuncionarios.size() ; i++) {
            
            if( tFuncionarios.get(i).getNome().equals(nomep)){
                output = tFuncionarios.get(i).toString();
                
            }
        }
        return output;
    }
    //pesquisa por estatuto
    public String pesquisarEstatuto(String estatutop){
        String output ="NÃO encontrado!\n"; 
        for (int i = 0; i <tFuncionarios.size() ; i++) {
            
            if( tFuncionarios.get(i).getNome().equals(estatutop)){
                output = tFuncionarios.get(i).toString();
                
            }
        }
        return output;
    }
    //pesquisa por nc
    public String pesquisarNcontribuinte(String ncontp){
        String output ="NÃO encontrado!\n"; 
        for (int i = 0; i <tFuncionarios.size() ; i++) {
            
            if( tFuncionarios.get(i).getNome().equals(ncontp)){
                output = tFuncionarios.get(i).toString();
                
            }
        }
        return output;
    }
    //pesquisa por salario
    public String pesquisarSalario(float salariop){
        String output ="NÃO encontrado!\n"; 
        for (int i = 0; i <tFuncionarios.size() ; i++) {
            
            if( tFuncionarios.get(i).getSalario()==salariop){
                output = tFuncionarios.get(i).toString();
                
            }
        }
        return output;
    }
    //pesquisa por nib
    public String pesquisarNib(String nibp){
        String output ="NÃO encontrado!\n"; 
        for (int i = 0; i <tFuncionarios.size() ; i++) {
            //
            if( tFuncionarios.get(i).getNib().equals(nibp)){
                output = tFuncionarios.get(i).toString();
            }
            
        }
        return output;
    }
    //pesquisa por telemovel
     public String pesquisarTelemovel(String telemovelp){
        String output ="NÃO encontrado!\n"; 
        for (int i = 0; i <tFuncionarios.size() ; i++) {
            
            if( tFuncionarios.get(i).getNib().equals(telemovelp)){
                output = tFuncionarios.get(i).toString();
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
     
     
}
