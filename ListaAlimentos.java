package exercicioExcecao.controleCompras;

import java.util.ArrayList;

public class ListaAlimentos {
    private ArrayList<Alimento> lista;
    public ListaAlimentos(){
        lista = new ArrayList<>();
    }
    public void adicionarAlimento(Alimento alimento){
        lista.add(alimento);
    }
    public void exibirLista(){
        if (lista.isEmpty()){
            System.out.println("não há elementos na lista.");
        } else {
            System.out.println("a lista tem " + lista.size() + " alimentos: ");

            for (Alimento alimento: lista){
                System.out.println("nome: " + alimento.getNome());
                System.out.println("quantidade: " + alimento.getQuantidade());
                System.out.println();

            }
        }
    }
}
