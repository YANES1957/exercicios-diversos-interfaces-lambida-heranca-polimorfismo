import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Criando lista de usuários
        List<User> users = List.of(
                new User("Maria", 21),
                new User("Cesar", 43),
                new User("Julio", 34),
                new User("Ana", 40)
        );

        // Usando lambda para imprimir cada usuário
        users.forEach(user -> System.out.println(user)); 
    }
}
