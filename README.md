# 📧 Notificação por E-mail

Microserviço desacoplado responsável pelo envio de e-mails e lembretes do ecossistema de agendamento de tarefas, com templates dinâmicos via **Thymeleaf**.

🔗 **API em produção:** [notificacao-production.up.railway.app](https://notificacao-production.up.railway.app)

---

## 📌 Sobre o Projeto

Este serviço foi projetado para ser facilmente acoplado a qualquer outro microserviço que precise enviar notificações por e-mail. Ele garante que os usuários recebam lembretes claros e personalizados sobre suas tarefas agendadas.

| Serviço | Responsabilidade |
|---|---|
| [BFF Agendador](https://github.com/guilhermeoliveira-software/bff-agendador-tarefas) | Orquestração e gateway para o frontend |
| [Gestão de Usuários](https://github.com/guilhermeoliveira-software/usuario) | Autenticação e gerenciamento de perfis |
| [Agendador de Tarefas](https://github.com/guilhermeoliveira-software/agendador-tarefas) | Ciclo de vida e agendamento das tarefas |
| **Notificação por E-mail** (este) | Envio de e-mails e lembretes |

---

## 🚀 Funcionalidades

- Envio de e-mails automáticos via **SMTP (Gmail)**
- Templates dinâmicos e personalizados com **Thymeleaf**
- Gerenciamento de estados das notificações via **ENUMs**
- Fácil integração com qualquer microserviço do ecossistema
- Pipeline de CI/CD automatizado com **GitHub Actions**
- Análise de qualidade de código com **SonarQube**

---

## 🛠️ Tecnologias

- **Java 21**
- **Spring Boot 3**
- **Spring Mail (JavaMailSender)**
- **Thymeleaf**
- **Docker**
- **CI/CD com GitHub Actions**
- **SonarQube**

---

## 📁 Estrutura do Projeto

```
src/
└── main/
    └── java/
        └── com/costadev/notificacao/
            ├── business/          # Lógica de envio de e-mails
            ├── controller/        # Endpoints REST
            └── infrastructure/    # Configurações de e-mail e templates
    └── resources/
        └── templates/             # Templates HTML do Thymeleaf
```

---

## ⚙️ Como Executar Localmente

### Pré-requisitos
- Java 21+
- Docker
- Conta Gmail com **App Password** configurada

### Passos

```bash
# Clone o repositório
git clone https://github.com/guilhermeoliveira-software/notificacao.git
cd notificacao

# Configure as variáveis de ambiente
# Edite o application.yaml com suas credenciais

# Suba com Docker
docker build -t notificacao .
docker run -p 8082:8082 notificacao
```

A API estará disponível em: `http://localhost:8082`

---

## 🌍 Variáveis de Ambiente

| Variável | Descrição |
|---|---|
| `MAIL_USERNAME` | E-mail remetente (Gmail) |
| `MAIL_PASSWORD` | App Password do Gmail |
| `MAIL_NOME_REMETENTE` | Nome exibido no e-mail |

> ⚠️ Nunca exponha credenciais de e-mail no código. Use sempre variáveis de ambiente.

---

## 📨 Como Configurar o Gmail

1. Acesse [myaccount.google.com/apppasswords](https://myaccount.google.com/apppasswords)
2. Gere uma **App Password** para o projeto
3. Use essa senha na variável `MAIL_PASSWORD`

---

## 👨‍💻 Autor

**José Guilherme Da Costa Oliveira**
- 💼 [LinkedIn](https://www.linkedin.com/in/guilherme-costa-oliveiraa/)
- 🐙 [GitHub](https://github.com/guilhermeoliveira-software)
