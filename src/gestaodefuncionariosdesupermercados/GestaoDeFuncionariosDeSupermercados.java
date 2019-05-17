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
        Funcionarios f = new Funcionarios();

        s.inserirFuncionarios("Francisco Cordeiro", "Diretor", "439087785", "963452747", "PT5019621327573912", 3000.00, 5.00);
        System.out.println(s.verTodos());
        s.inserirFuncionarios("Maria", "Sub-Diretor", "439087789", "963452747", "PT50196213232573912", 2000.00, 5.00);
        System.out.println(s.verTodos());
        s.inserirFuncionarios("João", "Funcionario", "249876673", "963425456", "PT501265324578912", 1000.00, 8.00);
        System.out.println(s.verTodos());
        s.inserirFuncionarios("Francisco José", "Sub-Diretor", "409293650", "914536091", "PT509235320578912", 1900.00, 6.00);
        System.out.println(s.verTodos());

        System.out.println("-------");
        System.out.println("Pesquisa por nome Francisco Cordeiro: \n" + s.pesquisaNome("Francisco Cordeiro"));
        System.out.println("-------");
        System.out.println("Pesquisa o estatuto SubDiretor:\n" + s.pesquisarEstatuto("Sub-Diretor"));
        System.out.println("-------");
        System.out.println("Pesquisa por horas feitas: \n" + s.pesquisarHoras(5.00));
        System.out.println("-------");
        System.out.println("Pesquisa os salarios entre 0 e 4000: \n" + s.pesquisaSalariosEntreDoisSalarios(0, 4000));
        System.out.println("-------");
        System.out.println("Pesquisa os salarios com bonus: \n" + s.bonusPorHora());

    }

}
