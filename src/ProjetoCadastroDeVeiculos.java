import java.util.Scanner;

public class ProjetoCadastroDeVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] marcaCarro = new String[100];
        String[] modeloCarro = new String[100];
        String[] placaCarro = new String[100];
        String[] corCarro = new String[100];
        int[] anoCarro = new int[100];
        int totalCarro = 0;

        String[] marcaMoto = new String[100];
        String[] modeloMoto = new String[100];
        String[] placaMoto = new String[100];
        String[] corMoto = new String[100];
        int[] anoMoto = new int[100];
        int totalMoto = 0;

        int opcaoCarroOuMoto = 0;

        while (opcaoCarroOuMoto != 4) {
            System.out.println("\n====== Cadastro de Carro ou Moto ======");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Visualizar quantidade de veículos cadastrados");
            System.out.println("4 - Sair\n");
            opcaoCarroOuMoto = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoCarroOuMoto) {

                case 1:
                    int opcaoCarro = 0;

                    while (opcaoCarro != 5) {
                        System.out.println("====== CADASTRO DE CARRO ======");
                        System.out.println("1 - Cadastrar carro");
                        System.out.println("2 - Visualizar carro");
                        System.out.println("3 - Verificar quantidade de carros");
                        System.out.println("4 - Apagar veículo");
                        System.out.println("5 - Sair\n");
                        opcaoCarro = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoCarro) {
                            case 1:
                                if (totalCarro >= 100) {
                                    System.out.println("Quantidade de carros excedido\n");
                                } else {
                                    System.out.println("==== Cadastrando carro ===\n");
                                    System.out.println("Informe a marca do carro: ");
                                    marcaCarro[totalCarro] = scanner.nextLine();

                                    System.out.println("Informe o modelo do carro: ");
                                    modeloCarro[totalCarro] = scanner.nextLine();

                                    System.out.println("Informe a placa do carro: ");
                                    placaCarro[totalCarro] = scanner.nextLine();

                                    System.out.println("Informe a cor do carro: ");
                                    corCarro[totalCarro] = scanner.nextLine();

                                    System.out.println("Informe o ano do carro: ");
                                    anoCarro[totalCarro] = scanner.nextInt();
                                    scanner.nextLine();

                                    totalCarro++;
                                    System.out.println("Carro cadastrado com sucesso\n");
                                }
                                break;

                            case 2:

                                if (totalCarro == 0) {
                                    System.out.println("Nenhum carro cadastrado\n");
                                } else {
                                    int opcaoVisualizacao = 0;
                                    while (opcaoVisualizacao != 6) {
                                        System.out.println("=== Visualizando carro cadastrado ===");
                                        System.out.println("=== Informe a forma desejada de procura:");
                                        System.out.println("1 - Pesquisar atraves da marca");
                                        System.out.println("2 - Pesquisar atraves do modelo");
                                        System.out.println("3 - Pesquisar atraves da placa");
                                        System.out.println("4 - Pesquisar atraves da cor");
                                        System.out.println("5 - Pesquisar atraves do ano");
                                        System.out.println("6 - Sair");
                                        opcaoVisualizacao = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opcaoVisualizacao) {

                                            case 1:
                                                System.out.println("Pesquisa através da marca");
                                                boolean buscaCarroMarca = false;
                                                System.out.println("Informe a marca do carro :");
                                                String marcaConsulta = scanner.nextLine();

                                                for (int i = 0; i < totalCarro; i++) {
                                                    if (marcaCarro[i].equalsIgnoreCase(marcaConsulta)) {
                                                        buscaCarroMarca = true;
                                                        System.out.println("\nMarca: " + marcaCarro[i]);
                                                        System.out.println("Modelo: " + modeloCarro[i]);
                                                        System.out.println("Placa: " + placaCarro[i]);
                                                        System.out.println("Cor: " + corCarro[i]);
                                                        System.out.println("Ano: " + anoCarro[i] + "\n");
                                                    }
                                                }
                                                if (!buscaCarroMarca) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 2:
                                                System.out.println("Pesquisa através do modelo");
                                                boolean buscaCarroModelo = false;
                                                System.out.println("Informe o modelo do carro :");
                                                String modeloConsulta = scanner.nextLine();

                                                for (int i = 0; i < totalCarro; i++) {
                                                    if (modeloCarro[i].equalsIgnoreCase(modeloConsulta)) {
                                                        buscaCarroModelo = true;
                                                        System.out.println("\nMarca: " + marcaCarro[i]);
                                                        System.out.println("Modelo: " + modeloCarro[i]);
                                                        System.out.println("Placa: " + placaCarro[i]);
                                                        System.out.println("Cor: " + corCarro[i]);
                                                        System.out.println("Ano: " + anoCarro[i] + "\n");
                                                    }
                                                }
                                                if (!buscaCarroModelo) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Pesquisa através da placa");
                                                boolean buscaCarroPlaca = false;
                                                System.out.println("Informe a placa do carro :");
                                                String placaConsulta = scanner.nextLine();

                                                for (int i = 0; i < totalCarro; i++) {
                                                    if (placaCarro[i].equalsIgnoreCase(placaConsulta)) {
                                                        buscaCarroPlaca = true;
                                                        System.out.println("\nMarca: " + marcaCarro[i]);
                                                        System.out.println("Modelo: " + modeloCarro[i]);
                                                        System.out.println("Placa: " + placaCarro[i]);
                                                        System.out.println("Cor: " + corCarro[i]);
                                                        System.out.println("Ano: " + anoCarro[i] + "\n");
                                                    }
                                                }
                                                if (!buscaCarroPlaca) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 4:
                                                System.out.println("Pesquisa através da cor");
                                                boolean buscaCarroCor = false;
                                                System.out.println("Informe a cor do carro :");
                                                String corConsulta = scanner.nextLine();

                                                for (int i = 0; i < totalCarro; i++) {
                                                    if (corCarro[i].equalsIgnoreCase(corConsulta)) {
                                                        buscaCarroCor = true;
                                                        System.out.println("\nMarca: " + marcaCarro[i]);
                                                        System.out.println("Modelo: " + modeloCarro[i]);
                                                        System.out.println("Placa: " + placaCarro[i]);
                                                        System.out.println("Cor: " + corCarro[i]);
                                                        System.out.println("Ano: " + anoCarro[i] + "\n");
                                                    }
                                                }
                                                if (!buscaCarroCor) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 5:
                                                System.out.println("Pesquisa através do ano");
                                                boolean buscaCarroAno = false;
                                                System.out.println("Informe o ano do carro :");
                                                int anoConsulta = scanner.nextInt();
                                                scanner.nextLine();

                                                for (int i = 0; i < totalCarro; i++) {
                                                    if (anoCarro[i] == anoConsulta) {
                                                        buscaCarroAno = true;
                                                        System.out.println("\nMarca: " + marcaCarro[i]);
                                                        System.out.println("Modelo: " + modeloCarro[i]);
                                                        System.out.println("Placa: " + placaCarro[i]);
                                                        System.out.println("Cor: " + corCarro[i]);
                                                        System.out.println("Ano: " + anoCarro[i] + "\n");
                                                    }
                                                }
                                                if (!buscaCarroAno) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 6:
                                                System.out.println("Saindo da opção de escolha.\n.");
                                                break;

                                            default:
                                                System.out.println("Opção inválida");
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (totalCarro == 0) {
                                    System.out.println("Nenhum carro cadastrado\n");
                                } else {
                                    System.out.println("=== Visualizar carros cadastrados ===");
                                    System.out.println("Total de carros cadastrados: " + totalCarro + "\n");
                                }
                                break;
                            case 4:
                                if (totalCarro == 0) {
                                    System.out.println("Nenhum carro cadastrado\n");
                                } else {
                                    boolean buscaApagar = false;
                                    System.out.println("Informe a placa do veículo que deseja apagar: ");
                                    String placaApagar = scanner.nextLine();
                                    for (int i = 0; i < totalCarro; i++) {
                                        if (placaCarro[i].equalsIgnoreCase(placaApagar)) {
                                            buscaApagar = true;
                                            marcaCarro[i] = marcaCarro[totalCarro - 1];
                                            modeloCarro[i] = modeloCarro[totalCarro - 1];
                                            placaCarro[i] = placaCarro[totalCarro - 1];
                                            corCarro[i] = corCarro[totalCarro - 1];
                                            anoCarro[i] = anoCarro[totalCarro - 1];
                                            totalCarro--;
                                            break;
                                        }
                                    }
                                    if (buscaApagar) {
                                        System.out.println("Carro apagado com sucesso\n");
                                    } else {
                                        System.out.println("Placa do carro não encontrado\n");
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Saindo do cadastro de carro...");
                                break;

                            default:
                                System.out.println("Opção de cadastro de carro inválida");
                                break;
                        }
                    }
                    break;

                case 2:
                    int opcaoMoto = 0;

                    while (opcaoMoto != 5) {
                        System.out.println("====== CADASTRO DE MOTO ======");
                        System.out.println("1 - Cadastrar moto");
                        System.out.println("2 - Visualizar moto");
                        System.out.println("3 - Verificar quantidade de motos");
                        System.out.println("4 - Apagar moto");
                        System.out.println("5 - Sair\n");
                        opcaoMoto = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcaoMoto) {
                            case 1:
                                if (totalMoto >= 100) {
                                    System.out.println("Quantidade de motos excedido\n");
                                } else {
                                    System.out.println("==== Cadastrando moto ===\n");
                                    System.out.println("Informe a marca da moto: ");
                                    marcaMoto[totalMoto] = scanner.nextLine();

                                    System.out.println("Informe o modelo do moto: ");
                                    modeloMoto[totalMoto] = scanner.nextLine();

                                    System.out.println("Informe a placa da moto: ");
                                    placaMoto[totalMoto] = scanner.nextLine();

                                    System.out.println("Informe a cor da moto: ");
                                    corMoto[totalMoto] = scanner.nextLine();

                                    System.out.println("Informe o ano da moto: ");
                                    anoMoto[totalMoto] = scanner.nextInt();
                                    scanner.nextLine();

                                    totalMoto++;
                                    System.out.println("Moto cadastrada com sucesso\n");
                                }
                                break;

                            case 2:

                                if (totalMoto == 0) {
                                    System.out.println("Nenhuma moto cadastrado\n");
                                } else {
                                    int opcaoVisualizacao = 0;
                                    while (opcaoVisualizacao != 6) {
                                        System.out.println("=== Visualizando moto cadastrado ===");
                                        System.out.println("=== Informe a forma desejada de procura:");
                                        System.out.println("1 - Pesquisar atraves da marca");
                                        System.out.println("2 - Pesquisar atraves do modelo");
                                        System.out.println("3 - Pesquisar atraves da placa");
                                        System.out.println("4 - Pesquisar atraves da cor");
                                        System.out.println("5 - Pesquisar atraves do ano");
                                        System.out.println("6 - Sair");
                                        opcaoVisualizacao = scanner.nextInt();
                                        scanner.nextLine();
                                        switch (opcaoVisualizacao) {

                                            case 1:
                                                System.out.println("Pesquisa através da marca");
                                                boolean buscaMotoMarca = false;
                                                System.out.println("Informe a marca da moto :");
                                                String marcaConsulta = scanner.nextLine();

                                                for (int i = 0; i < totalMoto; i++) {
                                                    if (marcaMoto[i].equalsIgnoreCase(marcaConsulta)) {
                                                        buscaMotoMarca = true;
                                                        System.out.println("\nMarca: " + marcaMoto[i]);
                                                        System.out.println("Modelo: " + modeloMoto[i]);
                                                        System.out.println("Placa: " + placaMoto[i]);
                                                        System.out.println("Cor: " + corMoto[i]);
                                                        System.out.println("Ano: " + anoMoto[i] + "\n");
                                                    }
                                                }
                                                if (!buscaMotoMarca) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 2:
                                                System.out.println("Pesquisa através do modelo");
                                                boolean buscaMotoModelo = false;
                                                System.out.println("Informe o modelo da moto :");
                                                String modeloConsulta = scanner.nextLine();

                                                for (int i = 0; i < totalMoto; i++) {
                                                    if (modeloMoto[i].equalsIgnoreCase(modeloConsulta)) {
                                                        buscaMotoModelo = true;
                                                        System.out.println("\nMarca: " + marcaMoto[i]);
                                                        System.out.println("Modelo: " + modeloMoto[i]);
                                                        System.out.println("Placa: " + placaMoto[i]);
                                                        System.out.println("Cor: " + corMoto[i]);
                                                        System.out.println("Ano: " + anoMoto[i] + "\n");
                                                    }
                                                }
                                                if (!buscaMotoModelo) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Pesquisa através da placa");
                                                boolean buscaMotoPlaca = false;
                                                System.out.println("Informe a placa da moto :");
                                                String placaConsulta = scanner.nextLine();

                                                for (int i = 0; i < totalMoto; i++) {
                                                    if (placaMoto[i].equalsIgnoreCase(placaConsulta)) {
                                                        buscaMotoPlaca = true;
                                                        System.out.println("\nMarca: " + marcaMoto[i]);
                                                        System.out.println("Modelo: " + modeloMoto[i]);
                                                        System.out.println("Placa: " + placaMoto[i]);
                                                        System.out.println("Cor: " + corMoto[i]);
                                                        System.out.println("Ano: " + anoMoto[i] + "\n");
                                                    }
                                                }
                                                if (!buscaMotoPlaca) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 4:
                                                System.out.println("Pesquisa através da cor");
                                                boolean buscaMotoCor = false;
                                                System.out.println("Informe a cor da moto :");
                                                String corConsulta = scanner.nextLine();

                                                for (int i = 0; i < totalMoto; i++) {
                                                    if (corMoto[i].equalsIgnoreCase(corConsulta)) {
                                                        buscaMotoCor = true;
                                                        System.out.println("\nMarca: " + marcaMoto[i]);
                                                        System.out.println("Modelo: " + modeloMoto[i]);
                                                        System.out.println("Placa: " + placaMoto[i]);
                                                        System.out.println("Cor: " + corMoto[i]);
                                                        System.out.println("Ano: " + anoMoto[i] + "\n");
                                                    }
                                                }
                                                if (!buscaMotoCor) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 5:
                                                System.out.println("Pesquisa através do ano");
                                                boolean buscaMotoAno = false;
                                                System.out.println("Informe o ano da moto :");
                                                int anoConsulta = scanner.nextInt();
                                                scanner.nextLine();

                                                for (int i = 0; i < totalMoto; i++) {
                                                    if (anoMoto[i] == anoConsulta) {
                                                        buscaMotoAno = true;
                                                        System.out.println("\nMarca: " + marcaMoto[i]);
                                                        System.out.println("Modelo: " + modeloMoto[i]);
                                                        System.out.println("Placa: " + placaMoto[i]);
                                                        System.out.println("Cor: " + corMoto[i]);
                                                        System.out.println("Ano: " + anoMoto[i] + "\n");
                                                    }
                                                }
                                                if (!buscaMotoAno) {
                                                    System.out.println("Veículo não encontrado\n");
                                                }
                                                break;

                                            case 6:
                                                System.out.println("Saindo da opção de escolha.\n.");
                                                break;

                                            default:
                                                System.out.println("Opção inválida");
                                                break;
                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (totalMoto == 0) {
                                    System.out.println("Nenhuma moto cadastrado\n");
                                } else {
                                    System.out.println("=== Visualizar motos cadastradas ===");
                                    System.out.println("Total de motos cadastradas: " + totalMoto + "\n");
                                }
                                break;
                            case 4:
                                if (totalMoto == 0) {
                                    System.out.println("Nenhuma moto cadastrada\n");
                                } else {
                                    boolean buscaApagar = false;
                                    System.out.println("Informe a placa do veículo que deseja apagar: ");
                                    String placaApagar = scanner.nextLine();
                                    for (int i = 0; i < totalMoto; i++) {
                                        if (placaMoto[i].equalsIgnoreCase(placaApagar)) {
                                            buscaApagar = true;
                                            marcaMoto[i] = marcaMoto[totalMoto - 1];
                                            modeloMoto[i] = modeloMoto[totalMoto - 1];
                                            placaMoto[i] = placaMoto[totalMoto - 1];
                                            corMoto[i] = corMoto[totalMoto - 1];
                                            anoMoto[i] = anoMoto[totalMoto - 1];
                                            totalMoto--;
                                            break;
                                        }
                                    }
                                    if (buscaApagar) {
                                        System.out.println("Moto apagado com sucesso\n");
                                    } else {
                                        System.out.println("Placa da moto não encontrada\n");
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Saindo do cadastro de moto...");
                                break;

                            default:
                                System.out.println("Opção de cadastro de moto inválida");
                                break;
                        }
                    }
                    break;

                case 3:
                    if (totalCarro == 0 && totalMoto == 0) {
                        System.out.println("Nenhum veículo cadastrado");
                    } else {
                        int soma;
                        soma = totalMoto + totalCarro;
                        System.out.println("====== TOTAL DE VEÍCULOS CADASTRADOS ======\n");
                        System.out.println("Total de carros cadastrados: " + totalCarro + "\nTotal de motos cadastradas: " + totalMoto);
                        System.out.println("Total de veículos cadastrados: " + soma);
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema..");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        scanner.close();
    }
}