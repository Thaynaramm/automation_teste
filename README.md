# 🧪 Automação de Testes Web - DemoQA

Este projeto demonstra a implementação de uma estrutura de automação robusta utilizando **Java** e **Selenide** para validar componentes interativos da plataforma [DemoQA](https://demoqa.com/login). O foco principal é a criação de testes escaláveis, de fácil manutenção e prontos para integração em pipelines de **CI/CD**.

## 🎯 Objetivo do Projeto

Validar a integridade funcional de componentes críticos de UI, garantindo que a experiência do usuário não seja comprometida por regressões. Este projeto aplica o conceito de **Prevenção de Defeitos**, onde o QA atua como guardião da qualidade desde as etapas iniciais do desenvolvimento.

## 🛠️ Tecnologias Utilizadas

* **Java**: Linguagem base para o desenvolvimento dos scripts.
* **Selenide**: Framework focado em simplicidade e estabilidade para testes de UI (baseado em Selenium).
* **Maven**: Gerenciador de dependências e automação de builds.
* **JUnit/TestNG**: Framework para organização e execução das suítes de teste.
* **Allure Reports/ExtentReports**: Para visualização clara dos resultados dos testes.

---

## 📌 Cobertura de Testes

A automação cobre os seguintes elementos interativos:

* **Autenticação**: Fluxo de login e validação de segurança.
* **Formulários**: Preenchimento e submissão de dados complexos.
* **Componentes de UI**: Interação com botões, caixas de seleção (checkboxes) e botões de rádio.
* **Tabelas Dinâmicas**: Validação de dados em grids e tabelas interativas.

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

* Java JDK (11 ou superior) instalado.
* Maven configurado no sistema.

### Execução Local

1. Clone o repositório:
```bash
git clone https://github.com/Thaynaramm/automation_teste.git

2. Navegue até a pasta do projeto:
```bash
cd TesteAutomatizados
3. Execute os testes via Maven:
```bash
mvn clean test

## ⛓️ Integração com CI/CD (Jenkins)

Como parte da estratégia de **Quality Engineering**, este projeto está preparado para ser executado no **Jenkins**, permitindo:

* **Feedback Rápido**: Execução automática a cada novo código submetido.
* **Quality Gates**: Impedir que builds com falhas críticas avancem no pipeline.
* **Relatórios Automatizados**: Publicação de resultados após cada execução para análise do time.

## 👩‍💻 Autora

**Thaynara Monteiro
