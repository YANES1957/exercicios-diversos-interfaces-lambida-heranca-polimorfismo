//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Colaborador colaborador = new Colaborador();
        Vendedor vendedor = new Vendedor();
        Gerente gerente = new Gerente();


        gerente.setNome("Roberto Yanes");
        gerente.setUsuario("YanesPerez");
        gerente.setSenha("1234");
        gerente.setComissão("10");
        gerente.setSalario("5.500,00");
        gerente.setEndereco("Rua Júlio Pedro Pontes 415");
        System.out.println(gerente.getNome());
        System.out.println(gerente.getUsuario());
        System.out.println(gerente.getSenha());
        System.out.println(gerente.getComissão());
        System.out.println(gerente.getSalario());
        System.out.println(gerente.getEndereco());;
        System.out.println("___________________________________________________-");

        Colaborador colaborador1 = new Colaborador();
        colaborador1.setNome("Pedro Silva");
        colaborador1.setIdade("39");
        colaborador1.setMatricula("1277");
        colaborador1.setEndereco("Rua: funchal n. 1224");
        colaborador1.setSalario("3.065,00");
        System.out.println(colaborador1.getNome());
        System.out.println(colaborador1.getMatricula());
        System.out.println(colaborador1.getEndereco());
        System.out.println(colaborador1.getSalario());
        System.out.println("_____________________________________________________________________");



        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Ana Paula Yanes");
        vendedor1.setMatricula("84");
        vendedor1.setIdade("41");
        vendedor1.setEndereco("Rua: Amarela n.13  - Casa B");
        vendedor1.setSalario("1.850,00");
        vendedor1.setComissao("10");
        System.out.println(vendedor1.getNome());
        System.out.println(vendedor1.getMatricula());
        System.out.println(vendedor1.getEndereco());
        System.out.println(vendedor1.getSalario());
        System.out.println(vendedor1.getComissao());


        System.out.println("______________________________________________________________________________");




        System.out.println("________________________________________________________");







    }
}