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
        
        s.inserirFuncionario("João", "Funcionario", "24987667", "963425456", "PT501265324578912", 1000, 8);
        System.out.println(""+s.verFuncionario());
        s.inserirDiretor("Fracisco Cordeiro", "Diretor", "43908778", "963452747","PT5019621327573912", 3000, 5);
        System.out.println(""+s.verDiretor());
    }
    
}
