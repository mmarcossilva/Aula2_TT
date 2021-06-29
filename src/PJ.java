public class PJ extends Funcionario{
    private int horas;
    private double valorHora;

    public PJ(String nome, Empresa empresa, double valorHora) {
        super(nome, empresa);
        this.valorHora = valorHora;
        this.horas = 0;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public void pagarSalario() {
        double salario = valorHora * horas;
        System.out.println("Salario pago: " + salario);
    }
}
