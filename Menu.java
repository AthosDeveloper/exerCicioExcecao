package exercicioExcecao.controleCompras;

import java.util.Scanner;

public class Menu {
    private Scanner sc  = new Scanner(System.in);
    public String lerTipo(){
        System.out.println("digite o tipo de alimento que você deseja incluir na lista ou 'sair' para terminar.");
        String tipo = sc.nextLine();
        return  tipo;
    }
    public String lerNome() throws UnsupportedOperationException{
        System.out.println("digite o nome do alimento.");
        String nome = sc.nextLine();
        if (nome.isEmpty()){
            throw new UnsupportedOperationException("não é permitido inserir nome vazio.");
        }
        return  nome;
    }
    public Number lerQuantidade(String tipo) throws NumberFormatException, UnsupportedOperationException {
        System.out.println("digite a quantidade do alimento em gramas.");
        String quantidade = sc.nextLine();
if (quantidade.isEmpty()){
    throw new UnsupportedOperationException("não é permitido inserir valor vazio.");

}
if (tipo.equals("verdura") || tipo.equals("grão")){
    try {
        double qtd = Double.parseDouble(quantidade);
        if (qtd < 0) {
            System.out.println("não é permitido inserir valor negativo.");
            return lerQuantidade(tipo);
        }
        return qtd;

    }  catch (NumberFormatException e){
 throw new NumberFormatException("para verdura ou grão, a quantidade deve ser informado com ponto. ");



    }


} else  {
    try {
      int qtd = Integer.parseInt(quantidade);
       if (qtd < 0){
           System.out.println("não é permitido inserir um valor negativo");
      return  lerQuantidade(tipo);
       }
       return  qtd;

        } catch (NumberFormatException e){
        throw new NumberFormatException("para legume ou outro, a quantidade em unidade deve ser apenas inteiro.");
    }
}
    }

  public Alimento validarTipo(String tipo) throws IllegalArgumentException {
        switch (tipo){
            case "verdura":
String nomeVerdura  = lerNome();
double qtdVerdura = (double) lerQuantidade(tipo);
      return  new Verdura(nomeVerdura, qtdVerdura);
            case  "legume":
                String nomeLegume = lerNome();
                int qtdLegume = (int) lerQuantidade(tipo);
      return new Legume(nomeLegume, qtdLegume);
            case  "grão":
                String nomeGrao = lerNome();
                double qtdGrao = (double) lerQuantidade(tipo);
                return new Grao(nomeGrao, qtdGrao);
            case "outro":
                String nomeOutro = lerNome();
       int qtdOutro = (int) lerQuantidade(tipo);
       return new Outro(nomeOutro, qtdOutro);
            default:
                throw new IllegalArgumentException("alimento inválido");

        }
  }

}
