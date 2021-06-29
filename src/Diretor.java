public class Diretor extends Funcionario {
    private final double salarioBase;

    public Diretor(String nome, Empresa empresa) {
        super(nome, empresa);
        this.salarioBase = 15000;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void pagarSalario() {
        double salario = salarioBase + this.getEmpresa().getFaturamento() * 0.03;
        System.out.println("Salario pago: " + salario);
    }
}