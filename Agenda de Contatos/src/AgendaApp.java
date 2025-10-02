import java.util.Scanner;

public class AgendaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int op;

        do{
            System.out.println("=== Agenda de Contatos ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Lista Contatos");
            System.out.println("3 - Busca Contato");
            System.out.println("4 - Remover Contato");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opcao");
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Telefone: ");
                    String telefone = sc.nextLine();

                    System.out.println("Email: ");
                    String email = sc.nextLine();

                    Contato contato = new Contato(nome, telefone, email);
                    agenda.adicionarContatos(contato);
                    break;

                case 2:
                    agenda.listarContatos();
                    break;

                case 3:
                    System.out.println("Informe o nome do contato");
                    String busca = sc.nextLine();
                    agenda.buscaContato(busca);
                    break;

                case 4:
                    System.out.println("Informe o nome do contato: ");
                    String remover = sc.nextLine();
                    agenda.removerContato(remover);
                    break;

                case 0:
                    System.out.println("Saindo da agenda....");
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente.");

               }
         }while (op != 0);

        sc.close();
        }
    }


