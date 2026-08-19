import java.util.Scanner;

public class ProjetoCadastroDeVeiculos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] marca = new String[100];
        String[] modelo = new String[100];
        String[] placa = new String[100];
        String[] cor = new String[100];
        int[] ano = new int[100];
        int total = 0;

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("====== CADASTRO DE CARRO ======");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Visualizar carro");
            System.out.println("3 - Verificar quantidade de carros");
            System.out.println("4 - Apagar veículo");
            System.out.println("5 - Sair\n");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite apenas números.");
                continue;
            }

            switch (opcao) {
                case 1:
                    if (total >= 100) {
                        System.out.println("Quantidade de carros excedido\n");
                    } else {
                        System.out.println("==== Cadastrando carro ===\n");

                        System.out.print("Informe a marca do carro: ");
                        marca[total] = scanner.nextLine();

                        System.out.print("Informe o modelo do carro: ");
                        modelo[total] = scanner.nextLine();

                        System.out.print("Informe a placa do carro: ");
                        String novaPlaca = scanner.nextLine();

                        boolean placaExiste = false;
                        for (int i = 0; i < total; i++) {
                            if (placa[i].equalsIgnoreCase(novaPlaca)) {
                                placaExiste = true;
                                break;
                            }
                        }
                        if (placaExiste) {
                            System.out.println("Placa já cadastrada!\n");
                            break;
                        }
                        placa[total] = novaPlaca;

                        System.out.print("Informe a cor do carro: ");
                        cor[total] = scanner.nextLine();

                        while (true) {
                            System.out.print("Informe o ano do carro: ");
                            try {
                                ano[total] = Integer.parseInt(scanner.nextLine());
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Ano inválido! Digite apenas números.");
                            }
                        }

                        total++;
                        System.out.println("Carro cadastrado com sucesso\n");
                    }
                    break;

                case 2:
                    if (total == 0) {
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
                                    boolean buscaMarca = false;
                                    for (int i = 0; i < total; i++) {
                                        if (marca[i].equalsIgnoreCase(marcaConsulta)) {
                                            buscaMarca = true;
                                            System.out.println("\nMarca: " + marca[i]);
                                            System.out.println("Modelo: " + modelo[i]);
                                            System.out.println("Placa: " + placa[i]);
                                            System.out.println("Cor: " + cor[i]);
                                            System.out.println("Ano: " + ano[i] + "\n");
                                        }
                                    }
                                    if (!buscaMarca) System.out.println("Veículo não encontrado\n");
                                    break;

                                case 2:
                                    System.out.print("Informe o modelo do carro: ");
                                    String modeloConsulta = scanner.nextLine();
                                    boolean buscaModelo = false;
                                    for (int i = 0; i < total; i++) {
                                        if (modelo[i].equalsIgnoreCase(modeloConsulta)) {
                                            buscaModelo = true;
                                            System.out.println("\nMarca: " + marca[i]);
                                            System.out.println("Modelo: " + modelo[i]);
                                            System.out.println("Placa: " + placa[i]);
                                            System.out.println("Cor: " + cor[i]);
                                            System.out.println("Ano: " + ano[i] + "\n");
                                        }
                                    }
                                    if (!buscaModelo) System.out.println("Veículo não encontrado\n");
                                    break;

                                case 3:
                                    System.out.print("Informe a placa do carro: ");
                                    String placaConsulta = scanner.nextLine();
                                    boolean buscaPlaca = false;
                                    for (int i = 0; i < total; i++) {
                                        if (placa[i].equalsIgnoreCase(placaConsulta)) {
                                            buscaPlaca = true;
                                            System.out.println("\nMarca: " + marca[i]);
                                            System.out.println("Modelo: " + modelo[i]);
                                            System.out.println("Placa: " + placa[i]);
                                            System.out.println("Cor: " + cor[i]);
                                            System.out.println("Ano: " + ano[i] + "\n");
                                        }
                                    }
                                    if (!buscaPlaca) System.out.println("Veículo não encontrado\n");
                                    break;

                                case 4:
                                    System.out.print("Informe a cor do carro: ");
                                    String corConsulta = scanner.nextLine();
                                    boolean buscaCor = false;
                                    for (int i = 0; i < total; i++) {
                                        if (cor[i].equalsIgnoreCase(corConsulta)) {
                                            buscaCor = true;
                                            System.out.println("\nMarca: " + marca[i]);
                                            System.out.println("Modelo: " + modelo[i]);
                                            System.out.println("Placa: " + placa[i]);
                                            System.out.println("Cor: " + cor[i]);
                                            System.out.println("Ano: " + ano[i] + "\n");
                                        }
                                    }
                                    if (!buscaCor) System.out.println("Veículo não encontrado\n");
                                    break;

                                case 5:
                                    while (true) {
                                        System.out.print("Informe o ano do carro: ");
                                        try {
                                            int anoConsulta = Integer.parseInt(scanner.nextLine());
                                            boolean buscaAno = false;
                                            for (int i = 0; i < total; i++) {
                                                if (ano[i] == anoConsulta) {
                                                    buscaAno = true;
                                                    System.out.println("\nMarca: " + marca[i]);
                                                    System.out.println("Modelo: " + modelo[i]);
                                                    System.out.println("Placa: " + placa[i]);
                                                    System.out.println("Cor: " + cor[i]);
                                                    System.out.println("Ano: " + ano[i] + "\n");
                                                }
                                            }
                                            if (!buscaAno) System.out.println("Veículo não encontrado\n");
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
                    if (total == 0) {
                        System.out.println("Nenhum carro cadastrado\n");
                    } else {
                        System.out.println("Total de carros cadastrados: " + total + "\n");
                    }
                    break;

                case 4:
                    if (total == 0) {
                        System.out.println("Nenhum carro cadastrado\n");
                    } else {
                        System.out.print("Informe a placa do veículo que deseja apagar: ");
                        String placaApagar = scanner.nextLine();
                        boolean buscaApagar = false;
                        for (int i = 0; i < total; i++) {
                            if (placa[i].equalsIgnoreCase(placaApagar)) {
                                buscaApagar = true;
                                for (int j = i; j < total - 1; j++) {
                                    marca[j] = marca[j + 1];
                                    modelo[j] = modelo[j + 1];
                                    placa[j] = placa[j + 1];
                                    cor[j] = cor[j + 1];
                                    ano[j] = ano[j + 1];
                                }
                                marca[total - 1] = null;
                                modelo[total - 1] = null;
                                placa[total - 1] = null;
                                cor[total - 1] = null;
                                ano[total - 1] = 0;
                                total--;
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
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida\n");
            }
        }
        scanner.close();
    }
}