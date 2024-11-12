public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }




    public String toString(){
        return "A loja de nome " + getNome() + "foi fundada em " + getDataFundacao() + ", possui seguro dos eletrônicos de " + seguroEletronicos +
        "reais, possui " + getQuantidadeFuncionarios() + " funcionários, e tem como salário base de funcionários " 
        + getSalarioBaseFuncionario() + " reais.";
    }

    
}
