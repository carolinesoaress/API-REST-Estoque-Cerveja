# API-REST-Estoque-Cerveja
API REST para Gerenciamento de Estoques de Cerveja
Descrição
Esta é uma API REST para o gerenciamento de estoques de cerveja. O projeto é desenvolvido em Java utilizando o Spring Boot e JPA para persistência de dados. A API permite operações básicas para gerenciar cervejas, incluindo a criação, leitura, atualização e exclusão (CRUD) de registros de cervejas.

Tecnologias Utilizadas
Java 17
Spring Boot 3.2.5
Spring Data JPA
H2 Database (para desenvolvimento e testes)
JUnit 5 e Mockito (para testes unitários)
Estrutura do Projeto
/src/main/java: Código-fonte da aplicação.
/com/exemplo/estoquecerveja/model: Modelos de dados (entidades JPA).
/com/exemplo/estoquecerveja/repository: Repositórios JPA.
/com/exemplo/estoquecerveja/service: Serviços da aplicação.
/com/exemplo/estoquecerveja/controller: Controladores REST.
/src/test/java: Testes da aplicação.
/com/exemplo/estoquecerveja/service: Testes dos serviços.
Configuração do Projeto
Clone o Repositório

bash
Copiar código
git clone https://github.com/usuario/repositorio.git
Navegue até o Diretório do Projeto

bash
Copiar código
cd repositorio
Construir o Projeto

Use o Maven para construir o projeto e baixar as dependências:

bash
Copiar código
mvn clean install
Executar a Aplicação

Após a construção bem-sucedida, você pode executar a aplicação com:

bash
Copiar código
mvn spring-boot:run
A API estará disponível em http://localhost:8080.

Endpoints da API
Cervejas
Listar todas as cervejas

GET /api/cervejas
Resposta: Lista de cervejas.
Buscar cerveja por ID

GET /api/cervejas/{id}
Resposta: Detalhes da cerveja.
Criar nova cerveja

POST /api/cervejas
Corpo da Requisição: { "nome": "Nome da Cerveja", "quantidade": 10 }
Resposta: Cerveja criada.
Atualizar cerveja

PUT /api/cervejas/{id}
Corpo da Requisição: { "nome": "Novo Nome", "quantidade": 20 }
Resposta: Cerveja atualizada.
Excluir cerveja

DELETE /api/cervejas/{id}
Resposta: Status de sucesso.
Testes
Os testes unitários estão localizados na pasta src/test/java. Para executar os testes, utilize:

bash
Copiar código
mvn test
Contribuição
Se você deseja contribuir para o projeto, por favor, faça um fork do repositório e envie um pull request com suas melhorias. Certifique-se de seguir as melhores práticas de codificação e escrever testes adequados.

Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo LICENSE para mais detalhes.
