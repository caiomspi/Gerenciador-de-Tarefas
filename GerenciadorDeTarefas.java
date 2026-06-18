import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorDeTarefas {
    //variaveis
    static ArrayList<String> tarefas = new ArrayList<String>(); //array contendo tarefas
    static int id = 1;

    public static void adicionar(){
        Scanner sc = new Scanner(System.in);
        Tarefas t = new Tarefas();
        while(t.nome.equals("")){
            System.out.println("Qual o nome da tarefa que deseja adicionar: ");
            t.nome=sc.nextLine();
            if(t.nome.equals("")){
                System.out.println("Nome inválido");
            }
        }
        GerenciadorDeTarefas.tarefas.add(t.nome);
        System.out.println("Qual a descricao da tarefa: ");
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
        GerenciadorDeTarefas.id=GerenciadorDeTarefas.id+1;
    }

    public static void listar(){
        System.out.println(GerenciadorDeTarefas.tarefas);
    }
}
