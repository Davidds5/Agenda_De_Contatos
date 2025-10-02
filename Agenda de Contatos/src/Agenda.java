import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();

    public void adicionarContatos(Contato contato){
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso !");

    }
    public void listarContatos(){
        if(contatos.isEmpty()){
            System.out.println("Nenhum contato encotrato.");

        }else {
            System.out.println("\n📒 Lista de contatos:");
            for (int i = 0; i < contatos.size(); i++) {
                System.out.println((i + 1) + " - " + contatos.get(i));
            }
        }
    }
    public void buscaContato(String nome){
        boolean encotrato = false;
        for (Contato c : contatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                System.out.println("Contato encontrato: " + c );
                encotrato = true;
                break;
            }
        }
        if (!encotrato){
            System.out.println("Contato nao encotrato !");
        }
    }
    public void removerContato(String nome){
        Contato remover = null;
        for (Contato c : contatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                remover = c;
                break;
            }
        }
        if (remover != null){
            contatos.remove(remover);
            System.out.println("Contato removido com sucesso !");
        }else {
            System.out.println("Contato nao encontrato !");
        }
    }
}

