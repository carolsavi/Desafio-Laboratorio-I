public class Shopping {
    //ATRIBUTOS
    
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int capacidadeMaximaShopping;
    private int tamanhoAtual;

    //CONSTRUTORES
    public Shopping(String nome, Endereco endereco, int capacidadeMaximaShopping){
        this.nome = nome;
        this.endereco = endereco;
        this.capacidadeMaximaShopping = capacidadeMaximaShopping;
        lojas = new Loja[capacidadeMaximaShopping];
        tamanhoAtual = 0;
    }

    //GETTERS E SETTERS
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    public int getCapacidadeMaximaShopping(){
        return capacidadeMaximaShopping;
    }
    public void setCapacidadeMaximaShopping(int capacidadeMaximaShopping){
        this.capacidadeMaximaShopping = capacidadeMaximaShopping;
    }
    public Loja[] getLojas(){
        return this.lojas;

    }
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }
    
    //MÉTODOS

    public String toString(){
        return "--Shopping--" +
        "\nNome: " + nome + "\nEndereco: " + endereco +
        "\nLojas: " + lojas +
        "\nCapacidadeMaximaShopping: " + capacidadeMaximaShopping;
    }


    public boolean insereLoja(Loja loja){
        if (tamanhoAtual < capacidadeMaximaShopping){
            lojas[tamanhoAtual] = loja;
            tamanhoAtual ++;
            return true;
        }
        return false;
    }


    public boolean removeLoja(String nome){
        for (int i = 0; i<lojas.length; i++){
            if(lojas[i].getNome().equalsIgnoreCase(nome)){
                lojas[i] = lojas[i + 1];
                lojas[tamanhoAtual - 1] = null;
                tamanhoAtual --;
                return true;
            }
        }
        return false;
    }


    public int quantidadeLojasPorTipo(String tipo){
        int count = 0;
        for (int i = 0; i<lojas.length; i++){
            if(lojas[i] != null && lojas[i].getClass().getSimpleName().equalsIgnoreCase(tipo)){
                count++;
            }
        }
        return count;
    }


    public Informatica lojaSeguroMaisCaro(){
        Informatica lojaSeguroCaro = null;
        double maiorSeguro = 0; //armazena o valor de seguro
        for (int i = 0; i<lojas.length; i++){
            if (((Informatica)lojas[i]).getSeguroEletronicos() > maiorSeguro ){
                lojaSeguroCaro = (Informatica)lojas[i];
                maiorSeguro = ((Informatica)lojas[i]).getSeguroEletronicos();
            }
        }
        return lojaSeguroCaro;
    }


    public int contarLojas(){
        return tamanhoAtual;
    }

}
