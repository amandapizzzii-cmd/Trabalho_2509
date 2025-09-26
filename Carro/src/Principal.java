import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locadora locadora = new Locadora();

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("\n==== MENU LOCADORA ====");
            System.out.println("1 - Cadastrar carro");
            System.out.println("2 - Cadastrar cliente");
            System.out.println("3 - Alugar carro");
            System.out.println("4 - Devolver carro");
            System.out.println("5 - Listar carros disponíveis");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Cor: ");
                    String cor = sc.nextLine();
                    Carro carro = new Carro(modelo, ano, cor);
                    locadora.cadastrarCarro(carro);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    Cliente cliente = new Cliente(nome, cpf, idade);
                    locadora.cadastrarCliente(cliente);
                    break;

                case 3:
                    System.out.print("Digite o modelo do carro para alugar: ");
                    String modeloAlugar = sc.nextLine();
                    locadora.alugarCarro(modeloAlugar);
                    break;

                case 4:
                    System.out.print("Digite o modelo do carro para devolver: ");
                    String modeloDevolver = sc.nextLine();
                    locadora.devolverCarro(modeloDevolver);
                    break;

                case 5:
                    locadora.listarCarrosDisponiveis();
                    break;

                case 6:
                    System.out.println("Saindo... Obrigado por usar a Locadora!");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

        sc.close();
    }
}
