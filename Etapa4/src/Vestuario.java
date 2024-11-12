public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int capacidadeMaxima){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeMaxima);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    public String toString(){
        return "A loja de nome " + getNome() + "foi fundada em " + getDataFundacao() + ", " + (produtosImportados? "" : "não") + "vende produtos importados, possui " 
        + getQuantidadeFuncionarios()
    + " funcionários, e tem como salário base de funcionários " + getSalarioBaseFuncionario() + " reais.";
    }
}
    

