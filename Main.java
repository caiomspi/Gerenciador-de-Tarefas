import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //declaracao de variaveis
        int resp=0;
        Scanner sc = new Scanner(System.in);

        //menu
        while(resp!=5){
            System.out.print("Bem vindo ao Sistema de Gerenciamento de tarefas!\n\nDeseja realizar qual ação?\n1 - Adicionar Tarefa Nova\n2 - Remover Tarefa Existente\n3 - Listar Tarefas\n4 - Alterar Tarefa Existente\n5 - Sair\n\nResposta: ");
            resp=sc.nextInt();
            switch(resp){
                //adicionar tarefa
                case 1:
                    GerenciadorDeTarefas.adicionar();
                    break;

                //remover tarefa
                case 2:
                    GerenciadorDeTarefas.remover();
                    break;

                //listar tarefas
                case 3:
                    GerenciadorDeTarefas.listar();
                    break;

                //alterar tarefa
                case 4:
                    GerenciadorDeTarefas.alterar();
                    break;
                
                //sair
                case 5:
                    break;
                
                //outros valores
                default:
                    System.out.println("\nValor Inválido!\n");
                    break;

            }
        }
        sc.close();
    }
}