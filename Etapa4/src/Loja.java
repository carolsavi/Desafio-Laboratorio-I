public class Loja{
    //atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    private int capacidadeMaxima;
    private int estoqueAtualProdutos;


    //construtores

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeMaxima){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.capacidadeMaxima = capacidadeMaxima;
        this.estoqueProdutos = new Produto[capacidadeMaxima];
        estoqueAtualProdutos = 0;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int capacidadeMaxima){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        salarioBaseFuncionario = -1;
        this.capacidadeMaxima = capacidadeMaxima;
        estoqueAtualProdutos = 0;
    }

    //metodos de acesso

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public Data getDataFundacao(){
        return dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }
    public Produto[] getEstoqueProdutos(){
       return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

    public int getCapacidadeMaxima(){
        return capacidadeMaxima;
    }
    public void setCapacidadeMaxima(int capacidadeMaxima){
        this.capacidadeMaxima = capacidadeMaxima;
    }

    //MÉTODOS
    
   
    public double gastosComSalario(){
        if (salarioBaseFuncionario == -1){
            return -1;
        }
        else{
            double gastos = salarioBaseFuncionario * quantidadeFuncionarios;
            return gastos;
        }
    }

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10){
            return 'P';}
        else if (quantidadeFuncionarios <= 30){
            return 'M';}
        else{
            return 'G';}
    }

    public void imprimeProdutos(){
        String imprimir = "";
        for(int i = 0; i<estoqueProdutos.length; i++){
            if (i<estoqueProdutos.length - 2)
                imprimir += estoqueProdutos[i] + ", ";
            else if (i<estoqueProdutos.length -1)
                imprimir += estoqueProdutos[i] + " e ";
            else
                imprimir += estoqueProdutos[i] + ".";
        }
        System.out.println("Produtos no estoque: " + imprimir);
    }


    public boolean insereProduto(Produto produto){
        if (estoqueProdutos.length < capacidadeMaxima){
            estoqueProdutos[estoqueAtualProdutos + 1] = produto;
            return true;
        } else{
            return false;
        }
    }


    public boolean removeProduto(String nome){
        for (int i = 0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i].getNome().equalsIgnoreCase(nome)){
                estoqueProdutos[i] = estoqueProdutos[i + 1];
                estoqueProdutos[estoqueAtualProdutos - 1] = null;
                estoqueAtualProdutos --;
                return true;
            }
        }
        return false;
    }


    public int contarProdutos(){
        return estoqueAtualProdutos;
    }

    public String toString(){
        return "A loja de nome " + nome + "foi fundada em " + dataFundacao + " possui " + quantidadeFuncionarios
         + " funcionários, e tem como salário base de funcionários " + salarioBaseFuncionario + " reais. O estoque de produtos possui os seguintes produtos: " + estoqueProdutos;
    }


}