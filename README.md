# Conta Bancária 

Este projeto implementa um simples sistema de conta bancária usando Cucumber para Desenvolvimento Orientado a Comportamento (BDD). O sistema permite que clientes, tanto especiais quanto comuns, realizem transações, como saques.

## Sumário

- [Funcionalidades](#funcionalidades)
- [Cenários](#cenários)
- [Como Usar](#como-usar)

## Funcionalidades

- **Tipos de Cliente:** Suporta clientes especiais e comuns.
- **Saque:** Os clientes podem solicitar saques.
- **Atualização de Saldo:** O sistema atualiza o saldo da conta conforme necessário.

## Cenários

### Cenário 1: Cliente com Saldo Negativo

#### Dado
- Um cliente especial com saldo atual de -200 reais.

#### Quando
- Um saque de 100 reais é solicitado.

#### Então
- O saque deve ser processado, e o saldo da conta deve ser atualizado para -300 reais.

### Cenário 2: Cliente Comum com Saldo Negativo

#### Dado
- Um cliente comum com saldo atual de -200 reais.

#### Quando
- Um saque de 200 reais é solicitado.

#### Então
- O saque não deve ser processado, e uma mensagem de fundos insuficientes deve ser retornada.

## Como Usar

1. Clone o repositório.
    ```bash
    git clone https://github.com/danilobarros3/Conta-Banc-ria-BDD
    ```

2. Execute os testes do Cucumber.
    ```bash
    mvn test
    ```


