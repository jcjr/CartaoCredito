
Este é um aplicativo Java simples para identificar a bandeira de um cartão de crédito a partir do número informado pelo usuário.

## Como funciona

O programa solicita ao usuário que digite o número do cartão de crédito no console. Em seguida, identifica a bandeira do cartão com base nos primeiros dígitos do número informado e exibe o resultado.

### Bandeiras suportadas

- Visa
- MasterCard
- American Express
- Discover
- JCB
- Diners Club
- Diners Club (Carte Blanche)
- UnionPay
- Elo
- Hipercard
- Cabal
- Banescard
- Aura

Caso o número não corresponda a nenhuma das bandeiras acima, será exibido "Desconhecida".

## Como executar

1. Abra o terminal na pasta do projeto.

2. Compile o arquivo Java:

   ```
   javac CartaoCredito.java
   ```

3. Execute o programa:

   ```
   java CartaoCredito
   ```

4. Digite o número do cartão de crédito quando solicitado.

## Exemplo de uso

```
Digite o número do cartão de crédito: 
4111111111111111
A bandeira do cartão é: Visa
```