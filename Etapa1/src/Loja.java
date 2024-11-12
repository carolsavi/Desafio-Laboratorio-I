public class Loja{
    //atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;


    //construtores

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        salarioBaseFuncionario = -1;
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


    //metodos
    
    public String toString(){
        return "A loja de nome " + nome + " possui " + quantidadeFuncionarios
         + " funcionários, e tem como salário base de funcionários " + salarioBaseFuncionario + " reais.";
    }

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


}