## Sistema de Chamados

# Objetivo
Criar uma API back-end em Java com Quarkus para gerenciar chamados técnicos.

O sistema deve permitir que usuários abram chamados informando um problema, e que técnicos possam visualizar, assumir, acompanhar e resolver esses chamados.

# Primeira versão do sistema
A primeira versão será simples, sem login, sem autenticação e sem interface web.

# O foco inicial será:
    -criar chamados;
    -listar chamados;
    -buscar chamado por ID;
    -alterar status do chamado;
    -atribuir um técnico responsável;
    -salvar os dados no banco PostgreSQL;
    -testar os endpoints pelo Swagger/OpenAPI ou Postman.
    -Possíveis classes principais

# Chamado
Representa o problema ou solicitação aberta por um usuário.
# Possíveis informações:
    id;
    título;
    descrição;
    status;
    prioridade;
    categoria;
    data de criação;
    data de atualização;
    nome solicitante;
    email solicitante;
    técnico responsável.

    
# Técnico
    Representa a pessoa responsável por atender chamados.

# Possíveis informações:
    id;
    nome;
    email;
    especialidade.


# Regras iniciais
    1- Todo chamado deve começar com status ABERTO.
    2- Todo chamado precisa ter título e descrição.
    3- Um chamado pode existir sem técnico responsável no início.
    4- Um usuário pode abrir vários chamados.
    5- Um técnico pode atender vários chamados.
    6- Um chamado pode mudar de status durante o atendimento.
    7- A primeira versão não terá login.

# Informaçoes
Por enquanto a parte de "Usuario" Não tera no sistema um chamado ja vai receber o nome e o email do solicitante.
Somente para facilitar a criaçao do primeiro codigo, e futuramente evoluir

Status precisa ser um enum por que quero que ele tenha somente alguns valores:
aberto, em analise, em andamento, parado, resolvido, fechado.

Da mesma forma prioridade tembem tem que ser Enum afinal so existe prioridade:
baixa, media, alta, extrema.

Categoria também sera Enum mas em categoria vão existir varias conforme o projeto for evoluindo

# Quando um chamado nasce...
quando um chamado nasce quem deve definir cada coisa?
