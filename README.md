# lista_exercicios_java
Exercícios para aprendizado de Java.

### 1 - O que é esse número?

### 2 - Fibonacci

### 3 - MultiplicaAí

### 4 - Pirâmide de números

### 5 - Duplicados não!

Escreva um código que encontre os elementos em comum que existem em dois arrays e imprima no console quais são esses elementos, um a um.

*Exemplo com as seguintes entradas:*
```
array1 => "Morango", "Banana", "Maçã", "Uva", "Caqui"
array2 => "Manga", "Caqui", "Morango", "Amora"
```
*A saída seria:*
```
Morango
Caqui
```

### 6 - Holidayzer

Vamos criar uma aplicação Java que será um calendário de feriados! Para isso, queremos:

- Uma função que imprime a lista com todos os feriados
- Uma função que recebe uma data como parâmerto e retorna uma mensagem.
    - Se o dia não for feriado, imprime: “Dia **\<data-inserida>** não é feriado 🥲”
    - Se o dia for feriado, retorna: “Dia **\<data-inserida>** é **\<nome-do-feriado>**! 🎉”
- Os feriados devem ser objetos criados a partir de uma classe. Lembre-se de utilizar o conceito de encapsulamento (com `getters` e `setters` conforme a necessidade).
- Utilize mais parâmetros e funções caso sinta necessidade.

### Lista de Feriados
```
"01-01-2024" => "Confraternização Mundial"
"12-02-2024" => "Carnaval"
"13-02-2024" => "Carnaval"
"29-03-2024" => "Sexta-feira Santa"
"21-04-2024" => "Tiradentes"
"01-05-2024" => "Dia do Trabalho"
"30-05-2024" => "Corpus Christi"
"07-09-2024" => "Independência do Brasil"
"12-10-2024" => "Nossa Senhora Aparecida"
"02-11-2024" => "Finados"
"15-11-2024" => "Proclamação da República"
"20-11-2024" => "Dia Nacional de Zumbi e da Consciência Negra"
"25-12-2024" => "Natal"
```

### Dicas
- Para criar uma função na classe App ⇒ `public static <tipo> <nome-da-funcao> (params) { … }`
- Para criar uma variável que pode ser usada globalmente no App, adicione a palavra static antes da declaração ⇒ Ex: `static int numero = 5;`
- Essas dicas são necessárias pois o método `main()` precisa ser estático 😄

### 7 - APItização dos Feriados

Transforme o exercício anterior em uma API! As rotas à seguir são correspondentes às funções descritas:
- **GET** `/holidays`
- **GET** `/holidays/:date` (data no formato `30-05-2024`)