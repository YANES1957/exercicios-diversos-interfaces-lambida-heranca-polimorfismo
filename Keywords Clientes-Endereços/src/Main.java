import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Maria", 25, new Endereco("Rua A", 100, "São Paulo")));
        clientes.add(new Cliente("Cesar", 43, new Endereco("Rua B", 200, "Guarujá")));
        clientes.add(new Cliente("Julio", 34, new Endereco("Rua C", 300, "São Paulo")));
        clientes.add(new Cliente("Ana", 40, new Endereco("Rua D", 400, "Santos")));

        // Lambda: filtrar clientes com idade maior que 30
        List<Cliente> clientesMais30 = clientes.stream()
                .filter(c -> c.getIdade() > 30)
                .collect(Collectors.toList());

        // Lambda: imprimir clientes filtrados
        clientesMais30.forEach(System.out::println);

        // Lambda: mapear nomes dos clientes
        List<String> nomes = clientes.stream()
                .map(Cliente::getNome)
                .collect(Collectors.toList());

        System.out.println("Nomes dos clientes: " + nomes);
    }
}
