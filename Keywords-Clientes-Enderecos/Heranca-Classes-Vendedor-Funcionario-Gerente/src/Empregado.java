public abstract class Empregado {
    protected String nome;
    protected double salarioBase;

    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularBonus();

    public String cargo() {
        return "Empregado";
    }

    public String getNome() {
        return nome;
    }
}
