# API-REST-Estoque-Cerveja
# API REST para Gerenciamento de Estoques de Cerveja

## Descrição

Esta é uma API REST para o gerenciamento de estoques de cerveja. O projeto é desenvolvido em Java utilizando o Spring Boot e JPA para persistência de dados. A API permite operações básicas para gerenciar cervejas, incluindo a criação, leitura, atualização e exclusão (CRUD) de registros de cervejas.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.2.5**
- **Spring Data JPA**
- **H2 Database** (para desenvolvimento e testes)
- **JUnit 5** e **Mockito** (para testes unitários)

## Estrutura do Projeto

- **`/src/main/java`**: Código-fonte da aplicação.
  - **`/com/exemplo/estoquecerveja/model`**: Modelos de dados (entidades JPA).
  - **`/com/exemplo/estoquecerveja/repository`**: Repositórios JPA.
  - **`/com/exemplo/estoquecerveja/service`**: Serviços da aplicação.
  - **`/com/exemplo/estoquecerveja/controller`**: Controladores REST.
- **`/src/test/java`**: Testes da aplicação.
  - **`/com/exemplo/estoquecerveja/service`**: Testes dos serviços.
