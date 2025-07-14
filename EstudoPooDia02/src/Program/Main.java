package Program;

import application.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Task> tasksList = new ArrayList<>();
        int nextId = 1;

        while (true) {
            System.out.println("=== MENU ===");
            System.out.println("1 - Criar Tarefa");
            System.out.println("2 - Lista Tarefas");
            System.out.println("3 - Marca como concluido");
            System.out.println("4 - Remover Tarefa");
            System.out.println("5 - Sair");

            int opMenu = sc.nextInt();
            sc.nextLine();

            switch (opMenu) {
                case 1:
                    System.out.println("Entre com os dados: ");

                    System.out.println("Title: ");
                    String titleTarefa = sc.nextLine();

                    System.out.println("Description: ");
                    String desccriptionTarefa = sc.nextLine();


                    Task task = new Task(nextId, titleTarefa, desccriptionTarefa);
                    tasksList.add(task);
                    nextId++;
                    System.out.println("Tarefa adionada com sucesso");

                    break;

                case 2:
                    if (tasksList.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadrastada no momento.");
                    } else {
                        for (Task task1 : tasksList) {
                            System.out.println(task1);
                        }
                    }
                    break;


                case 3:
                    System.out.println("Informe o id da tarefa que deseja marca como concluida: ");
                    int idBusca = sc.nextInt();
                    boolean encontrado = false;
                    for (Task task1 : tasksList) {
                        if (task1.getId() == idBusca) {
                            encontrado = true;
                            task1.marcaConcluido();
                            System.out.println("Tarefa atualizada com sucesso.");
                            System.out.println(task1);
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Tarefa nao encontrada.");
                    }
                    break;

                case 4:
                    System.out.println("Qual tarefa deseja remover, insira o id para a busca.");
                    int idRemover = sc.nextInt();
                    boolean idEncontrado = false;
                    for (int i = 0; i < tasksList.size(); i++) {
                        if (tasksList.get(i).getId() == idRemover) {
                            idEncontrado = true;
                            Task removida = tasksList.remove(i);
                            System.out.println("Tarefa removida com sucesso");
                            System.out.println(removida);
                            break;
                        }
                    }
                    if (!idEncontrado) {
                        System.out.println("Tarefa nao encontrada.");
                    }
                    break;


                case 5:
                    System.out.println("Programa encerrando.....");
                    sc.close();
                    return;

                default:
                    System.out.println("Numero invalido, tente novamente");
            }
        }
    }
}



