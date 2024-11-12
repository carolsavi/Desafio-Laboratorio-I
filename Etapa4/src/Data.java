public class Data {
    private int dia;
    private int mes;
    private int ano;

    //CONSTRUTOR

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //VERIFICAR SE ANO BISSEXTO

    public boolean verificaAnoBissexto(){
        return ((ano % 4 == 0) || ((ano % 400 == 0) && (ano % 100 != 0)));
    }

    //VERIFICAR DATA

    public boolean verificaData(int dia, int mes, int ano){
        if (mes < 1 || mes > 12 || dia < 1){
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (verificaAnoBissexto() && mes == 2){
            diasPorMes[1] = 29; //TROCA OS DIAS DE FEVEREIRO SE FOR BISSEXTO
        }

        //verificar se foi inserido um dia possível para o mês informado
        return dia <= diasPorMes[mes -1];
    }




    //MÉTODOS DE ACESSO
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    //MÉTODOS
    public String toString() {
        return ("Data: "+dia+"/"+mes+"/"+ano);
    }

    
}
