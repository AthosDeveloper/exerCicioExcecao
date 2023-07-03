package exercicioExcecao.controleCompras;

public class Legume extends  Alimento{
    public Legume(String nome, int quantidade) {
        super(nome, quantidade);
  setNome(nome);
  setQuantidade(quantidade);
    }
    public int getInt(){
        if (this.getQuantidade() instanceof  Integer){
            return  (int) this.getQuantidade();
        } else {
            throw new NumberFormatException("para legume, a quantidade deve ser informada em unidades inteiras.");
        }
    }
}
