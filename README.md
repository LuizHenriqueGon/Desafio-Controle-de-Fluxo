# Desafio Controle de Fluxo ☕

Este repositório contém a resolução do desafio de **Controle de Fluxo** proposto no Bootcamp de Java da DIO. O objetivo principal é exercitar a lógica de programação, manipulação de loops (`for`) e tratamento de exceções personalizadas em Java.

> **Status do Projeto:** ✅ Concluído (Com melhorias de UX)

## 📋 Descrição do Desafio

O sistema recebe dois parâmetros via terminal (números inteiros). Com base nesses números, ele deve:
1. Calcular a diferença entre o segundo e o primeiro número.
2. Imprimir no console uma contagem sequencial baseada nessa diferença.
3. Lançar uma exceção customizada (`ParametrosInvalidosException`) caso o primeiro parâmetro seja **maior** que o segundo.

### 🚀 Melhorias Implementadas (Diff)
Além do requisito básico, foram adicionadas funcionalidades para robustez e experiência do usuário (UX):
- **Tratamento de `InputMismatchException`**: O sistema não "quebra" se o usuário digitar letras ou símbolos. Ele avisa o erro e pede o número novamente.
- **Loop de Repetição (`while`)**: Se houver erro, o programa permite tentar novamente sem precisar reiniciar a aplicação.
- **Feedback Visual (ANSI Colors)**: Mensagens de erro em 🔴 vermelho e sucesso em 🟢 verde para melhor leitura no terminal.

## 🛠️ Tecnologias Utilizadas

- **Java** (JDK 17+)
- **IDE** (VS Code / IntelliJ / Eclipse)
- **Git & GitHub** para versionamento

## 📂 Estrutura do Projeto

```bash
/src
  ├── Contador.java                  # Classe principal com a lógica e main
  └── ParametrosInvalidosException.java   # Exceção customizada (Business Rule)
```
## 💻 Como Executar

1.  **Clone este repositório:**

    ```bash
    git clone [https://github.com/SEU-USUARIO/desafio-controle-fluxo.git](https://github.com/SEU-USUARIO/desafio-controle-fluxo.git)
    ```

2.  **Acesse a pasta do projeto:**

    ```bash
    cd desafio-controle-fluxo/src
    ```

3.  **Compile os arquivos:**

    ```bash
    javac Contador.java
    ```

4.  **Execute o programa:**

    ```bash
    java Contador
    ```

## 🧪 Exemplos de Uso

**Cenário de Sucesso:**

```text
Entrada 1: 12
Entrada 2: 30
Resultado: O sistema imprimirá 18 linhas ("Imprimindo o número 1" ... "18")
```

**Cenário de Exceção de Negócio:**

```text
Entrada 1: 20
Entrada 2: 10
Resultado: 🔴 "O segundo parâmetro deve ser maior que o primeiro"
```

**Cenário de Entrada Inválida (Melhoria):**

```text
Entrada 1: "Teste"
Resultado: 🔴 "Entrada inválida! Por favor, digite apenas números inteiros."
```

## 👨‍💻 Autor

Desenvolvido por **Luiz Henrique Gonçalves**

  * **LinkedIn**: [Luiz Henrique Gonçalves](https://www.linkedin.com/in/luiz-henrique-goncalves/)
  * **GitHub**: [@LuizHenriqueGon](https://github.com/LuizHenriqueGon)


