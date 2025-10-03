public class User {
    private String name;
    private int age;

    // Construtor
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters (opcional, mas útil)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Sobrescrevendo toString para facilitar impressão
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
