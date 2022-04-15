package sissea;

public class Iate extends SuperClass {

    boolean piscina;
    int numeroCabine, numeroTripulantes;

    public Iate() {

    }

    public Iate(boolean piscina, int numeroCabine, int numeroTripulantes, String mar, String mod, String c, String id, double pre, double pes) {
        super(mar, mod, c, id, pre, pes);
        this.piscina = piscina;
        this.numeroCabine = numeroCabine;
        this.numeroTripulantes = numeroTripulantes;

    }

    public Iate(boolean piscina, int numeroCabine, int numeroTripulantes, String mar, String id, double pre, double pes, int VelMax) {
        super(mar, id, pre, pes, VelMax);
        this.piscina = piscina;
        this.numeroCabine = numeroCabine;
        this.numeroTripulantes = numeroTripulantes;

    }

    public Iate(boolean piscina, int numeroCabine, int numeroTripulantes, String mar, String mod, double pes, int VelMax) {
        super(mar, mod, pes, VelMax);
        this.piscina = piscina;
        this.numeroCabine = numeroCabine;
        this.numeroTripulantes = numeroTripulantes;

    }

    public Iate(boolean piscina, int numeroCabine, int numeroTripulantes, String mar, String c, double pre) {
        super(mar, c, pre);
        this.piscina = piscina;
        this.numeroCabine = numeroCabine;
        this.numeroTripulantes = numeroTripulantes;

    }

    public Iate(boolean piscina, int numeroCabine, int numeroTripulantes, String mar) {
        super(mar);
        this.piscina = piscina;
        this.numeroCabine = numeroCabine;
        this.numeroTripulantes = numeroTripulantes;

    }

    public void setPiscina(boolean pis) {
        piscina = pis;

    }

    public void setNumeroCabine(int numCab) {
        if (numCab > 0) {
            numeroCabine = numCab;
        } else {
            System.out.println("Valor não pode ser 0");
        }

    }

    public void setNumeroTripulantes(int numTri) {
        if (numTri > 0) {
            numeroTripulantes = numTri;
        } else {
            System.out.println("Valor não pode ser 0!");
        }
    }

    public boolean getPiscina() {
        return piscina;
    }

    public int getNumeroCabine() {
        return numeroCabine;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void cadastrar(String marca, String modelo, String cor,
            String identificacao, double preco, double peso, int velocidadeMaxima,
            int numeroPassageiros, boolean piscina, String tipoCasco, int numeroCabine,
            int numeroTripulantes) {

        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setIdentificacao(identificacao);
        setPreco(preco);
        setPeso(peso);
        setVelocidadeMaxima(velocidadeMaxima);
        setNumeroPassageiros(numeroPassageiros);
        setPiscina(piscina);
        setNumeroCabine(numeroCabine);
        setNumeroTripulantes(numeroTripulantes);
    }

    @Override
    public void entradaDados() {

        super.entradaDados();
        System.out.println("Tem piscina disponível? 1 - para sim, 0 - para não");
        int escolha_ = sc.nextInt();
        if (escolha_ == 1) {
            setPiscina(true);
        } else {
            setPiscina(false);
        }
        System.out.println("Número de cabines do iate: ");
        setNumeroCabine(sc.nextInt());
        System.out.println("Número de tripulantes do iate: ");
        setNumeroTripulantes(sc.nextInt());

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Disponibilidade da pisica: " + getPiscina());
        System.out.println("Numero de cambines: " + getNumeroCabine());
        System.out.println("Numero tripulantes: " + getNumeroTripulantes());

    }

    public void valorDesconto() {
        System.out.println("O valor com desconto do iate é R$: " + getPreco()
                * 8 / 100);
    }
}
