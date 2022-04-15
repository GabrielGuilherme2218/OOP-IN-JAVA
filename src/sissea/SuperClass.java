package sissea;

import java.util.Scanner;

public class SuperClass {

    String marca, modelo, cor, identificacao;
    double preco, peso;
    int velocidadeMaxima, numeroPassageiros;

    Scanner sc = new Scanner(System.in);

    public SuperClass() {

    }

    public SuperClass(String mar) {
        marca = mar;
    }

    public SuperClass(String mar, String mod) {
        marca = mar;
        modelo = mod;
    }

    public SuperClass(String mar, String mod, String c) {
        marca = mar;
        modelo = mod;
        cor = c;
    }

    public SuperClass(String mar, String mod, String c, String id) {
        marca = mar;
        modelo = mod;
        cor = c;
        identificacao = id;
    }

    public SuperClass(String mar, String mod, String c, String id, double pre) {
        marca = mar;
        modelo = mod;
        cor = c;
        identificacao = id;
        preco = pre;
    }

    public SuperClass(String mar, String mod, String c, String id, double pre, double pes) {
        marca = mar;
        modelo = mod;
        cor = c;
        identificacao = id;
        preco = pre;
        peso = pes;
    }

    public SuperClass(String mar, String mod, String c, String id, double pre, double pes, int VelMax) {
        marca = mar;
        modelo = mod;
        cor = c;
        identificacao = id;
        preco = pre;
        peso = pes;
        velocidadeMaxima = VelMax;
    }

    public SuperClass(String mar, String id, double pre, double pes, int VelMax) {
        marca = mar;
        identificacao = id;
        preco = pre;
        peso = pes;
        velocidadeMaxima = VelMax;
    }

    public SuperClass(String mar, String c, double pre) {
        marca = mar;
        cor = c;
        preco = pre;
    }

    public SuperClass(String mar, String mod, double pes, int VelMax) {
        marca = mar;
        modelo = mod;
        peso = pes;
        velocidadeMaxima = VelMax;
    }

    public void setMarca(String mar) {
        if (!mar.isEmpty()) {
            marca = mar;
        } else {
            System.out.println("é necessário digitar algo! ");
        }
    }

    public void setModelo(String mod) {
        if (!mod.isEmpty()) {
            modelo = mod;
        } else {
            System.out.println("é necessário digitar algo!");
        }
    }

    public void setCor(String c) {
        if (!c.isEmpty()) {
            cor = c;
        } else {
            System.out.println("é necessário digitar algo!");
        }
    }

    public void setIdentificacao(String id) {
        if (!id.isEmpty()) {
            identificacao = id;
        } else {
            System.out.println("é necessário digitar algo!");
        }
    }

    public void setPreco(double pre) {
        if (pre > 0) {
            preco = pre;
        } else {
            System.out.println("Valor não pode ser 0");
        }
    }

    public void setPeso(double pes) {
        if (pes > 0) {
            peso = pes;
        } else {
            System.out.println("O peso tem que ser maior que 0. ");
        }
    }

    public void setVelocidadeMaxima(int velMax) {
        if (velMax > 0) {
            velocidadeMaxima = velMax;
        } else {
            System.out.println("A velocidade máxima não pode ser 0");
        }
    }

    public void setNumeroPassageiros(int numPas) {
        if (numPas > 0) {
            numeroPassageiros = numPas;
        } else {
            System.out.println("A velocidade máxima não pode ser 0");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void cadastrar(String marca, String modelo, String cor,
            String identificacao, double preco, double peso, int velocidadeMaxima,
            int numeroPassageiros) {

        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setIdentificacao(identificacao);
        setPreco(preco);
        setPeso(peso);
        setVelocidadeMaxima(velocidadeMaxima);
        setNumeroPassageiros(numeroPassageiros);

    }

    public void entradaDados() {

        System.out.println("Digite a marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite o modelo: ");
        setModelo(sc.nextLine());
        System.out.println("Digite a cor: ");
        setCor(sc.nextLine());
        System.out.println("Digite a identificação: ");
        setIdentificacao(sc.nextLine());
        System.out.println("Digite o preço: ");
        setPreco(sc.nextDouble());
        System.out.println("Digite o Peso");
        setPeso(sc.nextDouble());
        System.out.println("Digite a velocidade máxima: ");
        setVelocidadeMaxima(sc.nextInt());
        System.out.println("Digite o numero de passageiros: ");
        setNumeroPassageiros(sc.nextInt());
    }

    public void imprimir() {
        System.out.println("A marca é: " + getMarca());
        System.out.println("O modelo é : " + getModelo());
        System.out.println("A Cor é: " + getCor());
        System.out.println("A Identificação é: " + getIdentificacao());
        System.out.println("O preço é: R$ " + getPreco());
        System.out.println("O peso é: " + getPeso() + "kg");
        System.out.println("A velocidade máxima é: " + getVelocidadeMaxima() + "Km/h");
        System.out.println("O número de passageiros é: " + getNumeroPassageiros());

    }
}
