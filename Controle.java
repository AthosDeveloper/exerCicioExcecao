package exercicioExcecao.controleCompras;

import java.util.Scanner;

public class Controle {
    public static void main(String[] args) {
       Menu menu = new Menu();

ListaAlimentos lista = new ListaAlimentos();
String tipo;
do {
    tipo = menu.lerTipo();
    if (!tipo.equals("sair")){
        try {
            Alimento alimento = menu.validarTipo(tipo);
            lista.adicionarAlimento(alimento);
        } catch (IllegalArgumentException | UnsupportedOperationException e){
            System.out.println(e.getMessage());

        }
    }
} while (!tipo.equals("sair"));
lista.exibirLista();
 }
}

