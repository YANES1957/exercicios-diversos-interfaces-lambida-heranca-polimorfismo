public class Gerente extends Empregado {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.3; // 30% de bônus
    }

    @Override
    public String cargo() {
        return "Gerente";
    }
}
