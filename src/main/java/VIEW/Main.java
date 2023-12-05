package VIEW;

import DTO.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    ControleColecaoLivrosDTO controle = new ControleColecaoLivrosDTO();
    Scanner input = new Scanner(System.in);
    int num;

    public static void main(String[] args) {
        Main main = new Main();
        main.Menu();

    }

    public void Menu() {
        boolean erro = false;
        while (true) {
            do {
                System.out.println("--------------------------------");
                System.out.println("O que você quer fazer?"
                        + "\n\t[1] Adicionar livro à estante"
                        + "\n\t[2] Exibir livros da estante"
                        + "\n\t[3] Procurar por livro da estante");

                try {
                    num = input.nextInt();
                    switch (num) {
                        case 1:
                            CriarLivro();
                            break;
                        case 2:
                            ExibirLivros();
                            break;
                        case 3:
                            ProcurarLivro();
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Digite um valor válido.");
                    input.next();
                    erro = true;
                }
            } while (erro);
        }
    }

    public void CriarLivro() {
        String tituloTemp, serieTemp, autorTemp;
        int volumeTemp, diaTemp, mesTemp, anoTemp;
        System.out.println("--------------------------------");
        System.out.println("O que você quer criar?"
                + "\n\t[1] Livro"
                + "\n\t[2] HQ"
                + "\n\t[3] Mangá");
        num = input.nextInt();
        LivroDTO livro;
        switch (num) {
            case 1:

                System.out.println("Digite o título do Livro: ");
                input.skip("\\R?");
                tituloTemp = input.nextLine();
                System.out.println("Digite o autor do Livro: ");
                input.skip("\\R?");
                autorTemp = input.nextLine();
                System.out.println("Digite o dia em que o livro foi comprado: ");
                diaTemp = input.nextInt();
                System.out.println("Digite o mês em que o livro foi comprado: ");
                mesTemp = input.nextInt();
                System.out.println("Digite o ano em que o livro foi comprado: ");
                anoTemp = input.nextInt();

                livro = new LivroDTO(tituloTemp, autorTemp, diaTemp, mesTemp, anoTemp);
                controle.addLivro(livro);
                break;

            case 2:
                System.out.println("Digite o título da HQ: ");
                input.skip("\\R?");
                tituloTemp = input.nextLine();
                System.out.println("Digite o autor da HQ: ");
                input.skip("\\R?");
                autorTemp = input.nextLine();
                System.out.println("Digite a série da HQ: ");
                input.skip("\\R?");
                serieTemp = input.nextLine();
                System.out.println("Digite o volume da HQ: ");
                volumeTemp = input.nextInt();
                System.out.println("Digite o dia em que a HQ foi comprada: ");
                diaTemp = input.nextInt();
                System.out.println("Digite o mês em que a HQ foi comprada: ");
                mesTemp = input.nextInt();
                System.out.println("Digite o ano em que a HQ foi comprada: ");
                anoTemp = input.nextInt();

                livro = new HQDTO(tituloTemp, autorTemp, serieTemp, volumeTemp, diaTemp, mesTemp, anoTemp);
                controle.addLivro(livro);
                break;

            case 3:
                System.out.println("Digite o título do mangá: ");
                input.skip("\\R?");
                tituloTemp = input.nextLine();
                System.out.println("Digite o autor do mangá: ");
                input.skip("\\R?");
                autorTemp = input.nextLine();
                System.out.println("Digite o volume do mangá: ");
                volumeTemp = input.nextInt();
                System.out.println("Digite o dia em que o mangá foi comprado: ");
                diaTemp = input.nextInt();
                System.out.println("Digite o mês em que o mangá foi comprado: ");
                mesTemp = input.nextInt();
                System.out.println("Digite o ano em que o mangá foi comprado: ");
                anoTemp = input.nextInt();

                livro = new MangaDTO(tituloTemp, autorTemp, volumeTemp, diaTemp, mesTemp, anoTemp);
                controle.addLivro(livro);
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");
        }

    }

    public void ExibirLivros() {
        controle.displayLivros();

    }

    public void ProcurarLivro() {
        String tituloSearch, autorSearch;
        int diaSearch, mesSearch, anoSearch;
        ArrayList<LivroDTO> retorno;

        System.out.println("Você deseja filtrar sua coleção por qual parâmetro?"
                + "\n\t[1] Título"
                + "\n\t[2] Autor"
                + "\n\t[3] Data da Compra");
        num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println("Digite o título do livro para filtrar.");
                input.skip("\\R?");

                tituloSearch = input.nextLine();
                retorno = controle.getLivro(tituloSearch);
                retorno.forEach((livro) -> livro.toString());
                break;

            case 2:
                System.out.println("Digite o autor do livro para filtrar.");
                input.skip("\\R?");

                autorSearch = input.nextLine();
                retorno = controle.getLivro(autorSearch, 1);
                retorno.forEach((livro) -> livro.toString());
                break;

            case 3:
                System.out.println("Digite a data da compra para filtrar.");
                System.out.println("Dia: ");
                diaSearch = input.nextInt();
                System.out.println("Mes: ");
                mesSearch = input.nextInt();
                System.out.println("Ano: ");
                anoSearch = input.nextInt();
                retorno = controle.getLivro(diaSearch, mesSearch, anoSearch);
                retorno.forEach((livro) -> livro.toString());
                break;

            default:
                System.out.println("Opção inválida. Tente novamente.");

        }

    }
}
