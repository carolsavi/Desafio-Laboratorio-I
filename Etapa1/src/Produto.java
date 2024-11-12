public class Produto {
    
    //atributos
    private String nome;
    private double preco;

    //construtor

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    //metodos de acesso

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    //metodos

    public String toString(){
        return "Produto: " + nome + "\nPreço: " + preco;
    }


}
