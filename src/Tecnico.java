public class Tecnico extends Funcionario {
    private final int horas;
    private final double salarioBase;

    public Tecnico(String nome, Empresa empresa) {
        super(nome, empresa);
        this.salarioBase = 3200;
        this.horas = 40;
    }

    public int getHoras() {
        return horas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void pagarSalario() {
        double salario = salarioBase + (salarioBase * (this.getEmpresa().getMetas() * 0.05));
        System.out.println("Salario pago: " + salario);
    }
}
