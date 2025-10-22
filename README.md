Banking App API
Uma API RESTful para um sistema bancário simples desenvolvida com Spring Boot.

📋 Descrição
Esta API permite o gerenciamento completo de contas bancárias, incluindo operações financeiras básicas como depósitos, saques, transferências entre contas e consulta de histórico de transações.

🚀 Funcionalidades
Gestão de Contas

Criação de contas: Cria novas contas bancárias com nome do titular e saldo inicial

Consulta de contas: Obter detalhes de uma conta específica ou listar todas as contas

Exclusão de contas: Remover contas do sistema

Operações Financeiras

Depósitos: Adicionar fundos a uma conta existente

Saques: Retirar fundos de uma conta (com validação de saldo suficiente)

Transferências: Transferir valores entre duas contas diferentes

Histórico e Extratos

Consulta de transações: Visualizar todo o histórico de movimentações de uma conta

Ordenação por data: Transações listadas da mais recente para a mais antiga

🏗️ Estrutura do Projeto

banking-app/
├── pom.xml (Lista de ferramentas necessárias)
└── src/main/java/net/vbonilha/banking_app/
    ├── BankingAppApplication.java (Motor principal da aplicação)
    ├── controller/ (Recebe solicitações dos usuários)
    ├── dto/ (Formulários padrão para dados)
    ├── entity/ (Tabelas do banco de dados)
    ├── exception/ (Gerenciamento de erros)
    ├── mapper/ (Conversão de dados)
    └── repository/ (Armazenamento de dados)

    
🔄 Fluxo de Operações

Criação de Conta

Recebe dados do titular e saldo inicial via POST

Valida e persiste a nova conta no banco de dados

Retorna os dados da conta criada com ID único

Operações de Depósito/Saque

Identifica a conta pelo ID

Valida o valor da operação

Atualiza o saldo da conta

Registra a transação no histórico

Transferência entre Contas

Valida existência das contas de origem e destino

Verifica saldo suficiente na conta de origem

Executa débito na conta de origem e crédito na conta de destino

Registra duas transações (uma para cada conta)

🛡️ Tratamento de Erros

Conta não encontrada: Retorna erro 404 com mensagem específica

Saldo insuficiente: Impede saques e transferências sem fundos

Erros internos: Tratamento genérico com respostas padronizadas

📊 Modelo de Dados

Account: ID único, nome do titular, saldo atual

Transaction: ID único, referência à conta, valor, tipo (DEPOSIT/WITHDRAWAL), data/hora

🔌 Endpoints Disponíveis

POST /api/accounts - Criar conta

GET /api/accounts - Listar todas as contas

GET /api/accounts/{id} - Consultar conta específica

DELETE /api/accounts/{id} - Excluir conta

PUT /api/accounts/{id}/deposit - Realizar depósito

PUT /api/accounts/{id}/withdraw - Realizar saque

POST /api/accounts/transfer - Transferir entre contas

GET /api/accounts/{id}/transactions - Consultar transações

⚙️ Requisitos do Sistema

requirements.txt

Java 17 ou superior
MySQL 8.0 ou superior
Maven 3.6 ou superior
Spring Boot 3.x
Spring Data JPA
Spring Web
MySQL Connector
Ferramentas Necessárias:

Java 17: Linguagem de programação que roda a aplicação

MySQL 8.0: Banco de dados para armazenar contas e transações

Maven 3.6: Gerenciador de dependências e build do projeto

Spring Boot: Framework principal da aplicação

📝 Próximos Passos

Implementar autenticação e autorização

Adicionar documentação Swagger/OpenAPI

Criar testes de integração abrangentes

Implementar paginação nas consultas

Adicionar cache para melhor performance

Desenvolvido com Spring Boot - Uma aplicação robusta e escalável para demonstração de conceitos bancários básicos.
