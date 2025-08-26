public class Solicitante {
    private Senha senha;
    private String nomeEmpr;
    private int cpfCnpj;

    public Solicitante(String nomeEmpr, int cpfCnpj){
        setNomeEmpr(nomeEmpr);
        setCpfCnpj(cpfCnpj);
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    public String getNomeEmpr() {
        return nomeEmpr;
    }

    public void setNomeEmpr(String nomeEmpr) {
        this.nomeEmpr = nomeEmpr;
    }

    public int getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(int cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}
