# WebService - Spring Boot & JPA 🚀

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

Um projeto prático focado na construção de uma API RESTful completa utilizando **Java** e o ecossistema **Spring Boot**. Este projeto implementa um domínio de e-commerce (com Usuários, Pedidos, Categorias e Produtos), demonstrando os principais conceitos de mapeamento objeto-relacional (ORM), injeção de dependências e tratamento de exceções.

## 🧠 Principais Conceitos Abordados

* **Padrão de Camadas:** Organização lógica em `Resource` (Controladores REST), `Service` (Regras de Negócio), e `Repository` (Acesso a dados).
* **Mapeamento Objeto-Relacional (ORM):** Utilização do **JPA** e **Hibernate** para mapear classes Java para tabelas de banco de dados (`@Entity`, `@Table`, `@Id`).
* **Relacionamentos:** Configuração prática de associações de banco de dados (`@OneToMany`, `@ManyToOne`, `@ManyToMany`).
* **Database Seeding:** Povoamento automático do banco de dados na inicialização do sistema utilizando a interface `CommandLineRunner` (Perfil de Teste).
* **Tratamento de Exceções:** Criação de respostas HTTP adequadas para erros customizados (`ResourceNotFoundException`, `DatabaseException`) utilizando anotações modernas do Spring.

## 🛠️ Tecnologias Utilizadas

* **Java 25**
* **Spring Boot 3**
* **Spring Data JPA**
* **H2 Database** (Banco de dados em memória para testes rápidos)
* **Maven** (Gerenciamento de dependências)
* **Postman** (Para testes de requisições HTTP)

## ⚙️ Como Executar o Projeto

1. Certifique-se de ter o **JDK** e o **Maven** instalados na sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/feliperoque-dev/webservice-spirngboot-jap.git](https://github.com/feliperoque-dev/webservice-spirngboot-jap.git)
