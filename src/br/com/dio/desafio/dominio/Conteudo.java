package br.com.dio.desafio.dominio;
//Essa classe foi criada para implementar esses atributos nas calsses filhas, evitando a repetição de código
public abstract class Conteudo {
    protected static final double XP_PADRAO=10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
