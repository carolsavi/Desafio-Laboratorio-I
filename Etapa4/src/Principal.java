import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        int opcao;
        Shopping shopping = null;
        Loja[] lojas = null;
        
        
        
        do{
            System.out.println("---MENU---");
            System.out.println("1 - Criar um shopping");
            System.out.println("2 - Criar uma loja");
            System.out.println("3 - Criar um produto");
            System.out.println("4 - Saber a quantidade de lojas por tipo");
            System.out.println("5 - Sair");
            System.out.println("Digite o número da opção escolhida: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){

                case 1: //CRIAR SHOPPING

                    if (shopping != null){ //VERIFICA SE JÁ EXISTE UM SHOPPING
                        System.out.println("Shopping já existe!");
                        break;
                    }

                    System.out.println("Digite o nome do shopping: ");
                    String nomeShopping = scanner.nextLine();
                    System.out.println("ENDEREÇO SHOPPING");
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
                    Endereco enderecoShopping = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                    System.out.println("Digite a capacidade máxima do shopping:");
                    int capacidadeMaximaShopping = scanner.nextInt();

                    shopping = new Shopping(nomeShopping, enderecoShopping, capacidadeMaximaShopping);
                    System.out.println("Shopping criado com sucesso!");
                    break;


                case 2: //CRIAR LOJA
               
                    //VERIFICAR SE HÁ UM SHOPPING
                    if (shopping == null){
                        System.out.println("Crie um shopping antes de adicionar uma loja.");
                        break;
                    }
                    

                    
                    System.out.println("Qual o tipo da loja? (Alimentação, Bijuteria, Cosmético, Informática, Vestuário)");
                    String tipoLoja = scanner.nextLine();
                    System.out.println("Digite o nome da loja: ");
                    String nomeLoja = scanner.next();
                    System.out.println("Digite a quantidade de funcionários: ");
                    int quantidadeFuncionarios = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite o salário base dos funcionários da loja: ");
                    double salarioBaseFuncionario = scanner.nextFloat();
                    System.out.println("Digite a capacidade máxima do estoque da loja: ");
                    int capacidadeMaxima = scanner.nextInt();


                    //solicitar endereco
                    scanner.nextLine();
                    System.out.println("Digite o endereço da sua loja");
                    System.out.print("Nome da Rua: ");
                    String nomeDaRuaLoja = scanner.next();
                    System.out.print("Cidade: ");
                    String cidadeLoja = scanner.next();
                    System.out.print("Estado: ");
                    String estadoLoja = scanner.next();
                    System.out.print("País: ");
                    String paisLoja = scanner.next();
                    System.out.print("CEP: ");
                    String cepLoja = scanner.next();
                    System.out.print("Número: ");
                    String numeroLoja = scanner.next();
                    System.out.print("Complemento: ");
                    String complementoLoja = scanner.next();
                    Endereco enderecoLoja = new Endereco(nomeDaRuaLoja, cidadeLoja, estadoLoja, paisLoja, cepLoja, numeroLoja, complementoLoja);

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

                    if (tipoLoja.equalsIgnoreCase("Alimentacao")){
                        System.out.println("Digite a data do alvará");
                        System.out.println("Dia: ");
                        int diaAlvara = scanner.nextInt();
                        System.out.println("Mês: ");
                        int mesAlvara = scanner.nextInt();
                        System.out.println("Ano: ");
                        int anoAlvara = scanner.nextInt();
                        Data dataAlvara = new Data(diaAlvara, mesAlvara, anoAlvara);
                        Alimentacao alimentacao = new Alimentacao(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, dataAlvara, capacidadeMaxima);
                        System.out.println("Loja " + alimentacao.getNome() + " criada com sucesso!");
                        shopping.insereLoja(alimentacao);
                        scanner.nextLine();
                        break;
                    }
                    else if (tipoLoja.equalsIgnoreCase("Bijuteria")){
                       System.out.println("Digite a meta de vendas da loja: ");
                       double metaVendas = scanner.nextDouble();
                       Bijuteria biju = new Bijuteria(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, capacidadeMaxima, metaVendas);
                       System.out.println("Loja " + biju.getNome() + " criada com sucesso!");
                       shopping.insereLoja(biju);
                       scanner.nextLine();
                       break;
                    }
                    else if (tipoLoja.equalsIgnoreCase("Cosmetico")){
                        System.out.println("Digite a taxa de comercialização: ");
                        double taxaComercializacao = scanner.nextDouble();
                        Cosmetico cosmetico = new Cosmetico(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, capacidadeMaxima, taxaComercializacao);
                        System.out.println("Loja " + cosmetico.getNome() + " criada com sucesso!");
                        shopping.insereLoja(cosmetico);
                        scanner.nextLine();
                        break;
                    }
                    else if (tipoLoja.equalsIgnoreCase("Informatica")){
                        System.out.println("Digite o valor do seguro de eletrônicos da loja: ");
                        double seguroEletronicos = scanner.nextDouble();
                        Informatica info = new Informatica(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, capacidadeMaxima, seguroEletronicos);
                        System.out.println("Loja " + info.getNome() + " criada com sucesso!");
                        shopping.insereLoja(info);
                        scanner.nextLine();
                        break;
                    }
                    else if (tipoLoja.equalsIgnoreCase("Vestuario")){
                        System.out.println("A loja possui produtos importados? (True ou false)");
                        boolean produtosImportados = scanner.nextBoolean();
                        Vestuario vestuario = new Vestuario(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao, produtosImportados, capacidadeMaxima);
                        System.out.println("Loja " + vestuario.getNome() + " criada com sucesso!");
                        shopping.insereLoja(vestuario);
                        scanner.nextLine();
                        break;
                    } 
                    break;                  
                    
            
                case 3: //CRIAR PRODUTO
                    //PRIMEIRO VERIFICA SE EXISTE UMA LOJA

                    if (shopping == null || shopping.getLojas() == null || shopping.getLojas().length == 0){
                        System.out.println ("Não há um shopping ou loja para adicionar o produto.");
                        break;
                    }


                    //SELECIONAR UMA LOJA PARA BOTAR O PRODUTO NOVO

                    System.out.println("Lojas disponíveis: ");
                    boolean lojasDisponiveis = false;
                    lojas  = shopping.getLojas();
                    for (int i = 0; i<lojas.length; i++){
                        if (lojas[i] != null){
                        System.out.println("Loja " + (i+1) + "- " + lojas[i].getNome());
                        lojasDisponiveis = true;
                        }
                    }

                    //se não tiver loja disponível, não é possivel adicionar

                    if (!lojasDisponiveis){
                        System.out.println("Não há loja disponível.");
                        break;
                    }

                    //após a lista de lojas, selecionar
                    System.out.println("Selecione a loja escolhida (digite o número correspondente): ");
                    int escolhaLoja = scanner.nextInt();

                    //evitar erros
                    if (escolhaLoja < 1 || escolhaLoja > lojas.length || lojas[escolhaLoja - 1] == null){
                        System.out.println("Escolha inválida.");
                        break;
                    }

                    Loja lojaEscolhida = lojas[escolhaLoja - 1];

                    //ver se há capacidade na loja escolhida

                    if(lojaEscolhida.contarProdutos() >= lojaEscolhida.getCapacidadeMaxima()){
                        System.out.println("A loja já está em capacidade máxima!");
                        break;
                    }

                    //se possivel então, será criado o produto

                    scanner.nextLine();
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
                    lojaEscolhida.insereProduto(produto);
                    break;


                case 4: //QUANTIDADE DE LOJAS POR TIPO

                        //PRIMEIRO VERIFICA SE EXISTE SHOPPING E LOJA

                        if (shopping == null || shopping.getLojas() == null || shopping.getLojas().length == 0){
                            System.out.println ("Não há um shopping ou loja para realizar a pesquisa.");
                            break;
                         }

                    System.out.println("Qual o tipo da loja que deseja verificar? Digite o número correspondente \n1 - Alimentação \n2 - Bijuteria \n3 - Cosmético \n4 - Informática \n5 - Vestuário");
                    int tipoLojaVerificar = scanner.nextInt();
                
                    switch(tipoLojaVerificar){
                        case 1:  
                            shopping.quantidadeLojasPorTipo("Alimentacao");
                            break;
                        case 2:
                            shopping.quantidadeLojasPorTipo("Bijuteria");
                            break;
                        case 3: 
                            shopping.quantidadeLojasPorTipo("Cosmetico");
                            break;
                        case 4: 
                            shopping.quantidadeLojasPorTipo("Informatica");
                            break;
                        case 5: 
                            shopping.quantidadeLojasPorTipo("Vestuario");
                            break;
                        default: 
                            System.out.println("Opção inválida.");
                        }
                    break;

                case 5:
                    System.out.println("Saindo do menu...");
                    break;

                default: 
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while(opcao != 5);
        scanner.close();
    }

}
