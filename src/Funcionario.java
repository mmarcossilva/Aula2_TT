public abstract class Funcionario {
    private final String nome;
    private Empresa empresa;

    public Funcionario(String nome, Empresa empresa) {
        this.nome = nome;
        this.empresa = empresa;
    }

    public String getNome() {
        return nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public abstract void pagarSalario();
}
