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
        
        GestaoFuncionarios s = new GestaoFuncionarios();
        
        //GestaoTodos e = (GestaoTodos) s.gettTodos();
        
        s.inserirDiretor("Francisco Cordeiro", "Diretor", "43908778", "963452747","PT5019621327573912", 3000, 5.0);
        System.out.println(s.verTodos());
        s.inserirSubDiretor("Maria", "SubDiretor", "43908778", "963452747","PT50196213232573912", 2000, 5.0);
        System.out.println(s.verTodos());
        s.inserirFuncionario("João", "Funcionario", "24987667", "963425456", "PT501265324578912", 1000, 8.0);
        System.out.println(s.verTodos());
        
        System.out.println("-------");
        System.out.println("Pesquisa o estatuto Diretor:\n"+s.pesquisarEstatuto("Diretor"));
        System.out.println("-------");
        
        System.out.println("Pesquisa por horas: ");
        ArrayList<GestaoTodos> t = s.gettTodos();
        for(GestaoTodos a : t){
            System.out.println(a.getHoras());
            System.out.println("-------");
        }
        
        System.out.println("-------");
        System.out.println("Pesquisa por horas feitas: \n\n"+s.pesquisarHoras(5)); 
        System.out.println("-------");
      
    }
    
}
