import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do{
            System.out.println("---MENU---");
            System.out.println("1 - Criar uma loja");
            System.out.println("2 - Criar um produto");
            System.out.println("3 - Sair");
            System.out.println("Digite o número da opção escolhida: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    System.out.println("Digite o nome da loja: ");
                    String nomeLoja = scanner.next();
                    System.out.println("Digite a quantidade de funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o salário base dos funcionários da loja: ");
                    double salarioBaseFuncionario = scanner.nextFloat();


                    //solicitar endereco

                    System.out.println("Digite o endereço da sua loja");
                    System.out.print("Nome da Rua: ");
                    String nomeDaRua = scanner.next();
                    System.out.print("Cidade: ");
                    String cidade = scanner.next();
                    System.out.print("Estado: ");
                    String estado = scanner.next();
                    System.out.print("País: ");
                    String pais = scanner.next();
                    System.out.print("CEP: ");
                    String cep = scanner.next();
                    System.out.print("Número: ");
                    String numero = scanner.next();
                    System.out.print("Complemento: ");
                    String complemento = scanner.next();
                    Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

                    //solicitar data de fundação
                    System.out.println("Digite a data de fundação da loja");
                    System.out.println("Dia: ");
                    int diaFundacao = scanner.nextInt();
                    System.out.println("Mês: ");
                    int mesFundacao = scanner.nextInt();
                    System.out.println("Ano: ");
                    int anoFundacao = scanner.nextInt();
                    Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

                    //criando a loja

                    Loja loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
                    System.out.println("Loja " + loja.getNome() + " criada com sucesso!");
                    break;
            
                case 2: 

                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preço: ");
                    double preco = scanner.nextDouble();

                    //criar data de validade
                    scanner.nextLine();
                    System.out.println("Digite a data de validade do produto");
                    System.out.println("Dia: ");
                    int diaValidade = scanner.nextInt();
                    System.out.println("Mês: ");
                    int mesValidade = scanner.nextInt();
                    System.out.println("Ano: ");
                    int anoValidade = scanner.nextInt();
                    Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);

                    //criar produto

                    Produto produto = new Produto(nome, preco, dataValidade);
                    System.out.println("Produto criado com sucesso!");
                    
                    System.out.println(produto.estaVencido(new Data(20,10,2023)) ? "Produto vencido!" : "Produto não vencido!" );

                    break;

                case 3:
                    System.out.println("Saindo do menu...");
                    break;

                default: 
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while(opcao != 3);
        scanner.close();
    }

}
