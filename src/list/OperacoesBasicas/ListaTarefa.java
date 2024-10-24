package list.OperacoesBasicas;

import java.util.*;

public class ListaTarefa {
//atributo chamado listatarefa

private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
}
    
public void removerTarefa (String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa x: tarefaList) {
        if (x.getDescricao().equalsIgnoreCase(descricao)) {
            tarefasParaRemover.add(x);
        }
    }

tarefaList.removeAll(tarefasParaRemover);
}

public int obterNumeroTotalTarefas () {
    return tarefaList.size();
}

public void obterDescricoesTarefas() { 
    System.out.println(tarefaList);
}

public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println( "o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.adicionarTarefa("tarefa 1");
    listaTarefa.adicionarTarefa("tarefa 1");
    listaTarefa.adicionarTarefa("tarefa 3");
    System.out.println( "o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("tarefa 1");
    System.out.println( "o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    
    listaTarefa.obterDescricoesTarefas();

}

}

