# 📝 To-Do List API

Uma API REST completa e simplificada para o gerenciamento de tarefas cotidianas (To-Do List), desenvolvida como parte do aprendizado prático em arquitetura de sistemas com o ecossistema Spring.

## 🚀 O que este projeto faz?
O sistema permite cadastrar, listar, atualizar e deletar tarefas. Conta com validações de segurança que impedem a inserção de dados inválidos ou em branco na API e possui uma suíte completa de testes automatizados para garantir a estabilidade do código.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17** (JDK Eclipse Adoptium)
- **Spring Boot 4.0.6**
  - *Spring Data JPA* (Persistência e comunicação com banco)
  - *Spring Web* (Criação de endpoints REST)
  - *Spring Validation* (Regras de validação de dados)
- **Bancos de Dados:**
  - **PostgreSQL** (Banco principal via Docker)
  - **H2 Database** (Banco em memória isolado para os testes)
- **Documentação:** Swagger UI (Springdoc OpenAPI)
- **Containers:** Docker & Docker Compose

---

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **Docker** e o **Java 17** instalados.
2. Crie um arquivo `.env` na raiz do projeto com as credenciais do seu banco PostgreSQL local.
3. Execute as dependências com o Docker Compose:
   ```bash
   docker-compose up -d
Execute a aplicação através da sua IDE (IntelliJ) ou via terminal:

Bash
./mvnw spring-boot:run
📖 Rotas da API e Documentação
Com a aplicação rodando, você pode acessar a documentação interativa pelo seu navegador para testar os endpoints sem precisar do Postman:

Plaintext
http://localhost:8080/swagger-ui/index.html
Endpoints:
GET /tasks - Lista todas as tarefas cadastradas.

POST /tasks - Cria uma nova tarefa (Valida se o nome e descrição não estão vazios).

PUT /tasks/{id} - Atualiza as informações de uma tarefa existente.

DELETE /tasks/{id} - Remove uma tarefa do sistema.
