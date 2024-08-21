package atividade.com;

import java.util.ArrayList;
import java.util.Iterator;

public class GerenciadorDeTarefas {

    // Lista para armazenar as tarefas
    private ArrayList<Tarefa> tarefas;

    // Construtor para inicializar a lista de tarefas
    public GerenciadorDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    // Método para adicionar uma nova tarefa
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    // Método para remover uma tarefa pelo título
    public void removerTarefa(String titulo) {
        Iterator<Tarefa> iterator = tarefas.iterator();
        while (iterator.hasNext()) {
            Tarefa tarefa = iterator.next();
            if (tarefa.getTitulo().equals(titulo)) {
                iterator.remove();
                return;
            }
        }
        System.out.println("Tarefa com o título '" + titulo + "' não encontrada.");
    }

    // Método para marcar uma tarefa como concluída pelo título
    public void marcarComoConcluida(String titulo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                tarefa.setConcluida(true);
                return;
            }
        }
        System.out.println("Tarefa com o título '" + titulo + "' não encontrada.");
    }

    // Método para listar todas as tarefas
    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
            return;
        }
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    // Método principal para testar a funcionalidade
    public static void main(String[] args) {
        // Criar o gerenciador de tarefas
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        // Adicionar tarefas
        gerenciador.adicionarTarefa(new Tarefa("Estudar Java", "Revisar conceitos de POO", false));
        gerenciador.adicionarTarefa(new Tarefa("Fazer compras", "Comprar ingredientes para o jantar", false));
        gerenciador.adicionarTarefa(new Tarefa("Ler livro", "Ler capítulo sobre algoritmos", false));

        // Listar todas as tarefas
        System.out.println("Lista de Tarefas:");
        gerenciador.listarTarefas();

        // Marcar uma tarefa como concluída
        gerenciador.marcarComoConcluida("Estudar Java");

        // Listar tarefas após marcar uma como concluída
        System.out.println("\nLista de Tarefas Após Marcar Como Concluída:");
        gerenciador.listarTarefas();

        // Remover uma tarefa
        gerenciador.removerTarefa("Fazer compras");

        // Listar tarefas após a remoção
        System.out.println("\nLista de Tarefas Após Remoção:");
        gerenciador.listarTarefas();

        // Tentar remover uma tarefa que não existe
        gerenciador.removerTarefa("Tarefa Inexistente");

        // Listar tarefas após tentar remover uma tarefa inexistente
        System.out.println("\nLista de Tarefas Após Tentativa de Remoção de Tarefa Inexistente:");
        gerenciador.listarTarefas();
    }
}
