package Visao;

import java.util.Scanner;

import Dominio.Colaborador;
import Servico.ColaboradorSrv;

public class ColaboradorMenu extends AbsMenu{

    private ColaboradorSrv servico;

    public void executar() {
        int opcao = 0;
        while (opcao != 9) {
            System.out.println("\n\n");
            opcao = this.exibirMenuPrincipal("COLABORADOR");
            switch (opcao) {
                case 1:
                    this.exibirTabela();
                    break;
                case 2:
                    this.pesquisarPorCodigo();
                default:
                    break;
            }
        }
    }
   
    private void exibirTabela(){
        System.out.println("\n\n");
        System.out.println("***** LISTAR COLABORADOR *****");
        for (Colaborador item : this.servico.Listar()) {
            item.exibir();
        }
    }

    private void pesquisarPorCodigo(){
        System.out.println("\n\n");
        System.out.println("***** PESQUISAR COLABORADOR POR CÓDIGO *****");
        System.out.print("Informe um código: ");
        int codigo = this.scan.nextInt();
        Colaborador colab = this.servico.Buscar(codigo);
        colab.exibir();
    }


    public ColaboradorMenu(){
        this.scan = new Scanner(System.in);
        this.servico = new ColaboradorSrv();
    }
}
