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
public class GestaoDeFuncionariosDeSupermercados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GestaoFuncionarios f = new GestaoFuncionarios();
        
        f.inserirFuncionario("João", "Diretor", "230453759", "936458109", "PT500345752956", (float)3000.00);
        Funcionarios funcionarios = new  Funcionarios("Francisco Cordeiro", "Sub-Diretor", "232015883", "967386122" ,"PT500345252961", (float)1500.00);
        f.inseriFuncionario(funcionarios);
        ArrayList<Funcionarios> t = f.gettFuncionarios();
        for(Funcionarios a:t){
            System.out.println(""+a.toString());
        }
        System.out.println("Pesquisa o nome João: \n"+f.pesquisaNome("João"));
        System.out.println("Pesquisar o número de contribuinte: \n"+f.pesquisarNcontribuinte("232015883"));
    }
    
}
