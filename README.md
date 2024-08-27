# Projeto de Seleção de Candidatos

Este projeto em Java simula um processo de seleção de candidatos com base em um valor de salário pretendido. O código analisa candidatos, seleciona aqueles que possuem um salário pretendido dentro de um intervalo especificado, e tenta entrar em contato com os selecionados.

## Funcionalidades

- **Validação de Parâmetros**: Garante que o segundo parâmetro seja maior que o primeiro, lançando uma exceção se não for o caso.
- **Análise de Candidatos**: Gera um valor aleatório de salário pretendido para cada candidato e decide se ele deve ser selecionado para contato com base em um valor base.
- **Tentativa de Contato**: Tenta entrar em contato com os candidatos selecionados até três vezes. Se o contato for bem-sucedido, a informação é registrada.

## Estrutura do Código

- **Main.java**: O ponto de entrada do programa. Responsável por iniciar o processo, realizar a contagem de candidatos, analisar os candidatos, e tentar entrar em contato com os selecionados.
- **Candidato.java**: (presumivelmente) uma classe que representa um candidato, com métodos para armazenar seus dados e simular uma tentativa de contato.

## Como Executar

1. Certifique-se de ter o Java instalado em seu sistema.
2. Clone este repositório.
3. Compile e execute o programa com os seguintes comandos:

    ```bash
    javac Main.java
    java Main
    ```

4. Siga as instruções no terminal para inserir os parâmetros de contagem e analisar os candidatos.

## Exemplo de Execução

```plaintext
Digite o primeiro parâmetro
1
Digite o segundo parâmetro
5
Ligar para candidato: 1 | Salário pretendido: 1839.89
Ligar com contra proposta para candidato: 2 | Salário pretendido: 2000.0
Ligar para candidato: 3 | Salário pretendido: 1943.76
4 - Valor acima do esperado | Salário pretendido: 2500.23
Ligar para candidato: 5 | Salário pretendido: 1500.57
-----------------------------
Lista de Candidatos Selecionados
Candidato 1 | Salário pretendido: 1839.89
Candidato 2 | Salário pretendido: 2000.0
Candidato 3 | Salário pretendido: 1943.76
Candidato 5 | Salário pretendido: 1500.57
-----------------------------
Entrando em contato:
Contato realizado com: Candidato 1 | Salário pretendido: 1839.89 na 1 tentativa.
Contato realizado com: Candidato 2 | Salário pretendido: 2000.0 na 2 tentativa.
Não conseguimos contato com: Candidato 3 | Salário pretendido: 1943.76
Contato realizado com: Candidato 5 | Salário pretendido: 1500.57 na 1 tentativa.
```
## Exceções Personalizadas
O projeto inclui uma exceção personalizada ParametrosInvalidosException que é lançada se os parâmetros fornecidos forem inválidos (ou seja, se o primeiro parâmetro for maior que o segundo).

```plaintext
class ParametrosInvalidosException extends Exception {
    @Override
    public String getMessage() {
        return "O segundo parâmetro deve ser maior que o primeiro.";
    }
}
```

## Considerações Finais
Este projeto serve como uma introdução ao uso de arrays, listas e manipulação básica de exceções em Java. Pode ser expandido para incluir mais funcionalidades, como persistência de dados, interface gráfica, e integração com banco de dados.

### Contribuições
Contribuições são bem-vindas! Se você encontrar bugs ou quiser sugerir melhorias, fique à vontade para abrir uma issue ou enviar um pull request.

### Licença
Este projeto está licenciado sob os termos da licença MIT. Consulte o arquivo LICENSE para mais informações.
