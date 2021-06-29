public class Analista extends Funcionario {
    private final int horas;
    private final double salarioBase;
    private final int horasDescansoRenumeradas;

    public Analista(String nome, Empresa empresa) {
        super(nome, empresa);
        this.salarioBase = 4000;
        this.horas = 40;
        this.horasDescansoRenumeradas = 4;
    }

    public int getHoras() {
        return horas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void pagarSalario() {
        double salario = salarioBase + (salarioBase * (this.getEmpresa().getMetas() * 0.08));
        System.out.println("Salario pago: " + salario);
    }
}