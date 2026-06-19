import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    //variaveis
    static ArrayList<String> tarefas = new ArrayList<String>(); //array contendo tarefas
    static int id = 1;

    //funcao par adicionar nova tarefa e guardar dentro do arraylist tarefas
    public static void adicionar(){
        Scanner sc = new Scanner(System.in);
        Tarefas t = new Tarefas();
        while(t.nome.equals("")){
            System.out.print("Qual o nome da tarefa que deseja adicionar: ");
            t.nome=sc.nextLine();
            if(t.nome.equals("")){
                System.out.println("\nNome inválido\n");
            }
        }
        GerenciadorDeTarefas.tarefas.add(t.nome);
        System.out.print("\nQual a descricao da tarefa: ");
        t.descricao=sc.nextLine();
        if(t.descricao.equals("")){
            GerenciadorDeTarefas.tarefas.add("Sem descricao.");
        }
        else{
            GerenciadorDeTarefas.tarefas.add(t.descricao);
        }
        GerenciadorDeTarefas.tarefas.add(String.valueOf(t.status));
        t.id=GerenciadorDeTarefas.id;
        GerenciadorDeTarefas.tarefas.add(String.valueOf(t.id));
        GerenciadorDeTarefas.id+=1;
    }

    
    //funcao para mostrar a lista de tarefas
    public static void listar(){
        int tam = GerenciadorDeTarefas.tarefas.size(), cont=1;
        String status;
        System.out.println("\nLista de Tarefas:");
        for(int i=0;i<tam;i+=4){
            if(Boolean.valueOf(GerenciadorDeTarefas.tarefas.get(i+2))==true){
                status="Feito!";
            }
            else{
                status = "Nao Feito!";
            }
            System.out.println(cont + " - " + GerenciadorDeTarefas.tarefas.get(i) + " - " + status + " - ID: " + Integer.parseInt(GerenciadorDeTarefas.tarefas.get(i+3)) + "\nDescricao: " + GerenciadorDeTarefas.tarefas.get(i+1) + "\n"); //por algum motivo precisou voltar para inteiro
            cont++;
        }
    }

    //funcao para alterar de não feito para feito ou vice versa
    public static void alterar(){
        Scanner sc = new Scanner(System.in);
        int tam = GerenciadorDeTarefas.tarefas.size(), escolha, i, cont=1, valor;
        String status;
        System.out.println("Qual tarefa você deseja alterar:\n");
        for(i=0;i<tam;i+=4){
            if(Boolean.valueOf(GerenciadorDeTarefas.tarefas.get(i+2))==true){
                status="Feito!";
            }
            else{
                status = "Nao Feito!";
            }
            System.out.print(cont + " - " + GerenciadorDeTarefas.tarefas.get(i) + " - " + status + " - ID: " + "\nDescricao: " + GerenciadorDeTarefas.tarefas.get(i+1) + "\n"); //por algum motivo precisou voltar para inteiro
            cont++;
        }
        System.out.print("Resposta: ");
        escolha = sc.nextInt();
        valor = (escolha * 3)+(escolha-1); //conta para encontrar o id atraves da escolha
        for(i=3;i<tam;i+=4){
            if(valor==i){
                if(Boolean.valueOf(GerenciadorDeTarefas.tarefas.get(i-1))==false){
                    GerenciadorDeTarefas.tarefas.set(i-1, String.valueOf(true));
                }
                else{
                    GerenciadorDeTarefas.tarefas.set(i-1, String.valueOf(false));
                }
            }
        }
        
    }

    //funcao para remover uma tarefa
    public static void remover(){
        Scanner sc = new Scanner(System.in);
        int i, tam=GerenciadorDeTarefas.tarefas.size(), cont=1, escolha, valor;
        System.out.println("Qual tarefa deseja remover?\n");
        for(i=0 ; i<tam ; i+=4){
            System.out.println(cont + " - " + GerenciadorDeTarefas.tarefas.get(i) + "\nDescricao: " + GerenciadorDeTarefas.tarefas.get(i+1) + "\n");
            cont++;
        }
        escolha = sc.nextInt();
        valor=(escolha*3)+(escolha-1);
        for(i=3;i<tam;i+=4){
            if(valor==i){
                GerenciadorDeTarefas.tarefas.remove(i);
                GerenciadorDeTarefas.tarefas.remove(i-1);
                GerenciadorDeTarefas.tarefas.remove(i-2);
                GerenciadorDeTarefas.tarefas.remove(i-3);
            }
        }
    }
}
