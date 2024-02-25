import Entities.Biblioteca;
import Entities.Livro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        char opc;

        System.out.println("---------------------");
        System.out.println("Biblioteca de livros");
        System.out.println("---------------------");
        System.out.println(" ");
    try{
        do{
            System.out.println("Selecione uma opção: ");
            System.out.println("1- Cadastrar novo livro");
            System.out.println("2- Remover Livro");
            System.out.println("3- Listar livros da biblioteca");
            System.out.println("4- Sair\n");
            opc = sc.next().charAt(0);
            sc.nextLine();

            switch (opc){
                case '1':
                    System.out.println("--------------------");
                    System.out.println("Cadastro de livros");
                    System.out.println("--------------------");
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Gênero: ");
                    String genero = sc.nextLine();
                    System.out.print("Data de publicação (dd/MM/yyyy): ");
                    LocalDate dataPublicacao = LocalDate.parse(sc.nextLine(), fmt);
                    System.out.print("Digite o código de cadastro: ");
                    int id = sc.nextInt();

                    Livro livro = new Livro(titulo, autor, genero, dataPublicacao, id);
                    biblioteca.adicionaLivro(livro);
                    break;
                case '2':
                    System.out.println("Escreva o ID do livro para remover: ");
                    id = sc.nextInt();
                    biblioteca.removeLivro(id);
                    break;
                case '3':
                    biblioteca.listarLivros();
                    break;
                case '4':
                 System.out.println("Fim do programa");
                 break;
                default:
                    System.out.println("\n***************************");
                    System.out.println("Escolha uma opção válida");
                    System.out.println("***************************\n");
            }

        }while (opc != '4');

    }catch (DateTimeParseException e) {
             System.out.println("Formato de data inválido. Por favor, digite no formato dd/MM/yyyy.");
      sc.nextLine();
        }
    catch (InputMismatchException e) {
        System.out.println("Caracteres inválidos, por favor digite somente números!");
    }
    catch (RuntimeException e) {
        System.out.println("Ocorreu um erro inesperado");
    }
    sc.close();
}
}