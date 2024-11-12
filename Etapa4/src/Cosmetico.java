public class Cosmetico extends Loja {
    private double taxaComercializacao;


    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeMaxima, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeMaxima);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }

    //sobrescrever o metodo tostring

    public String toString(){
        return "A loja de cosmético de nome " + getNome() + "foi fundada em " + getDataFundacao() + " possui " + getQuantidadeFuncionarios()
        + " funcionários, tem como salário base de funcionários " + getSalarioBaseFuncionario() + " reais, e a taxa de comercialização de " + taxaComercializacao + ".";
   }


}
