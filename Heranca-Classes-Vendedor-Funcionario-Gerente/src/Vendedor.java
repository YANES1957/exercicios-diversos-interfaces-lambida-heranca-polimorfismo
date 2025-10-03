
public class Vendedor extends Empregado {

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.15; // 15% de bônus
    }

    @Override
    public String cargo() {
        return "Vendedor";
    }
}
