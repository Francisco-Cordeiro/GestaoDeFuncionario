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
public class GestaoDeFuncionariosDeSupermercados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GestaoFuncionarios s = new GestaoFuncionarios();

        s.inserirTodos("Francisco Cordeiro", "Diretor", "43908778", "963452747", "PT5019621327573912", 3000, 5.0);
        System.out.println(s.verTodos());
        s.inserirTodos1("Maria", "Sub-Diretor", "43908778", "963452747", "PT50196213232573912", 2000, 5.0);
        System.out.println(s.verTodos());
        s.inserirTodos2("João", "Funcionario", "24987667", "963425456", "PT501265324578912", 1000, 8.0);
        System.out.println(s.verTodos());
        s.inserirTodos("Francisco José", "Sub-Diretor", "40929365", "914536091", "PT509235320578912", 1900, 6.0);
        System.out.println(s.verTodos());

        System.out.println("-------");
        System.out.println("Pesquisa por nome Francisco Cordeiro: \n" + s.pesquisaNome("Francisco Cordeiro"));
        System.out.println("-------");
        System.out.println("Pesquisa o estatuto SubDiretor:\n" + s.pesquisarEstatuto("Sub-Diretor"));
        System.out.println("-------");
        System.out.println("Pesquisa por horas feitas: \n" + s.pesquisarHoras(5.0));
        System.out.println("-------");
        System.out.println("Pesquisa os salarios entre 1500 e 2000: \n" + s.pesquisaSalariosEntreDoisSalarios(1500, 2000));

    }

}
