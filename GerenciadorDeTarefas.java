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

    
    //funcao para mostrar a lista de tarefas
    public static void listar(){
        int tam = GerenciadorDeTarefas.tarefas.size();
        String status;
        System.out.println("\nLista de Tarefas:");
        for(int i=0;i<tam;i+=4){
            if(Boolean.valueOf(GerenciadorDeTarefas.tarefas.get(i+2))==true){
                status="Feito!";
            }
            else{
                status = "Nao Feito!";
            }
            System.out.println(Integer.parseInt(GerenciadorDeTarefas.tarefas.get(i+3)) + " - " + GerenciadorDeTarefas.tarefas.get(i) + " - " + status + "\nDescricao: " + GerenciadorDeTarefas.tarefas.get(i+1) + "\n"); //por algum motivo precisou voltar para inteiro
        }
    }

    //funcao para alterar de não feito para feito ou vice versa
    public static void alterar(){
        Scanner sc = new Scanner(System.in);
        int tam = GerenciadorDeTarefas.tarefas.size(), escolha, i;
        String status;
        System.out.println("Qual tarefa você deseja alterar:\n");
        for(i=0;i<tam;i+=4){
            if(Boolean.valueOf(GerenciadorDeTarefas.tarefas.get(i+2))==true){
                status="Feito!";
            }
            else{
                status = "Nao Feito!";
            }
            System.out.print(Integer.parseInt(GerenciadorDeTarefas.tarefas.get(i+3)) + " - " + GerenciadorDeTarefas.tarefas.get(i) + " - " + status + "\nDescricao: " + GerenciadorDeTarefas.tarefas.get(i+1) + "\n\nResposta: "); //por algum motivo precisou voltar para inteiro
        }
        escolha=sc.nextInt()*3; //*3 ja que o id ta localizado nos multiplos de 3 do arraylist
        for(i=3;i<tam;i+=4){
            if(escolha==i){
                System.out.println(i);
                if(Boolean.valueOf(GerenciadorDeTarefas.tarefas.get(i-1))==false){
                    GerenciadorDeTarefas.tarefas.set(i-1, String.valueOf(true));
                }
                else{
                    GerenciadorDeTarefas.tarefas.set(i-1, String.valueOf(false));
                }
            }
        }
    }
}
