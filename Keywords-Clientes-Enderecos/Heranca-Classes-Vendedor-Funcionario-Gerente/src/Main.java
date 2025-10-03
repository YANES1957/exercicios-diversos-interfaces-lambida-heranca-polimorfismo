import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empregado> funcionarios = new ArrayList<>();

        // Gerente
        Gerente gerente = new Gerente("Ana", 10000);
        funcionarios.add(gerente);

        // Três vendedores
        funcionarios.add(new Vendedor("Carlos", 5000));
        funcionarios.add(new Vendedor("Mariana", 5500));
        funcionarios.add(new Vendedor("João", 4800));

        // Percorre e imprime todos (polimorfismo)
        for (Empregado f : funcionarios) {
            System.out.println(f.getNome() + " - " + f.cargo() + " - Bônus: " + f.calcularBonus());
        }
    }
}
