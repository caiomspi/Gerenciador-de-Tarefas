import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //declaracao de variaveis
        int resp=0;
        Scanner sc = new Scanner(System.in);

        //menu
        while(resp!=5){
            System.out.println("Bem vindo ao Sistema de Gerenciamento de tarefas!\n\nDeseja realizar qual ação?\n1 - Adicionar Tarefa Nova\n2 - Remover Tarefa Existente\n 3 - Listar Tarefas\n4 - Alterar Tarefa Existente\n 5 - Sair");
            resp=sc.nextInt();
            switch(resp){
                //adicionar tarefa
                case 1:

                    break;

                //remover tarefa
                case 2:

                    break;

                //listar tarefas
                case 3:

                    break;

                //alterar tarefa
                case 4:

                    break;
                
                //sair
                case 5:
                    break;
                
                //outros valores
                default:
                    System.out.println("Valor Inválido!");
                    break;

            }
        }
        sc.close();
    }
}