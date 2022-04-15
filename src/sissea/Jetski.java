package sissea;

public class Jetski extends SuperClass {

    boolean reboque;
    String tipoCasco;

    public Jetski() {

    }

    public Jetski(boolean reboque, String tipoCasco, String mar, String mod, String c, String id, double pre) {
        super(mar, mod, c, id, pre);
        this.reboque = reboque;
        this.tipoCasco = tipoCasco;

    }

    public Jetski(boolean reboque, String tipoCasco, String mar, String mod, String c, String id, double pre, double pes) {
        super(mar, mod, c, id, pre, pes);
        this.reboque = reboque;
        this.tipoCasco = tipoCasco;

    }

    public Jetski(boolean reboque, String tipoCasco, String mar, String mod, double pes, int VelMax) {
        super(mar, mod, pes, VelMax);
        this.reboque = reboque;
        this.tipoCasco = tipoCasco;

    }

    public Jetski(boolean reboque, String tipoCasco, String mar, String mod, String c) {
        super(mar, mod, c);
        this.reboque = reboque;
        this.tipoCasco = tipoCasco;

    }

    public Jetski(boolean reboque, String tipoCasco, String mar) {
        super(mar);
        this.reboque = reboque;
        this.tipoCasco = tipoCasco;

    }

    public void setReboque(boolean reb) {
        reboque = reb;
    }

    public void setTipoCasco(String tipCas) {
        if (!tipCas.isEmpty()) {
            tipoCasco = tipCas;
        } else {
            System.out.println("é necessário digitar algo!");
        }
    }

    public boolean getReboque() {
        return reboque;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void cadastrar(String marca, String modelo, String cor,
            String identificacao, double preco, double peso, int velocidadeMaxima,
            int numeroPassageiros, boolean reboque, String tipoCasco) {

        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setIdentificacao(identificacao);
        setPreco(preco);
        setPeso(peso);
        setVelocidadeMaxima(velocidadeMaxima);
        setNumeroPassageiros(numeroPassageiros);
        setReboque(reboque);
        setTipoCasco(tipoCasco);

    }

    @Override
    public void entradaDados() {

        super.entradaDados();
        System.out.println("Tem reboque disponível? 1 - para sim, 0 - para não");
        int escolha = (sc.nextInt());
        if (escolha == 1) {
            setReboque(true);
        } else {
            setReboque(false);
        }
        System.out.println("Qual o tipo de casco do jetski: ");
        setTipoCasco(sc.nextLine());
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Disponibilidade do reboque do jetski é: " + getReboque());
        System.out.println("O tipo de casco do jetski é:   " + getTipoCasco());
    }

    public void valorDesconto() {
        System.out.println("O valor com desconto do Jetski é: R$ " + getPreco() * 15 / 100);
    }
}
