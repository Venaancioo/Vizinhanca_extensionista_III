public enum Genero {
    PINTURA(1, "Serviços de pintura"),
    JARDINAGEM(2,"Serviços de Jardinagem"),
    REFORMA(3,"Serviços de Reforma"),
    AMBIENTE(4,"Serviços de Meio ambiente"),
    CONSTRUCAO(5,"Serviços de Construção");


    public int codigo;
    public String nome;

    Genero(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
