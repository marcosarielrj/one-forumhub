# Challenge ForumHub

API Rest do aplicativo Forum Hub, contendo funcionalidades CRUD para usuários, cursos, tópicos e comentários. E também toda a interação entre eles para formar o fórum.

## Funcionalidades

- **Autenticação de Usuários:** Login e cadastro de usuários com criptografia de senha e geração de tokens JWT.
- **Gerenciamento de Tópicos:** Criação, listagem, atualização de status e exclusão de tópicos.
- **Gerenciamento de Cursos:** Criação, listagem e exclusão de cursos.
- **Gerenciamento de Respostas:** Criação, listagem e exclusão de respostas para tópicos.
- **Documentação da API:** Utilização do Swagger para a documentação dos endpoints da API.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Security
- JWT
- Hibernate/JPA
- Jakarta Validation
- Swagger/OpenAPI 3

# Endpoints Principais

## Autenticação

 - POST /login: Autenticação do usuário e geração do token JWT.
 
## Usuários
 
 - POST /usuario: Cadastro de um novo usuário.
 - GET /usuario: Listagem de todos os usuários.
 - PUT /usuario: Atualização de dados de um usuário.
 - DELETE /usuario/{id}: Exclusão de um usuário.

## Tópicos

 - POST /topico: Criação de um novo tópico.
 - GET /topico: Listagem de todos os tópicos.
 - PUT /topico/status: Atualização do status de um tópico.
 - DELETE /topico/{id}: Exclusão de um tópico.

## Cursos

 - POST /curso: Criação de um novo curso.
 - GET /curso: Listagem de todos os cursos.
 - DELETE /curso/{id}: Exclusão de um curso.

## Respostas
 - POST /resposta: Criação de uma nova resposta.
 - GET /resposta: Listagem de todas as respostas.
 - DELETE /resposta/{id}: Exclusão de uma resposta.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)





