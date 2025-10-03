public class Gerente extends Colaborador {
    private String nome;

    private String idade;


    private String matricula;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String getSalario() {
        return salario;
    }

    @Override
    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getComissão() {
        return comissão;
    }

    public void setComissão(String comissão) {
        this.comissão = comissão;
    }

    private String usuario;


    private String senha;



    private String endereco;


    private String salario;



    private String comissão;

}



