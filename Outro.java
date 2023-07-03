package exercicioExcecao.controleCompras;

public class Outro extends Alimento{
    public Outro(String nome, int quantidade) {
        super(nome, quantidade);
   setNome(nome);
   setQuantidade(quantidade);
    }
    public int getInt(){
        if (this.getQuantidade() instanceof  Integer){
            return  (int) this.getQuantidade();
        } else {
            throw new NumberFormatException("para outros, a quantidade deve ser informada em unidades inteiras ");
        }
    }
}
