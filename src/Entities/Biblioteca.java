package Entities;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaLivros = new ArrayList<>();

    public void adicionaLivro(Livro novolivro){
        listaLivros.add(novolivro);
        System.out.println("Livro adicionado com sucesso!");
        System.out.println();
    }

    public void removeLivro(int idLivro) {
        Iterator<Livro> iterator = listaLivros.iterator();
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            if (livro.getId() == idLivro) {
                iterator.remove();
                System.out.println("Livro removido com sucesso!");
                return;
            }
        }
        System.out.println("Livro com ID " + idLivro + " não encontrado na biblioteca.\n");
    }
    public void listarLivros(){
        if (listaLivros.isEmpty()){
            System.out.println("-----------------");
            System.out.println("A biblioteca está vazia");
            System.out.println("-----------------");
        }
        else {
            System.out.println("\n***************************");
            System.out.println("Lista de livros na biblioteca");
            System.out.println("***************************");
        int i=1;
        for (Livro livro : listaLivros){
                System.out.println("Livro #"+i);
                i+=1;
                System.out.println(
                        "Cod: " + livro.getId() +
                        "\nTítulo: " + livro.getTitulo() +
                        "\nAutor: " + livro.getAutor() +
                        "\nGenero: " + livro.getGenero() +
                        "\nData publicação: " + livro.getDataPublicacao().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                System.out.println("-------------------");

        }
    }
}
}

