public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Teste", 2, 10000);
        Gerente gerente = new Gerente("gerente", empresa);
        Analista analista = new Analista("Analista", empresa);

        Diretor diretor = new Diretor("Diretor", empresa);
        Tecnico tecnico = new Tecnico("Tecnico", empresa);
        PJ pj = new PJ("PJ", empresa, 100);

        tecnico.pagarSalario();
        diretor.pagarSalario();
        analista.pagarSalario();
        gerente.pagarSalario();

        pj.pagarSalario();
        pj.setHoras(20);
        pj.pagarSalario();
    }
}
