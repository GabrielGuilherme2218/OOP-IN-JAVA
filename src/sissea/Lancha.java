package sissea;

public class Lancha extends SuperClass {

    boolean banheiro;
    String tipoCasco;

    public Lancha() {

    }

    public Lancha(boolean banheiro, String tipoCasco, String mar) {
        super(mar);
        this.banheiro = banheiro;
        this.tipoCasco = tipoCasco;

    }

    public Lancha(boolean banheiro, String tipoCasco, String mar, String mod) {
        super(mar, mod);
        this.banheiro = banheiro;
        this.tipoCasco = tipoCasco;

    }

    public Lancha(boolean banheiro, String tipoCasco, String mar, String mod, String c) {
        super(mar, mod, c);
        this.banheiro = banheiro;
        this.tipoCasco = tipoCasco;

    }

    public Lancha(boolean banheiro, String tipoCasco, String mar, String c, double pre) {
        super(mar, c, pre);
        this.banheiro = banheiro;
        this.tipoCasco = tipoCasco;

    }

    public Lancha(boolean banheiro, String tipoCasco, String mar, String id, double pre, double pes, int VelMax) {
        super(mar, id, pre, pes, VelMax);
        this.banheiro = banheiro;
        this.tipoCasco = tipoCasco;

    }

    public void setBanheiro(boolean ban) {
        banheiro = ban;
    }

    public void setTipoCasco(String tipCas) {
        if (!tipCas.isEmpty()) {
            tipoCasco = tipCas;
        } else {
            System.out.println("é necessário digitar algo! ");
        }
    }

    public boolean getBanheiro() {
        return banheiro;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void cadastrar(String mar, String modelo, String cor,
            String identificacao, double preco, double peso, int velocidadeMaxima,
            int numeroPassageiros, boolean banheiro, String tipoCasco) {

        setMarca(mar);
        setModelo(modelo);
        setCor(cor);
        setIdentificacao(identificacao);
        setPreco(preco);
        setPeso(peso);
        setVelocidadeMaxima(velocidadeMaxima);
        setNumeroPassageiros(numeroPassageiros);
        setBanheiro(banheiro);
        setTipoCasco(tipoCasco);

    }

    @Override
    public void entradaDados() {

        super.entradaDados();
        System.out.println("A Lancha tem banheiro disponível? 1 - para sim 2 - para não: ");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            setBanheiro(true);
        } else {
            setBanheiro(false);
        }
        System.out.println("Qual o tipo de casco presente na lancha ?");
        setTipoCasco(sc.nextLine());
    }

    @Override
    public void imprimir() {

        super.imprimir();
        System.out.println("Disponibilidade do baneiro da lancha é: " + getBanheiro());
        System.out.println("O tipo de casco da lancha é: " + getTipoCasco());
    }

    public void valorDesconto() {

        System.out.println("O valor com desconto da lancha é: R$" + getPreco()
                * 8 / 10);
    }
}
