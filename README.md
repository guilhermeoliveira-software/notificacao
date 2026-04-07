# Projeto Notificação

## Descrição

Este projeto é uma aplicação Spring Boot desenvolvida para gerenciar e enviar notificações. Ele utiliza Java 21 e Gradle para construção, com foco principal no envio de e-mails transacionais e informativos. A arquitetura modular permite fácil integração e escalabilidade.

## Tecnologias Utilizadas

As principais tecnologias e ferramentas utilizadas neste projeto incluem:

*   **Java 21**: Linguagem de programação principal.
*   **Spring Boot 3.2.5**: Framework para construção de aplicações Java robustas e eficientes.
*   **Gradle**: Ferramenta de automação de build.
*   **Spring Boot Starter Mail**: Para o envio de e-mails.
*   **Spring Boot Starter Thymeleaf**: Para a criação de templates de e-mail.
*   **Spring Boot Starter Web**: Para a construção de aplicações web.
*   **Lombok**: Para reduzir o código boilerplate.
*   **JUnit 5**: Para testes unitários e de integração.
*   **SonarQube**: Para análise de qualidade de código.
*   **Docker**: Para conteinerização da aplicação.

## Estrutura do Projeto

A estrutura do projeto segue as convenções de um projeto Spring Boot, com pacotes organizados por funcionalidade:

```
src/
├── main/
│   ├── java/
│   │   └── com/costadev/notificacao/
│   │       ├── business/             # Lógica de negócio e serviços
│   │       ├── controller/           # Controladores REST
│   │       └── infrasctruture/       # Configurações de infraestrutura e exceções
│   └── resources/            # Arquivos de configuração e templates
├── test/
│   └── java/
│       └── com/costadev/notificacao/ # Testes unitários e de integração
└── ...
```

## Como Executar

Para executar a aplicação localmente, siga os passos abaixo:

1.  **Pré-requisitos**:
    *   Java Development Kit (JDK) 21 ou superior.
    *   Gradle (opcional, pois o projeto inclui o wrapper Gradle).

2.  **Clonar o repositório**:

    ```bash
    git clone https://github.com/guilhermeoliveira-software/notificacao.git
    cd notificacao
    ```

3.  **Compilar e executar**:

    ```bash
    ./gradlew build
    java -jar build/libs/notificacao-0.0.1-SNAPSHOT.jar
    ```

    A aplicação estará disponível em `http://localhost:8080`.

## Configuração do Docker

O projeto inclui um `Dockerfile` para facilitar a conteinerização da aplicação:

1.  **Construir a imagem Docker**:

    ```bash
    docker build -t notificacao-app .
    ```

2.  **Executar o contêiner Docker**:

    ```bash
    docker run -p 8080:8080 notificacao-app
    ```

    A aplicação estará acessível em `http://localhost:8080` dentro do contêiner.

