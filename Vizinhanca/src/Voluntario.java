import java.security.PublicKey;

public class Voluntario {
    private Senha senha;
    public String nome;
    public String sobrenome;
    public String nascimento;
    public String cpf;


    public Voluntario(String nome, String sobrenome, String nascimento, String cpf){
        setNome(nome);
        setSobrenome(sobrenome);
        setNascimento(nascimento);
        setCpf(cpf);
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}