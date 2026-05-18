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
            System.out.println("4 - Sair");
            System.out.print("Digite o número da opção desejado: ");

            try {
                opcaoCarroOuMoto = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite apenas números.");
                continue;
            }

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

                        try {
                            opcaoCarro = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Opção inválida! Digite apenas números.");
                            continue;
                        }

                        switch (opcaoCarro) {
                            case 1:
                                if (totalCarro >= 100) {
                                    System.out.println("Quantidade de carros excedido\n");
                                } else {
                                    System.out.println("==== Cadastrando carro ===\n");

                                    System.out.print("Informe a marca do carro: ");
                                    marcaCarro[totalCarro] = scanner.nextLine();

                                    System.out.print("Informe o modelo do carro: ");
                                    modeloCarro[totalCarro] = scanner.nextLine();

                                    System.out.print("Informe a placa do carro: ");
                                    String novaPlacaCarro = scanner.nextLine();

                                    boolean placaCarroExiste = false;
                                    for (int i = 0; i < totalCarro; i++) {
                                        if (placaCarro[i].equalsIgnoreCase(novaPlacaCarro)) {
                                            placaCarroExiste = true;
                                            break;
                                        }
                                    }
                                    if (placaCarroExiste) {
                                        System.out.println("Placa já cadastrada!\n");
                                        break;
                                    }
                                    placaCarro[totalCarro] = novaPlacaCarro;

                                    System.out.print("Informe a cor do carro: ");
                                    corCarro[totalCarro] = scanner.nextLine();

                                    while (true) {
                                        System.out.print("Informe o ano do carro: ");
                                        try {
                                            anoCarro[totalCarro] = Integer.parseInt(scanner.nextLine());
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ano inválido! Digite apenas números.");
                                        }
                                    }

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
                                        System.out.println("1 - Pesquisar através da marca");
                                        System.out.println("2 - Pesquisar através do modelo");
                                        System.out.println("3 - Pesquisar através da placa");
                                        System.out.println("4 - Pesquisar através da cor");
                                        System.out.println("5 - Pesquisar através do ano");
                                        System.out.println("6 - Sair");

                                        try {
                                            opcaoVisualizacao = Integer.parseInt(scanner.nextLine());
                                        } catch (NumberFormatException e) {
                                            System.out.println("Opção inválida! Digite apenas números.");
                                            continue;
                                        }

                                        switch (opcaoVisualizacao) {
                                            case 1:
                                                System.out.print("Informe a marca do carro: ");
                                                String marcaConsulta = scanner.nextLine();
                                                boolean buscaCarroMarca = false;
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
                                                if (!buscaCarroMarca) System.out.println("Veículo não encontrado\n");
                                                break;

                                            case 2:
                                                System.out.print("Informe o modelo do carro: ");
                                                String modeloConsulta = scanner.nextLine();
                                                boolean buscaCarroModelo = false;
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
                                                if (!buscaCarroModelo) System.out.println("Veículo não encontrado\n");
                                                break;

                                            case 3:
                                                System.out.print("Informe a placa do carro: ");
                                                String placaConsulta = scanner.nextLine();
                                                boolean buscaCarroPlaca = false;
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
                                                if (!buscaCarroPlaca) System.out.println("Veículo não encontrado\n");
                                                break;

                                            case 4:
                                                System.out.print("Informe a cor do carro: ");
                                                String corConsulta = scanner.nextLine();
                                                boolean buscaCarroCor = false;
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
                                                if (!buscaCarroCor) System.out.println("Veículo não encontrado\n");
                                                break;

                                            case 5:
                                                while (true) {
                                                    System.out.print("Informe o ano do carro: ");
                                                    try {
                                                        int anoConsulta = Integer.parseInt(scanner.nextLine());
                                                        boolean buscaCarroAno = false;
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
                                                        if (!buscaCarroAno)
                                                            System.out.println("Veículo não encontrado\n");
                                                        break;
                                                    } catch (NumberFormatException e) {
                                                        System.out.println("Ano inválido! Digite apenas números.");
                                                    }
                                                }
                                                break;

                                            case 6:
                                                System.out.println("Saindo...\n");
                                                break;

                                            default:
                                                System.out.println("Opção inválida\n");
                                        }
                                    }
                                }
                                break;

                            case 3:
                                if (totalCarro == 0) {
                                    System.out.println("Nenhum carro cadastrado\n");
                                } else {
                                    System.out.println("Total de carros cadastrados: " + totalCarro + "\n");
                                }
                                break;

                            case 4:
                                if (totalCarro == 0) {
                                    System.out.println("Nenhum carro cadastrado\n");
                                } else {
                                    System.out.print("Informe a placa do veículo que deseja apagar: ");
                                    String placaApagar = scanner.nextLine();
                                    boolean buscaApagar = false;
                                    for (int i = 0; i < totalCarro; i++) {
                                        if (placaCarro[i].equalsIgnoreCase(placaApagar)) {
                                            buscaApagar = true;
                                            for (int j = i; j < totalCarro - 1; j++) {
                                                marcaCarro[j] = marcaCarro[j + 1];
                                                modeloCarro[j] = modeloCarro[j + 1];
                                                placaCarro[j] = placaCarro[j + 1];
                                                corCarro[j] = corCarro[j + 1];
                                                anoCarro[j] = anoCarro[j + 1];
                                            }
                                            marcaCarro[totalCarro - 1] = null;
                                            modeloCarro[totalCarro - 1] = null;
                                            placaCarro[totalCarro - 1] = null;
                                            corCarro[totalCarro - 1] = null;
                                            anoCarro[totalCarro - 1] = 0;
                                            totalCarro--;
                                            break;
                                        }
                                    }
                                    if (buscaApagar) {
                                        System.out.println("Carro apagado com sucesso\n");
                                    } else {
                                        System.out.println("Placa do carro não encontrada\n");
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Saindo do cadastro de carro...");
                                break;

                            default:
                                System.out.println("Opção inválida\n");
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

                        try {
                            opcaoMoto = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Opção inválida! Digite apenas números.");
                            continue;
                        }

                        switch (opcaoMoto) {
                            case 1:
                                if (totalMoto >= 100) {
                                    System.out.println("Quantidade de motos excedido\n");
                                } else {
                                    System.out.println("==== Cadastrando moto ===\n");

                                    System.out.print("Informe a marca da moto: ");
                                    marcaMoto[totalMoto] = scanner.nextLine();

                                    System.out.print("Informe o modelo da moto: ");
                                    modeloMoto[totalMoto] = scanner.nextLine();

                                    System.out.print("Informe a placa da moto: ");
                                    String novaPlacaMoto = scanner.nextLine();

                                    boolean placaMotoExiste = false;
                                    for (int i = 0; i < totalMoto; i++) {
                                        if (placaMoto[i].equalsIgnoreCase(novaPlacaMoto)) {
                                            placaMotoExiste = true;
                                            break;
                                        }
                                    }
                                    if (placaMotoExiste) {
                                        System.out.println("Placa já cadastrada!\n");
                                        break;
                                    }
                                    placaMoto[totalMoto] = novaPlacaMoto;

                                    System.out.print("Informe a cor da moto: ");
                                    corMoto[totalMoto] = scanner.nextLine();

                                    while (true) {
                                        System.out.print("Informe o ano da moto: ");
                                        try {
                                            anoMoto[totalMoto] = Integer.parseInt(scanner.nextLine());
                                            break;
                                        } catch (NumberFormatException e) {
                                            System.out.println("Ano inválido! Digite apenas números.");
                                        }
                                    }

                                    totalMoto++;
                                    System.out.println("Moto cadastrada com sucesso\n");
                                }
                                break;

                            case 2:
                                if (totalMoto == 0) {
                                    System.out.println("Nenhuma moto cadastrada\n");
                                } else {
                                    int opcaoVisualizacao = 0;
                                    while (opcaoVisualizacao != 6) {
                                        System.out.println("=== Visualizando moto cadastrada ===");
                                        System.out.println("1 - Pesquisar através da marca");
                                        System.out.println("2 - Pesquisar através do modelo");
                                        System.out.println("3 - Pesquisar através da placa");
                                        System.out.println("4 - Pesquisar através da cor");
                                        System.out.println("5 - Pesquisar através do ano");
                                        System.out.println("6 - Sair");

                                        try {
                                            opcaoVisualizacao = Integer.parseInt(scanner.nextLine());
                                        } catch (NumberFormatException e) {
                                            System.out.println("Opção inválida! Digite apenas números.");
                                            continue;
                                        }

                                        switch (opcaoVisualizacao) {
                                            case 1:
                                                System.out.print("Informe a marca da moto: ");
                                                String marcaConsulta = scanner.nextLine();
                                                boolean buscaMotoMarca = false;
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
                                                if (!buscaMotoMarca) System.out.println("Veículo não encontrado\n");
                                                break;

                                            case 2:
                                                System.out.print("Informe o modelo da moto: ");
                                                String modeloConsulta = scanner.nextLine();
                                                boolean buscaMotoModelo = false;
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
                                                if (!buscaMotoModelo) System.out.println("Veículo não encontrado\n");
                                                break;

                                            case 3:
                                                System.out.print("Informe a placa da moto: ");
                                                String placaConsulta = scanner.nextLine();
                                                boolean buscaMotoPlaca = false;
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
                                                if (!buscaMotoPlaca) System.out.println("Veículo não encontrado\n");
                                                break;

                                            case 4:
                                                System.out.print("Informe a cor da moto: ");
                                                String corConsulta = scanner.nextLine();
                                                boolean buscaMotoCor = false;
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
                                                if (!buscaMotoCor) System.out.println("Veículo não encontrado\n");
                                                break;

                                            case 5:
                                                while (true) {
                                                    System.out.print("Informe o ano da moto: ");
                                                    try {
                                                        int anoConsulta = Integer.parseInt(scanner.nextLine());
                                                        boolean buscaMotoAno = false;
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
                                                        if (!buscaMotoAno)
                                                            System.out.println("Veículo não encontrado\n");
                                                        break;
                                                    } catch (NumberFormatException e) {
                                                        System.out.println("Ano inválido! Digite apenas números.");
                                                    }
                                                }
                                                break;

                                            case 6:
                                                System.out.println("Saindo...\n");
                                                break;

                                            default:
                                                System.out.println("Opção inválida\n");
                                        }
                                    }
                                }
                                break;

                            case 3:
                                if (totalMoto == 0) {
                                    System.out.println("Nenhuma moto cadastrada\n");
                                } else {
                                    System.out.println("Total de motos cadastradas: " + totalMoto + "\n");
                                }
                                break;

                            case 4:
                                if (totalMoto == 0) {
                                    System.out.println("Nenhuma moto cadastrada\n");
                                } else {
                                    System.out.print("Informe a placa da moto que deseja apagar: ");
                                    String placaApagar = scanner.nextLine();
                                    boolean buscaApagar = false;
                                    for (int i = 0; i < totalMoto; i++) {
                                        if (placaMoto[i].equalsIgnoreCase(placaApagar)) {
                                            buscaApagar = true;
                                            for (int j = i; j < totalMoto - 1; j++) {
                                                marcaMoto[j] = marcaMoto[j + 1];
                                                modeloMoto[j] = modeloMoto[j + 1];
                                                placaMoto[j] = placaMoto[j + 1];
                                                corMoto[j] = corMoto[j + 1];
                                                anoMoto[j] = anoMoto[j + 1];
                                            }
                                            marcaMoto[totalMoto - 1] = null;
                                            modeloMoto[totalMoto - 1] = null;
                                            placaMoto[totalMoto - 1] = null;
                                            corMoto[totalMoto - 1] = null;
                                            anoMoto[totalMoto - 1] = 0;
                                            totalMoto--;
                                            break;
                                        }
                                    }
                                    if (buscaApagar) {
                                        System.out.println("Moto apagada com sucesso\n");
                                    } else {
                                        System.out.println("Placa da moto não encontrada\n");
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Saindo do cadastro de moto...");
                                break;

                            default:
                                System.out.println("Opção inválida\n");
                        }
                    }
                    break;

                case 3:
                    if (totalCarro == 0 && totalMoto == 0) {
                        System.out.println("Nenhum veículo cadastrado\n");
                    } else {
                        System.out.println("====== TOTAL DE VEÍCULOS CADASTRADOS ======");
                        System.out.println("Total de carros: " + totalCarro);
                        System.out.println("Total de motos: " + totalMoto);
                        System.out.println("Total geral: " + (totalCarro + totalMoto) + "\n");
                    }
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida\n");
            }
        }
        scanner.close();
    }
}