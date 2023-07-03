package exercicioExcecao.controleCompras;

public class Verdura extends Alimento {
    public Verdura(String nome, double quantidade) {
        super(nome, quantidade);
   setNome(nome);
   setQuantidade(quantidade);
    }
    public double getDouble(){
        if (this.getQuantidade() instanceof Double){
            return  (double) this.getQuantidade();
        } else{
            throw new NumberFormatException("para verdura, a quantidade deve ser informada com ponto.");
        }
    }



}
