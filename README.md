# Trabalho de POO II: Corrida Maluca

## Descrição do problema

Corrida Maluca: É um jogo de corrida onde os usuários podem personalizar seus carros como desejarem, vence o melhor carro, porém a sorte também deve ser sua aliada, pois você vai precisar de habilidades certas para sobreviver às diversas provações que a pista de corrida vai lhe colocar. As habilidades são momentâneas e só sua sorte vai dizer se ela vai lhe ajudar naquele momento ou não, pois ela é aleatória e dura apenas o suficiente para sobreviver. Os desafios atuais na pista serão feitos de forma  sorteada, caso o carro possua uma habilidade útil, esta será ativada. Inicialmente, os carros não terão habilidade, e esta será adquirida durante o trajeto, de forma aleatória, antes do desafio ser acionado. Exemplo, a pista lança o desafio “Erupção Vulcânica” e o carro atualmente possui a habilidade “À prova de fogo”, logo como ele terá imunidade ao desafio ao ativar sua habilidade.

---

## Padrões utilizados

- Decorator: Podemos usar o padrão Decorator para adicionar recursos adicionais aos instâncias de carro existentes. Assim, podemos implementar a capacidade de personalizar a aparência do carro, adicionando adesivos, mudando a cor da pintura ou cor do farol. Cada recurso adicional pode ser implementado como um decorador separado, que envolve o objeto do carro original. Dessa forma, podemos adicionar recursos conforme necessário, sem afetar o comportamento do objeto de carro original.

- Observer: Podemos usar o padrão Observer para controlar o comportamento do carro durante o trajeto, de modo que a pista será o objeto observado e que possui um comportamento próprio que influenciará todos os seus observadores, os carros.

- Strategy: Podemos usar o padrão Strategy para implementar diferentes habilidades nos carros. Cada habilidade pode ser implementada como uma classe separada, implementando uma interface comum. 


---