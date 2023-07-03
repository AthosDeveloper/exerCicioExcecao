package exercicioExcecao.controleCompras;

import java.util.ArrayList;
import java.util.List;

public class Alimento {
    private String nome;
private Number quantidade;

    public Alimento(String nome, Number quantidade) {
        this.nome = nome;
  this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Number getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Number quantidade) {
        this.quantidade = quantidade;
    }
}
