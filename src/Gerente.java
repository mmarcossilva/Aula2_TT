public class Gerente extends Funcionario {
    private final int horas;
    private final double salarioBase;
    private final int horasDescansoRenumeradas;

    public Gerente(String nome, Empresa empresa) {
        super(nome, empresa);
        this.salarioBase = 6000;
        this.horas = 36;
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
        double salario = salarioBase + (salarioBase * (this.getEmpresa().getMetas() * 0.125));
        System.out.println("Salario pago: " + salario);
    }
}