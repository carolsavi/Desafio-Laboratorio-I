public class Alimentacao extends Loja {
    private Data dataAlvara;


    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return dataAlvara;
    }
    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    public String toString(){
        return "A loja de nome " + getNome() + "foi fundada em " + getDataFundacao() + " possui " + getQuantidadeFuncionarios()
         + " funcionários, e tem como salário base de funcionários " + getSalarioBaseFuncionario() + " reais. A data do alvará é " + dataAlvara;
    }

}
