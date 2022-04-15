package sissea;

import java.util.Scanner;

public class SisSea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastre um produto de cada veículo aquático comçando pelo IATE, depois pela LANCHA e por último JETSKI!");
        Iate i20 = new Iate();
        i20.entradaDados();
        i20.imprimir();
        i20.valorDesconto();

        Lancha l20 = new Lancha();
        l20.entradaDados();
        l20.imprimir();
        l20.valorDesconto();

        Jetski j20 = new Jetski();
        j20.entradaDados();
        j20.imprimir();
        j20.valorDesconto();

        int escolha, escolha2;
        do {
            System.out.print("Escolha um dos nossos produtos já cadastrados: \n");

            System.out.println("1- Iate\n2- Lancha\n3- jetski \n0- Sair.");
            escolha = (sc.nextInt());
            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu detalhe do Iate:");
                    do {
                        System.out.println("opções: \n1- Modelo do Iate \n2- Marca do Iate \n3- Cor do Iate \n4- Identificação do Iate \n5- Preço do Iate \n0- Retornar");
                        escolha2 = (sc.nextInt());
                        switch (escolha2) {
                            case 1:
                                System.out.println("Modelo do iate: " + i20.modelo);
                                break;
                            case 2:
                                System.out.println("Marca do iate: " + i20.marca);
                                break;
                            case 3:
                                System.out.println("Cor do iate: " + i20.cor);
                                break;
                            case 4:
                                System.out.println("Identificação do iate: " + i20.identificacao);
                                break;
                            case 5:
                                System.out.println("Preço do iate: " + i20.preco);
                                break;
                            case 0:
                                System.out.println("Retornar ao menu principal");
                            default:
                                System.out.println("Opção incorreta!");
                        }

                    } while (escolha2 != 0);
                    break;
                case 2:
                    System.out.println("Você escolheu detalhes da Lancha");
                    do {
                        System.out.println("opções: \n1- Modelo da Lancha \n2- Marca da Lancha \n3- Cor da Lancha \n4- Identificação da lancha \n5- Preço da Lancha \n0- Retornar");
                        escolha2 = (sc.nextInt());
                        switch (escolha2) {
                            case 1:
                                System.out.println("Modelo da Lancha: " + l20.modelo);
                                break;
                            case 2:
                                System.out.println("Marca da Lancha: " + l20.marca);
                                break;
                            case 3:
                                System.out.println("Cor da Lancha: " + l20.cor);
                                break;
                            case 4:
                                System.out.println("Identificação da Lancha: " + l20.identificacao);
                                break;
                            case 5:
                                System.out.println("Preço da Lancha: " + l20.preco);
                                break;
                            case 0:
                                System.out.println("Retornar ao menu principal");
                            default:
                                System.out.println("Opção incorreta!");
                        }
                    } while (escolha2 != 0);
                    break;
                case 3:
                    System.out.println("Você escolheu detalhes do Jetski!");
                    do {
                        System.out.println("opções: \n1- Modelo do Jetski \n2- Marca do Jetski \n3- Cor do Jetski \n4- Identificação do Jetski \n5- Preço do Jetski \n0- Retornar");
                        escolha2 = (sc.nextInt());
                        switch (escolha2) {
                            case 1:
                                System.out.println("Modelo do Jetski: " + j20.modelo);
                                break;
                            case 2:
                                System.out.println("Marca do Jetski: " + j20.marca);
                                break;
                            case 3:
                                System.out.println("Cor do Jetki: " + j20.cor);
                                break;
                            case 4:
                                System.out.println("Identificação do Jetski: " + j20.identificacao);
                                break;
                            case 5:
                                System.out.println("Preço do Jetski: " + j20.preco);
                                break;
                            case 0:
                                System.out.println("Retornar ao menu principal");
                            default:
                                System.out.println("Opção incorreta!");
                        }
                    } while (escolha2 != 2);
            }

        } while (escolha != 0);

    }
}
