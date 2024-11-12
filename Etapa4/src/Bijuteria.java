public class Bijuteria extends Loja{
        private double metaVendas;

        public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeMaxima, double metaVendas){
            super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeMaxima);
            this.metaVendas = metaVendas;
        }


        public double getMetaVendas(){
            return metaVendas;
        }
        public void setMetaVendas(double metaVendas){
            this.metaVendas = metaVendas;
        }

        public String toString(){
            return "A loja de nome " + getNome() + "foi fundada em " + getDataFundacao() + " possui " + getQuantidadeFuncionarios()
             + " funcionários, tem como salário base de funcionários " + getSalarioBaseFuncionario() + " reais, e a meta de vendas em R$" + metaVendas;
        }


}
