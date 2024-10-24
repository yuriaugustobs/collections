package list.OperacoesBasicas;

public class Tarefa {
//criando atributo de descricao

private String descricao;

public Tarefa(String descricao) {
    this.descricao = descricao;
}

public String getDescricao() {
    return descricao;
    }


    @Override
    public String toString() {
        return(descricao);
    }


}
