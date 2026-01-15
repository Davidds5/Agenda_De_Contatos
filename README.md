📒 Agenda de Contatos em Java (Console)

Projeto de Agenda de Contatos desenvolvido em Java, executado via terminal, com foco no aprendizado de orientação a objetos, uso de ArrayList, Scanner e estruturas básicas de controle.

A aplicação permite ao usuário adicionar, listar, buscar e remover contatos através de um menu interativo no console.

🛠️ Tecnologias Utilizadas

Java (JDK 8 ou superior)

Console / Terminal

ArrayList

Scanner

Nenhum framework. Nenhum banco de dados. Tudo em memória. Se fechar o programa, perdeu os dados. Isso é esperado.

📌 Funcionalidades

Adicionar um contato (nome, telefone e email)

Listar todos os contatos cadastrados

Buscar contato pelo nome

Remover contato pelo nome

Menu interativo em loop até o usuário sair

🧱 Estrutura do Projeto
src/
 ├── Agenda.java
 ├── AgendaApp.java
 └── Contato.java

Descrição das classes
Contato

Representa um contato da agenda.

Atributos:

nome

telefone

email

Responsabilidades:

Armazenar dados do contato

Fornecer getters e setters

Exibir os dados formatados com toString()

Agenda

Responsável por gerenciar os contatos.

Funções:

Armazenar contatos em um ArrayList

Adicionar contatos

Listar contatos

Buscar contato pelo nome

Remover contato pelo nome

AgendaApp

Classe principal (main).

Responsabilidades:

Exibir o menu no console

Capturar entradas do usuário com Scanner

Chamar os métodos da classe Agenda

Controlar o fluxo da aplicação

▶️ Como Executar o Projeto

Compile os arquivos:

javac *.java


Execute a aplicação:

java AgendaApp


O menu será exibido no terminal:

=== Agenda de Contatos ===
1 - Adicionar contato
2 - Lista Contatos
3 - Busca Contato
4 - Remover Contato
0 - Sair

🗃️ Exemplo de Saída
📒 Lista de contatos:
1 - Nome: João | Telefone: 11999999999 | Email: joao@email.com

⚠️ Observações Importantes

A busca e remoção são feitas pelo nome

Se houver dois contatos com o mesmo nome, apenas o primeiro encontrado será considerado

Os dados não são persistidos

Erros de digitação do usuário não são tratados

Tudo isso é limitação do projeto atual. Não é bug, é falta de evolução.

🚀 Melhorias Futuras

Validação de entrada (evitar nome vazio, telefone inválido)

Permitir edição de contatos

Persistência em arquivo ou banco de dados

Buscar contatos por telefone ou email

Interface gráfica ou API REST

👤 Autor

Desenvolvido por Clovin
Estudante de Ciências da Programação
Projeto para prática de fundamentos em Java
