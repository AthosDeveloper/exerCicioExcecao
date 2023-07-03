package exercicioExcecao.controleCompras;

public class Grao extends  Alimento{
    public Grao(String nome, double quantidade) {
        super(nome, quantidade);
        setNome(nome);
        setQuantidade(quantidade);

    }
    public double getQuantidadeDouble(){
        if (this.getQuantidade() instanceof Double){
            return  (double) this.getQuantidade();
        } else  {
            throw new NumberFormatException("para grão, a quantidade deve ser informada com ponto. ");
        }

    }


}
