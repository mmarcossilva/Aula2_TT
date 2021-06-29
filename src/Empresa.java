public class Empresa {
    private final String nome;
    private int metas;
    private double faturamento;

    public Empresa(String nome, int metas, double faturamento) {
        this.nome = nome;
        this.metas = metas;
        this.faturamento = faturamento;
    }

    public String getNome() {
        return nome;
    }

    public int getMetas() {
        return metas;
    }

    public double getFaturamento() {
        return faturamento;
    }
}
