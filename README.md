## Sobre o projeto

Byte-bank-jdbc é um projeto para fins de aprendizado relacionado ao JDBC.

---

## Funcionalidades

- [x] Listar contas abertas;
- [x] Abertura de conta;
- [x] Encerramento de conta;
- [x] Consultar saldo de uma conta;
- [x] Realizar saque em uma conta;
- [x] Realizar depósito em uma conta;
- [x] Persistir dados em uma banco Mysql utilizando a API do JDBC

---

## Layout

O projeto desse repositório é apenas a API Backend para fins de estudos da API do JDBC.

---

## Tecnologias

As seguintes tecnologias foram utilizadas no desenvolvimento do projeto:

- **[Java 17](https://www.oracle.com/java)**

---

## Licença

O projeto desse repositório foi desenvolvido por meio de um curso e utilizado nos cursos de Integração de uma aplicação java com o banco de dados.

---

## Alterações

-  Para simplificar e encapsular a criação da conexão, usei a classe ConnectionFactory;
-   Encapsulando a criação de um objeto com o Factory Method
- melhorarando o código definindo responsabilidades, criando uma classe DAO (Data Access Object), que ficará responsável por toda integração com o banco de dados.