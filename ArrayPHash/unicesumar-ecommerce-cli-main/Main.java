import java.util.Scanner;

import entities.Product;
import repository.EntityRepository;
import repository.HashMapRepository;
import repository.InMemoryRepository;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        EntityRepository<Product> listaDeProdutos = new HashMapRepository<>();

        listaDeProdutos.save(new Product("batata", 10));

        do {
            System.out.println("\033[H\033[2J");
            System.out.flush();

            System.out.println("\n---MENU---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Buscar Produto");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Cadastrar Produto");
                    break;
                case 2:
                    System.out.println("Buscar Produto");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");;
            }

        } while (option != 3);

        scanner.close();
    }
}