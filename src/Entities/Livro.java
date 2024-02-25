package Entities;

import java.time.LocalDate;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String genero;
    private LocalDate dataPublicacao;


    public Livro(String titulo, String autor, String genero, LocalDate anoPublicacao, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.dataPublicacao = anoPublicacao;
        this.id = id;
    }

    public Livro() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }


}
