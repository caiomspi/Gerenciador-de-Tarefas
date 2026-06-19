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
        GerenciadorDeTarefas.id+=1;
    }

    //funcao para listar 
    public static void listar(){
        Tarefas t = new Tarefas();
        int tam = GerenciadorDeTarefas.tarefas.size();
        String status;
        System.out.println("\nLista de Tarefas:");
        if(t.status==true){
            status="Feito!";
        }
        else{
            status = "Nao Feito!";
        }
        for(int i=0;i<tam;i+=4){
            System.out.println(Integer.parseInt(GerenciadorDeTarefas.tarefas.get(i+3)) + " - " + GerenciadorDeTarefas.tarefas.get(i) + " - " + status + "\nDescricao: " + GerenciadorDeTarefas.tarefas.get(i+1) + "\n"); //por algum motivo precisou voltar para inteiro
        }
    }
}
